package com.borcellippa.iconquilini;

import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.borcellippa.resources.utente.Utente;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.apache.http.Header;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;


public class Welcome extends ActionBarActivity {

    private String TAG = "Welcome";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Utente u = (Utente)getIntent().getSerializableExtra("utente");

        TextView benvenuto = (TextView)findViewById(R.id.benvenuto);
        benvenuto.setText(benvenuto.getText()+" "+u.getNome());

        AsyncHttpClient client = new AsyncHttpClient();
        Log.d(TAG, "invokeWS");
        //client.get("http://"+ ip + ":8080/I_coinquilini-war/webresources/Utente/testGet",params ,new AsyncHttpResponseHandler() {
        //client.post("http://" + ip + ":8080/I_coinquilini-war/webresources/Utente/validaLogin", params, new AsyncHttpResponseHandler() {
        RequestParams params = new RequestParams();
        params.add("citta", u.getCasa().getCitta());
        client.post("http://molten-ruler-747.appspot.com", params, new AsyncHttpResponseHandler() {

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

                System.out.println("WELCOME_RESPONSE: " + response);

                try {
                    JSONObject obj = new JSONObject(response);
                    if (!obj.getString("cod").equals("404")) {
                        Toast.makeText(getApplicationContext(), "Errore nel download del meteo!", Toast.LENGTH_LONG).show();
                    }
                    else {
                        JSONArray array = obj.getJSONArray("weather");
                        String tempString = array.getString(0);
                        JSONObject tempObj = new JSONObject(tempString);

                        //immagine
                        ImageView meteo = (ImageView)findViewById(R.id.immagineMeteo);
                        meteo.setImageURI(Uri.parse("http://openweathermap.org/img/w/"+tempObj.getString("icon")));

                        // testo
                        TextView textview = (TextView)findViewById(R.id.benvenuto);
                        textview.setText(tempObj.getString("description"));
                    }
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    Toast.makeText(getApplicationContext(), "Errore login", Toast.LENGTH_LONG).show();
                    e.printStackTrace();

                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] bytes, Throwable throwable) {

                Log.d(TAG, "onFailure");

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
                    Toast.makeText(getApplicationContext(), "Unexpected Error occcured! [Most common Error: Device might not be connected to Internet or remote server is not up and running]", Toast.LENGTH_LONG).show();
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_welcome, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
