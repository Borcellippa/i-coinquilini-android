/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.borcellippa.resources.cookies;


import com.borcellippa.resources.utente.Utente;

import java.io.Serializable;

public class UserCookie implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String token;
    private Utente utente;

    /**
     * Get the value of user
     *
     * @return the value of user
     */
    public Utente getUtente() {
        return utente;
    }

    /**
     * Set the value of user
     *
     * @param utente new value of user
     */
    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get the value of token
     *
     * @return the value of token
     */
    public String getToken() {
        return token;
    }

    /**
     * Set the value of token
     *
     * @param token new value of token
     */
    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserCookie)) {
            return false;
        }
        UserCookie other = (UserCookie) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.coinquilini.users.UserCookie[ id=" + id + " ]";
    }
    
}
