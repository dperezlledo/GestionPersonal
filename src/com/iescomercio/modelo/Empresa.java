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
public class Empresa {
    private String domicilio;
    private String telefono;
    private String nombre;
    private Collection<Cliente> carteraClientes;
    private Collection<Empleado> plantilla;

    public Empresa() {
        
    }
    
    public void setDatosEmpleado(String nombre, int edad, int sb) {
        Empleado e = new Empleado();
        e.setNombre(nombre);
        e.setEdad(edad);
        e.setSalarioBruto(sb);
        if (!plantilla.contains(sb))
            this.plantilla.add(sb);
    }
    
    public Collection<Cliente> getCarteraClientes() {
        return carteraClientes;
    }
    
    public void addCliente(Cliente c) {
        if (!carteraClientes.contains(c))
            this.carteraClientes.add(c);
    }
    
    public void removeCliente(Cliente c) {
        if (carteraClientes.contains(c))
            this.carteraClientes.remove(c);
    }
    
    public void listaEmpleado() {       
        
        
    }
    
    public void listaClientes() {
        
    }
}
