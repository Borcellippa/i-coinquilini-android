/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.borcellippa.resources.casa.calendario.eventi.mansione;

import com.borcellippa.resources.casa.calendario.eventi.evento.Evento;

public class Mansione extends Evento {
    private static final long serialVersionUID = 1L;
    private String durata;

    /**
     * Get the value of durata
     *
     * @return the value of durata
     */
    public String getDurata() {
        return durata;
    }

    /**
     * Set the value of durata
     *
     * @param durata new value of durata
     */
    public void setDurata(String durata) {
        this.durata = durata;
    }  
}
