/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.borcellippa.resources.casa.casa;



import com.borcellippa.resources.casa.bacheca.bacheca.Bacheca;
import com.borcellippa.resources.casa.calendario.Calendario;
import com.borcellippa.resources.casa.wishlist.Wishlist;
import com.borcellippa.resources.utente.Utente;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fede
 */
public class Casa implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String nomeCasa;
    private String indirizzo;
    private String ncivico;
    private int postiTotali;
    private int postiOccupati;
    private String latitudine;
    private String longitudine;
    private int inCasa;
    private Calendario calendario;
    private List<Long> utenti;
    private Bacheca bacheca;
    private Wishlist wishlist;
    private String codiceCasa;
    private String citta;

    public void addInquilino(Utente u) {
        if (utenti != null) {
            this.utenti.add(u.getId());
        } else {
            utenti = new ArrayList<>();
            this.utenti.add(u.getId());
        }
        this.postiOccupati++;
    }

    public void removeInquilino(Utente u) {
        if (utenti != null) {
            this.utenti.remove(u.getId());
            this.postiOccupati--;
        }
    }

    /**
     * Get the value of codiceCasa
     *
     * @return the value of codiceCasa
     */
    public String getCodiceCasa() {
        return codiceCasa;
    }

    /**
     * Set the value of codiceCasa
     *
     * @param codiceCasa new value of codiceCasa
     */
    public void setCodiceCasa(String codiceCasa) {
        this.codiceCasa = codiceCasa;
    }

    /**
     * Get the value of nomeCasa
     *
     * @return the value of nomeCasa
     */
    public String getNomeCasa() {
        return nomeCasa;
    }

    /**
     * Set the value of nomeCasa
     *
     * @param nomeCasa new value of nomeCasa
     */
    public void setNomeCasa(String nomeCasa) {
        this.nomeCasa = nomeCasa;
    }

    /**
     * Get the value of wishlist
     *
     * @return the value of wishlist
     */
    public Wishlist getWishlist() {
        return wishlist;
    }

    /**
     * Set the value of wishlist
     *
     * @param wishlist new value of wishlist
     */
    public void setWishlist(Wishlist wishlist) {
        this.wishlist = wishlist;
    }

    /**
     * Get the value of bacheca
     *
     * @return the value of bacheca
     */
    public Bacheca getBacheca() {
        return bacheca;
    }

    /**
     * Set the value of bacheca
     *
     * @param bacheca new value of bacheca
     */
    public void setBacheca(Bacheca bacheca) {
        this.bacheca = bacheca;
    }

    /**
     * Get the value of utenti
     *
     * @return the value of utenti
     */
    public List<Long> getUtenti() {
        return utenti;
    }

    /**
     * Set the value of utenti
     *
     * @param utenti new value of utenti
     */
    public void setUtenti(List<Long> utenti) {
        this.utenti = utenti;
    }

    /**
     * Get the value of calendario
     *
     * @return the value of calendario
     */
    public Calendario getCalendario() {
        return calendario;
    }

    /**
     * Set the value of calendario
     *
     * @param calendario new value of calendario
     */
    public void setCalendario(Calendario calendario) {
        this.calendario = calendario;
    }

    /**
     * Get the value of inCasa
     *
     * @return the value of inCasa
     */
    public int getInCasa() {
        return inCasa;
    }

    /**
     * Set the value of inCasa
     *
     * @param inCasa new value of inCasa
     */
    public void setInCasa(int inCasa) {
        this.inCasa = inCasa;
    }

    /**
     * Get the value of longitudine
     *
     * @return the value of longitudine
     */
    public String getLongitudine() {
        return longitudine;
    }

    /**
     * Set the value of longitudine
     *
     * @param longitudine new value of longitudine
     */
    public void setLongitudine(String longitudine) {
        this.longitudine = longitudine;
    }

    /**
     * Get the value of lat
     *
     * @return the value of lat
     */
    public String getLatitudine() {
        return latitudine;
    }

    /**
     * Set the value of lat
     *
     * @param latitudine new value of lat
     */
    public void setLatitudine(String latitudine) {
        this.latitudine = latitudine;
    }

    /**
     * Get the value of citta
     *
     * @return the value of citta
     */
    public String getCitta() {
        return citta;
    }

    /**
     * Set the value of citta
     *
     * @param citta new value of citta
     */
    public void setCitta(String citta) {
        this.citta = citta;
    }

    /**
     * Get the value of postiOccupati
     *
     * @return the value of postiOccupati
     */
    public int getPostiOccupati() {
        return postiOccupati;
    }

    /**
     * Set the value of postiOccupati
     *
     * @param postiOccupati new value of postiOccupati
     */
    public void setPostiOccupati(int postiOccupati) {
        this.postiOccupati = postiOccupati;
    }

    /**
     * Get the value of postiTotali
     *
     * @return the value of postiTotali
     */
    public int getPostiTotali() {
        return postiTotali;
    }

    /**
     * Set the value of postiTotali
     *
     * @param postiTotali new value of postiTotali
     */
    public void setPostiTotali(int postiTotali) {
        this.postiTotali = postiTotali;
    }

    public String getNcivico() {
        return ncivico;
    }

    /**
     * Set the value of ncivico
     *
     * @param ncivico new value of ncivico
     */
    public void setNcivico(String ncivico) {
        this.ncivico = ncivico;
    }

    /**
     * Get the value of indirizzo
     *
     * @return the value of indirizzo
     */
    public String getIndirizzo() {
        return indirizzo;
    }

    /**
     * Set the value of indirizzo
     *
     * @param indirizzo new value of indirizzo
     */
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        if (!(object instanceof Casa)) {
            return false;
        }
        Casa other = (Casa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.coutenti.casa.ViewCasa[ id=" + id + " ]";
    }

}
