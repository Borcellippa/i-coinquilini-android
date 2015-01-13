/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.borcellippa.resources.casa.gestione_economica.debito;

import java.io.Serializable;

/**
 *
 * @author Fede
 */
public class Debito implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private float importo;
    private Long debitore;
    private Long creditore;

    /**
     * Get the value of creditore
     *
     * @return the value of creditore
     */
    public Long getCreditore() {
        return creditore;
    }

    /**
     * Set the value of creditore
     *
     * @param creditore new value of creditore
     */
    public void setCreditore(Long creditore) {
        this.creditore = creditore;
    }


    /**
     * Get the value of debitore
     *
     * @return the value of debitore
     */
    public Long getDebitore() {
        return debitore;
    }

    /**
     * Set the value of debitore
     *
     * @param debitore new value of debitore
     */
    public void setDebitore(Long debitore) {
        this.debitore = debitore;
    }


    /**
     * Get the value of importo
     *
     * @return the value of importo
     */
    public float getImporto() {
        return importo;
    }

    /**
     * Set the value of importo
     *
     * @param importo new value of importo
     */
    public void setImporto(float importo) {
        this.importo = importo;
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
        if (!(object instanceof Debito)) {
            return false;
        }
        Debito other = (Debito) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.coinquilini.casa.debito.Debito[ id=" + id + " ]";
    }
    
}
