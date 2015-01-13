/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.borcellippa.resources.utente;


import com.borcellippa.resources.annunci.annuncio.Annuncio;
import com.borcellippa.resources.casa.bacheca.post.Post;
import com.borcellippa.resources.casa.casa.Casa;
import com.borcellippa.resources.casa.gestione_economica.debito.Debito;
import com.borcellippa.resources.casa.gestione_economica.spesa.Spesa;

import java.io.Serializable;
import java.util.List;

public class Utente implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String email;
    private String password;
    private String nome;
    private String cognome;
    private String telefono;
    private String data_nascita;
    private String nazionalita;
    private String g_access_token;
    private String fb_access_token;
    private String fb_user_id;
    private String foto_path;
    private String citta_natale;
    private String genere;
    private List<Annuncio> annunci;
    private Casa casa;
    private float affitto;
    private List<Debito> debiti;
    private List<Spesa> spese;
    private List<Post> posts;
    private int postUnread;

    /**
     * Get the value of notifiche
     *
     * @return the value of notifiche
     */
    public int getPostUnread() {
        return postUnread;
    }

    public void setPostUnread(int postUnread) {
        this.postUnread = postUnread;
    }

    
    private String tipoUtente;

    public String getTipoUtente() {
        return tipoUtente;
    }

    public void setTipoUtente(String tipoUtente) {
        this.tipoUtente = tipoUtente;
    }


    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Spesa> getSpese() {
        return spese;
    }

    public void setSpese(List<Spesa> spese) {
        this.spese = spese;
    }

    public List<Debito> getDebiti() {
        return debiti;
    }

    public void setDebiti(List<Debito> debiti) {
        this.debiti = debiti;
    }

    public float getAffitto() {
        return affitto;
    }

    public void setAffitto(float affitto) {
        this.affitto = affitto;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public List<Annuncio> getAnnunci() {
        return annunci;
    }

    public void setAnnunci(List<Annuncio> annunci) {
        this.annunci = annunci;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getCitta_natale() {
        return citta_natale;
    }

    public void setCitta_natale(String citta_natale) {
        this.citta_natale = citta_natale;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFoto_path() {
        return foto_path;
    }

    public void setFoto_path(String foto_path) {
        this.foto_path = foto_path;
    }

    public String getFb_user_id() {
        return fb_user_id;
    }
    public void setFb_user_id(String fb_user_id) {
        this.fb_user_id = fb_user_id;
    }

    public String getFb_access_token() {
        return fb_access_token;
    }

    public void setFb_access_token(String fb_access_token) {
        this.fb_access_token = fb_access_token;
    }
    public String getG_access_token() {
        return g_access_token;
    }

    public void setG_access_token(String g_access_token) {
        this.g_access_token = g_access_token;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }

    public String getData_nascita() {
        return data_nascita;
    }

    public void setData_nascita(String data_nascita) {
        this.data_nascita = data_nascita;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Utente)) {
            return false;
        }
        Utente other = (Utente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id + " " + nome + " " + cognome + " " + email + " " + genere + " " + password + " " + telefono + " " + data_nascita + " " + nazionalita + " " + g_access_token + " " + fb_access_token + " " + fb_user_id + " " + foto_path + " " + citta_natale;
    }  

}
