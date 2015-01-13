/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.borcellippa.resources.casa.bacheca.bacheca;

import com.borcellippa.resources.casa.bacheca.post.Post;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Fede
 */
public class Bacheca implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private List<Post> posts;


    /**
     * Get the value of posts
     *
     * @return the value of posts
     */
    public List<Post> getPosts() {
        return posts;
    }

    /**
     * Set the value of posts
     *
     * @param posts new value of posts
     */
    public void setPosts(List<Post> posts) {
        this.posts = posts;
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
        if (!(object instanceof Bacheca)) {
            return false;
        }
        Bacheca other = (Bacheca) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.coinquilini.casa.bacheca.bacheca.Bacheca[ id=" + id + " ]";
    }
    
}
