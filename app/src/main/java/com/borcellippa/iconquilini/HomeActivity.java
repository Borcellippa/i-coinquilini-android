package com.borcellippa.iconquilini;

/**
 * Created by Mattia on 13/01/2015.
 */

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.borcellippa.resources.casa.bacheca.bacheca.Bacheca;
import com.borcellippa.resources.casa.bacheca.post.Post;
import com.borcellippa.resources.casa.casa.Casa;
import com.borcellippa.resources.utente.Utente;
import com.borcellippa.utility.PostAdapter;

import java.util.List;

/**
 * Home Screen Activity
 */
public class HomeActivity extends Activity {

    Utente u;
    TextView nomeCasa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Displays Home Screen
        setContentView(R.layout.home);


        u = (Utente) getIntent().getSerializableExtra("utente"); // accedo all'utente ottenuto nella activity precedente


        showHome();
    }

    private void showHome() {

        // nome casa
        nomeCasa = (TextView) findViewById(R.id.nomeCasa);
        nomeCasa.setText(u.getCasa().getNomeCasa());

        Casa c = u.getCasa();
        Bacheca b = c.getBacheca();
        List<Post> postList = b.getPosts();

        // elenco post
        ListView listView = (ListView) findViewById(R.id.listPost);
        PostAdapter postAd = new PostAdapter(this, R.layout.rowpost, postList);
        listView.setAdapter(postAd);


    }

}