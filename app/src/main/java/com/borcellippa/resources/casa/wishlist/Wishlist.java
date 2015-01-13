/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.borcellippa.resources.casa.wishlist;



import com.borcellippa.resources.casa.gestione_economica.borsellino.Borsellino;
import com.borcellippa.resources.casa.wishlist.wishlistentry.WishlistEntry;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fede
 */
public class Wishlist implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Borsellino borsellino;
    private List<WishlistEntry> entries;

    /**
     * Get the value of entries
     *
     * @return the value of entries
     */
    public List<WishlistEntry> getEntries() {
        return entries;
    }

    /**
     * Set the value of entries
     *
     * @param entries new value of entries
     */
    public void setEntries(List<WishlistEntry> entries) {
        this.entries = entries;
    }
    
    public void addEntry(WishlistEntry we){
        if(entries != null)
            this.entries.add(we);
        else{
            entries = new ArrayList<WishlistEntry>();
            this.entries.add(we);
        }
    }


    /**
     * Get the value of borsellino
     *
     * @return the value of borsellino
     */
    public Borsellino getBorsellino() {
        return borsellino;
    }

    /**
     * Set the value of borsellino
     *
     * @param borsellino new value of borsellino
     */
    public void setBorsellino(Borsellino borsellino) {
        this.borsellino = borsellino;
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
        if (!(object instanceof Wishlist)) {
            return false;
        }
        Wishlist other = (Wishlist) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.coinquilini.casa.wishlist.Wishlist[ id=" + id + " ]";
    }
    
}
