package com.borcellippa.iconquilini;

/**
 * Created by Mattia on 13/01/2015.
 */

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.borcellippa.resources.casa.bacheca.bacheca.Bacheca;
import com.borcellippa.resources.casa.bacheca.post.Post;
import com.borcellippa.resources.casa.casa.Casa;
import com.borcellippa.resources.utente.Utente;
import com.borcellippa.utility.GlobalClass;
import com.borcellippa.utility.PostAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import org.apache.http.Header;

import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Home Screen Activity
 */
public class HomeActivity extends Activity {

    private String TAG = "Home_Coinquilini";

    // Progress Dialog Object
    ProgressDialog prgDialog;

    Utente u;
    String ip;
    TextView nomeCasa;

    PostAdapter postAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Displays Home Screen
        setContentView(R.layout.home);

        // Instantiate Progress Dialog object
        prgDialog = new ProgressDialog(this);
        // Set Progress Dialog Text
        prgDialog.setMessage("Please wait...");
        // Set Cancelable as False
        prgDialog.setCancelable(false);

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this).build();
        ImageLoader.getInstance().init(config);

        final GlobalClass globalVariable = (GlobalClass) getApplicationContext();

        u = globalVariable.getUtente();
        ip = globalVariable.getIp();

        Log.d(TAG, "onCreate");
        System.out.println(u);

        // updateUtente(u);

        showHome();
    }

    private void updateUtente(Utente u) {

        // Show Progress Dialog
        prgDialog.show();
        // Make RESTful webservice call using AsyncHttpClient object
        AsyncHttpClient client = new AsyncHttpClient();
        Log.d(TAG, "getUtente");
        RequestParams params = new RequestParams();
        params.put("email", u.getEmail());
        // Put Http parameter password with value of Password Edit Value control


        client.post("http://" + ip + ":8080/I_coinquilini-war/webresources/Utente/getUtente", params, new AsyncHttpResponseHandler() {

            // When the response returned by REST has Http response code '200'
            @Override
            public void onSuccess(int i, Header[] headers, byte[] byteResponse) {
                Log.d(TAG, "onSuccess");

                String response = null;
                try {
                    response = new String(byteResponse, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }

                System.out.println("COINQUILINI_RESPONSE: " + response);
                // Hide Progress Dialog
                prgDialog.hide();
                try {
                    Gson g = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").create();
                    Utente u;
                    u = g.fromJson(response, Utente.class);

                    System.out.println("UTENTE: " + u.getCognome());
                    Log.d(TAG, u.getCognome());


                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    Toast.makeText(getApplicationContext(), "Errore login", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] bytes, Throwable throwable) {

                Log.d(TAG, "onFailure");

                // Hide Progress Dialog
                prgDialog.hide();
                // When Http response code is '404'
                if (statusCode == 404) {
                    Toast.makeText(getApplicationContext(), "Requested resource not found", Toast.LENGTH_LONG).show();
                }
                // When Http response code is '500'
                else if (statusCode == 500) {
                    Toast.makeText(getApplicationContext(), "Something went wrong at server end", Toast.LENGTH_LONG).show();
                }
                // When Http response code other than 404, 500
                else {
                    System.out.println("CODE: " + statusCode);
                    Toast.makeText(getApplicationContext(), "Unexpected Error occcured! [Most common Error: Device might not be connected to Internet or remote server is not up and running]", Toast.LENGTH_LONG).show();
                }
            }

        });
    }

    private void showHome() {

        //getUtente()

        // nome casa
        nomeCasa = (TextView) findViewById(R.id.nomeCasa);
        nomeCasa.setText(u.getCasa().getNomeCasa());

        Casa c = u.getCasa();
        Bacheca b = c.getBacheca();
        List<Post> postList = b.getPosts();
        Collections.reverse(postList);

        // elenco post
        ListView listView = (ListView) findViewById(R.id.listPost);
        postAd = new PostAdapter(this, R.layout.rowpost, postList);
        postAd.notifyDataSetChanged();
        listView.setAdapter(postAd);


    }


    // ACTION BAR

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // action with ID action_refresh was selected
            case R.id.action_refresh:
                Toast.makeText(this, "Refresh selected", Toast.LENGTH_SHORT).show();


                //invokeWS(params, ip);

                break;
            // action with ID action_settings was selected
            /*case R.id.action_settings:
                Toast.makeText(this, "Settings selected", Toast.LENGTH_SHORT)
                        .show();
                break;
                */
            default:
                break;
        }

        return true;
    }


}