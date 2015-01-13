/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.borcellippa.resources.token;

import java.io.Serializable;

public class UniqueToken implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String token;

    /**
     * Get the value of token
     *
     * @return the value of token
     */
    public String getToken() {
        return token;
    }

    /**
     * Set the value of token
     *
     * @param token new value of token
     */
    public void setToken(String token) {
        this.token = token;
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
        if (!(object instanceof UniqueToken)) {
            return false;
        }
        UniqueToken other = (UniqueToken) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "borcellippa.coinquilini.UniqueToken[ id=" + id + " ]";
    }
    
}
