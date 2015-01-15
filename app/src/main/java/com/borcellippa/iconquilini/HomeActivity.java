package com.borcellippa.iconquilini;

/**
 * Created by Mattia on 13/01/2015.
 */

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.borcellippa.resources.casa.bacheca.bacheca.Bacheca;
import com.borcellippa.resources.casa.bacheca.post.Post;
import com.borcellippa.resources.casa.casa.Casa;
import com.borcellippa.resources.utente.Utente;
import com.borcellippa.utility.PostAdapter;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.util.Collections;
import java.util.List;

/**
 * Home Screen Activity
 */
public class HomeActivity extends Activity {

    private String TAG = "Home_Coinquilini";


    Utente u;
    TextView nomeCasa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Displays Home Screen
        setContentView(R.layout.home);

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this).build();
        ImageLoader.getInstance().init(config);


        u = (Utente) getIntent().getSerializableExtra("utente"); // accedo all'utente ottenuto nella activity precedente
        Log.d(TAG, "onCreate");
        System.out.println(u);
        showHome();
    }

    private void showHome() {

        // nome casa
        nomeCasa = (TextView) findViewById(R.id.nomeCasa);
        nomeCasa.setText(u.getCasa().getNomeCasa());

        Casa c = u.getCasa();
        Bacheca b = c.getBacheca();
        List<Post> postList = b.getPosts();

        Collections.reverse(postList);


        // elenco post
        ListView listView = (ListView) findViewById(R.id.listPost);
        PostAdapter postAd = new PostAdapter(this, R.layout.rowpost, postList);
        postAd.notifyDataSetChanged();
        listView.setAdapter(postAd);


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // action with ID action_refresh was selected
            case R.id.action_refresh:
                Toast.makeText(this, "Refresh selected", Toast.LENGTH_SHORT)
                        .show();
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