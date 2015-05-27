/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.iescomercio.modelo;

/**
 *
 * @author Vespertino
 */
public class Empleado extends Persona{
    private float salarioBruto;
    
    public float calcularNeto () {
        return 0;
    }    
    
    @Override
    public void mostrar() { }
}
