/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.borcellippa.resources.casa.bacheca.post;


import com.borcellippa.resources.media.Media;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Fede
 */
public class Post implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String contenuto;
    private Date dataPubblicazione;
    private Media media;
    private String autore;
    private String autore_img;
    private String autore_email;

    /**
     * Get the value of autore_email
     *
     * @return the value of autore_email
     */
    public String getAutore_email() {
        return autore_email;
    }

    /**
     * Set the value of autore_email
     *
     * @param autore_email new value of autore_email
     */
    public void setAutore_email(String autore_email) {
        this.autore_email = autore_email;
    }


    /**
     * Get the value of autore_img
     *
     * @return the value of autore_img
     */
    public String getAutore_img() {
        return autore_img;
    }

    /**
     * Set the value of autore_img
     *
     * @param autore_img new value of autore_img
     */
    public void setAutore_img(String autore_img) {
        this.autore_img = autore_img;
    }


    /**
     * Get the value of autore
     *
     * @return the value of autore
     */
    public String getAutore() {
        return autore;
    }

    /**
     * Set the value of autore
     *
     * @param autore new value of autore
     */
    public void setAutore(String autore) {
        this.autore = autore;
    }


    /**
     * Get the value of media
     *
     * @return the value of media
     */
    public Media getMedia() {
        return media;
    }

    /**
     * Set the value of media
     *
     * @param media new value of media
     */
    public void setMedia(Media media) {
        this.media = media;
    }


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
     * Get the value of contenuto
     *
     * @return the value of contenuto
     */
    public String getContenuto() {
        return contenuto;
    }

    /**
     * Set the value of contenuto
     *
     * @param contenuto new value of contenuto
     */
    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
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
        if (!(object instanceof Post)) {
            return false;
        }
        Post other = (Post) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.coinquilini.casa.bacheca.post.Post[ id=" + id + " ]";
    }
    
}
