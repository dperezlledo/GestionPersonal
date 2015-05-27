/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.iescomercio.modelo;

import java.util.Collection;

/**
 *
 * @author Vespertino
 */
public class Directivo extends Empleado{
    private String categoria;
    private Collection<Empleado> subordinados;

    public Directivo() { // Minimo 0
    }
    
    public Collection<Empleado> getSubordinados() {
        return subordinados;
    }
    
    
    
    
    
}
