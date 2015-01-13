/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.borcellippa.resources.casa.wishlist.wishlistentry;

import java.io.Serializable;
public class WishlistEntry implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String descrizione;
    private Boolean done;
    private int quantita;

    /**
     * Get the value of quantita
     *
     * @return the value of quantita
     */
    public int getQuantita() {
        return quantita;
    }

    /**
     * Set the value of quantita
     *
     * @param quantita new value of quantita
     */
    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    /**
     * Get the value of done
     *
     * @return the value of done
     */
    public Boolean getDone() {
        return done;
    }

    /**
     * Set the value of done
     *
     * @param done new value of done
     */
    public void setDone(Boolean done) {
        this.done = done;
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
        if (!(object instanceof WishlistEntry)) {
            return false;
        }
        WishlistEntry other = (WishlistEntry) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.coinquilini.casa.wishlist.WishlistEntry[ id=" + id + " ]";
    }
    
}
