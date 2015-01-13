/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.borcellippa.resources.casa.calendario.eventi.evento;

import java.io.Serializable;

/**
 *
 * @author Fede
 */
public class Evento implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String dataInizio;
    private String descrizione;
    private Boolean synced;
    private String colore;
    private String ricorrenza;


    /**
     * Get the value of ricorrenza
     *
     * @return the value of ricorrenza
     */
    public String getRicorrenza() {
        return ricorrenza;
    }

    /**
     * Set the value of ricorrenza
     *
     * @param ricorrenza new value of ricorrenza
     */
    public void setRicorrenza(String ricorrenza) {
        this.ricorrenza = ricorrenza;
    }


    /**
     * Get the value of colore
     *
     * @return the value of colore
     */
    public String getColore() {
        return colore;
    }

    /**
     * Set the value of colore
     *
     * @param colore new value of colore
     */
    public void setColore(String colore) {
        this.colore = colore;
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
     * Get the value of synced
     *
     * @return the value of synced
     */
    public Boolean isSynced() {
        return synced;
    }

    /**
     * Set the value of synced
     *
     * @param synced new value of synced
     */
    public void setSynced(Boolean synced) {
        this.synced = synced;
    }


    /**
     * Get the value of dataInizio
     *
     * @return the value of dataInizio
     */
    public String getDataInizio() {
        return dataInizio;
    }

    /**
     * Set the value of dataInizio
     *
     * @param dataInizio new value of dataInizio
     */
    public void setDataInizio(String dataInizio) {
        this.dataInizio = dataInizio;
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
        if (!(object instanceof Evento)) {
            return false;
        }
        Evento other = (Evento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.coinquilini.casa.calendario.eventi.evento.Evento[ id=" + id + " ]";
    }
    
}
