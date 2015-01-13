/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.borcellippa.resources.media;

import java.io.Serializable;

/**
 *
 * @author Fede
 */
public class Media implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String path;

    /**
     * Get the value of path
     *
     * @return the value of path
     */
    public String getPath() {
        return path;
    }

    /**
     * Set the value of path
     *
     * @param path new value of path
     */
    public void setPath(String path) {
        this.path = path;
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
        if (!(object instanceof Media)) {
            return false;
        }
        Media other = (Media) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.coinquilini.media.Media[ id=" + id + " ]";
    }
    
}
