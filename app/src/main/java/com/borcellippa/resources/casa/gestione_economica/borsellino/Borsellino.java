/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.borcellippa.resources.casa.gestione_economica.borsellino;


import com.borcellippa.resources.casa.gestione_economica.debito.Debito;
import com.borcellippa.resources.casa.gestione_economica.spesa.Spesa;

import java.io.Serializable;
import java.util.List;
/**
 *
 * @author Fede
 */
public class Borsellino implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private List<Debito> debiti;
    private List<Spesa> storico_spese;

    /**
     * Get the value of storico_spese
     *
     * @return the value of storico_spese
     */
    public List<Spesa> getStorico_spese() {
        return storico_spese;
    }

    /**
     * Set the value of storico_spese
     *
     * @param storico_spese new value of storico_spese
     */
    public void setStorico_spese(List<Spesa> storico_spese) {
        this.storico_spese = storico_spese;
    }


    /**
     * Get the value of debiti
     *
     * @return the value of debiti
     */
    public List<Debito> getDebiti() {
        return debiti;
    }

    /**
     * Set the value of debiti
     *
     * @param debiti new value of debiti
     */
    public void setDebiti(List<Debito> debiti) {
        this.debiti = debiti;
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
        if (!(object instanceof Borsellino)) {
            return false;
        }
        Borsellino other = (Borsellino) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.coinquilini.casa.borsellino.Borsellino[ id=" + id + " ]";
    }
    
}
