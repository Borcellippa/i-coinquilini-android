package com.borcellippa.utility;


import android.app.Application;

import com.borcellippa.resources.utente.Utente;

public class GlobalClass extends Application {

    private Utente utente;
    private String ip;

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }


    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }


}