package com.borcellippa.iconquilini;

import org.apache.http.Header;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.borcellippa.resources.casa.casa.Casa;
import com.borcellippa.resources.utente.Utente;
import com.borcellippa.utility.Utility;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import java.io.UnsupportedEncodingException;

/**
 * Login Activity Class
 */
public class LoginActivity extends Activity {


    private String TAG = "Login_Coinquilini";

    // Progress Dialog Object
    ProgressDialog prgDialog;
    // Error Msg TextView Object
    TextView errorMsg;
    // Email Edit View Object
    EditText emailET;
    // Passwprd Edit View Object
    EditText pwdET;
    // IP Edit View Object
    EditText ipET;


    // autocompletamento email
    private static final String[] EMAIL = new String[]{
            "mober@hotmail.it", "mattiasappa@gmail.com", "ciccicicci99@libero.it", "prova@hotmail.it", "p.g@h.it"
    };

    // autocompletamento indiritto ip
    private static final String[] IP = new String[]{
            "10.17.2.242", "10.17.2.254", "172.16.44.186", "192.168.43.186", "192.168.1.136"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // In the onCreate method
        Log.d(TAG, "Application Start");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        // Find Error Msg Text View control by ID
        errorMsg = (TextView) findViewById(R.id.login_error);


        // Find Email Edit View control by ID
        emailET = (EditText) findViewById(R.id.loginEmail);
        // richiamo la textview su cui attivo l'autocompletamento per settare le impostazioni
        AutoCompleteTextView email = (AutoCompleteTextView) findViewById(R.id.loginEmail);
        ArrayAdapter<String> emailAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, EMAIL);
        email.setAdapter(emailAdapter);

        // Find Password Edit View control by ID
        pwdET = (EditText) findViewById(R.id.loginPassword);

        ipET = (EditText) findViewById(R.id.loginIp);
        AutoCompleteTextView ip = (AutoCompleteTextView) findViewById(R.id.loginIp);
        ArrayAdapter<String> ipAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, IP);
        ip.setAdapter(ipAdapter);


        // Instantiate Progress Dialog object
        prgDialog = new ProgressDialog(this);
        // Set Progress Dialog Text
        prgDialog.setMessage("Please wait...");
        // Set Cancelable as False
        prgDialog.setCancelable(false);
    }

    /**
     * Method gets triggered when Login button is clicked
     *
     * @param view
     */
    public void loginUser(View view) {
        Log.d(TAG, "Test email e password");
        // Get Email Edit View Value
        String email = emailET.getText().toString();
        // Get Password Edit View Value
        String password = pwdET.getText().toString();

        String ip = ipET.getText().toString();

        Log.d(TAG, email);
        Log.d(TAG, password);
        Log.d(TAG, ip);

        // Instantiate Http Request Param Object
        RequestParams params = new RequestParams();
        // When Email Edit View and Password Edit View have values other than Null
        if (Utility.isNotNull(email) && Utility.isNotNull(password)) {
            // When Email entered is Valid
            if (Utility.validate(email)) {
                // Put Http parameter username with value of Email Edit View control
                params.put("email", email);
                // Put Http parameter password with value of Password Edit Value control
                params.put("password", password);

                // Invoke RESTful Web Service with Http parameters
                invokeWS(params, ip);
            }
            // When Email is invalid
            else {
                Toast.makeText(getApplicationContext(), "Please enter valid email", Toast.LENGTH_LONG).show();
            }
        }
        // When any of the Edit View control left blank
        else {
            Toast.makeText(getApplicationContext(), "Please fill the form, don't leave any field blank", Toast.LENGTH_LONG).show();
        }

    }

    /**
     * Method that performs RESTful webservice invocations
     *
     * @param params
     */
    public void invokeWS(RequestParams params, String ip) {
        // Show Progress Dialog
        prgDialog.show();
        // Make RESTful webservice call using AsyncHttpClient object
        AsyncHttpClient client = new AsyncHttpClient();
        Log.d(TAG, "invokeWS");
        //client.get("http://"+ ip + ":8080/I_coinquilini-war/webresources/Utente/testGet",params ,new AsyncHttpResponseHandler() {
        client.post("http://" + ip + ":8080/I_coinquilini-war/webresources/Utente/validaLogin", params, new AsyncHttpResponseHandler() {

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

                    Utente u = g.fromJson(response, Utente.class);

                    System.out.println("UTENTE: " + u.getCognome());
                    Log.d(TAG, u.getCognome());

                    Casa c = u.getCasa();

                    Log.d(TAG, c.getNomeCasa());

                    /*
                    *   Gestire errore login
                    *
                    * */


                    if (u != null) {
                        Toast.makeText(getApplicationContext(), "You are successfully logged in!", Toast.LENGTH_LONG).show();
                        // Navigate to Home screen
                        if (u.getCasa() != null) {
                            System.out.println("LOGIN OK");
                            navigatetoWelcomeActivity(u);
                        } else {
                            System.out.println("LOGIN KO");
                            navigatetoHomeErrorActivity(u);
                        }
                    }
                    // Else display error message
                    else {
                        errorMsg.setText("Credenziali errate");
                        Toast.makeText(getApplicationContext(), "Credenziali errate", Toast.LENGTH_LONG).show();
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
                    System.out.println("CODE: "+statusCode);
                    Toast.makeText(getApplicationContext(), "Unexpected Error occcured! [Most common Error: Device might not be connected to Internet or remote server is not up and running]", Toast.LENGTH_LONG).show();
                }
            }
        });
    }


    private void navigatetoHomeErrorActivity(Utente utente) {
        Intent homeIntent = new Intent(getApplicationContext(), HomeErrorActivity.class);
        homeIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(homeIntent);
    }

    /**
     * Method which navigates from Login Activity to Home Activity
     */
    public void navigatetoWelcomeActivity(Utente utente) {
        Intent homeIntent = new Intent(getApplicationContext(), Welcome.class);
        homeIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        homeIntent.putExtra("utente", utente);
        startActivity(homeIntent);
    }

}
