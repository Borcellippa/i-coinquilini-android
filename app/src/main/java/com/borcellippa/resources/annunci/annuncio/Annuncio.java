/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.borcellippa.resources.annunci.annuncio;


import com.borcellippa.resources.utente.Utente;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Annuncio implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Utente autore;
    private String titolo;
    private String descrizione;
    private float prezzo;
    private String indirizzo;
    private String ncivico;
    private List<String> fotospath;
    private int postiTotali;
    private int postiLiberi;
    private String citta;
    private String latitudine;
    private String longitudine;
    private Date dataPubblicazione;

    /**
     * Get the value of dataPubblicazione
     *
     * @return the value of dataPubblicazione
     */
    public Date getDataPubblicazione() {
        return dataPubblicazione;
    }

    /**
     * Set the value of dataPubblicazione
     *
     * @param dataPubblicazione new value of dataPubblicazione
     */
    public void setDataPubblicazione(Date dataPubblicazione) {
        this.dataPubblicazione = dataPubblicazione;
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
     * Get the value of latitudine
     *
     * @return the value of latitudine
     */
    public String getLatitudine() {
        return latitudine;
    }

    /**
     * Set the value of latitudine
     *
     * @param latitudine new value of latitudine
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
     * Get the value of postiLiberi
     *
     * @return the value of postiLiberi
     */
    public int getPostiLiberi() {
        return postiLiberi;
    }

    /**
     * Set the value of postiLiberi
     *
     * @param postiLiberi new value of postiLiberi
     */
    public void setPostiLiberi(int postiLiberi) {
        this.postiLiberi = postiLiberi;
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


    /**
     * Get the value of fotospath
     *
     * @return the value of fotospath
     */
    public List<String> getFotospath() {
        return fotospath;
    }

    /**
     * Set the value of fotospath
     *
     * @param fotospath new value of fotospath
     */
    public void setFotospath(List<String> fotospath) {
        this.fotospath = fotospath;
    }


    /**
     * Get the value of ncivico
     *
     * @return the value of ncivico
     */
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


    /**
     * Get the value of prezzo
     *
     * @return the value of prezzo
     */
    public float getPrezzo() {
        return prezzo;
    }

    /**
     * Set the value of prezzo
     *
     * @param prezzo new value of prezzo
     */
    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }


    /**
     * Get the value of descrizione
     *
     * @return the value of descrizione
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Set the value of descrizione
     *
     * @param descrizione new value of descrizione
     */
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }


    /**
     * Get the value of titolo
     *
     * @return the value of titolo
     */
    public String getTitolo() {
        return titolo;
    }

    /**
     * Set the value of titolo
     *
     * @param titolo new value of titolo
     */
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }


    /**
     * Get the value of autore
     *
     * @return the value of autore
     */
    public Utente getAutore() {
        return autore;
    }

    /**
     * Set the value of autore
     *
     * @param autore new value of autore
     */
    public void setAutore(Utente autore) {
        this.autore = autore;
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
        if (!(object instanceof Annuncio)) {
            return false;
        }
        Annuncio other = (Annuncio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.coinquilini.annunci.annuncio.Annuncio[ id=" + id + " ]";
    }
    
}
