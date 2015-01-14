package com.borcellippa.iconquilini;

/**
 * Created by Mattia on 13/01/2015.
 */
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.borcellippa.resources.utente.Utente;

/**
 *
 * Home Screen Activity
 */
public class HomeActivity extends Activity {

    Utente u;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Displays Home Screen
        setContentView(R.layout.home);

        u = (Utente)getIntent().getSerializableExtra("utente");

       // TextView t = (TextView)findViewById(R.id.testoProva);
        //t.setText(u.toString());



    }

}