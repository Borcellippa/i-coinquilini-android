/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.borcellippa.resources.casa.calendario;

import com.borcellippa.resources.casa.calendario.eventi.evento.Evento;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Fede
 */
public class Calendario implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private List<Evento> eventi;

    /**
     * Get the value of eventi
     *
     * @return the value of eventi
     */
    public List<Evento> getEventi() {
        return eventi;
    }

    /**
     * Set the value of eventi
     *
     * @param eventi new value of eventi
     */
    public void setEventi(List<Evento> eventi) {
        this.eventi = eventi;
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
        if (!(object instanceof Calendario)) {
            return false;
        }
        Calendario other = (Calendario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.coinquilini.casa.calendario.Calendario[ id=" + id + " ]";
    }
    
}
