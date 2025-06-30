/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona.TrabajadorSocial;

import Personas.Persona;

/**
 *
 * @author llean
 */
public class TrabajadorSocial extends Persona {
    private String canton;
    
    //getters

    public String getCanton() {
        return canton;
    }
    
    //setters

    public void setCanton(String canton) {
        this.canton = canton;
    }
    
    //constructor

    public TrabajadorSocial(String canton, String cedula, String nombre, String correo, String telefono) {
        super(cedula, nombre, correo, telefono);
        this.canton = canton;
    }
    
    //toString

    @Override
    public String toString() {
        return "TrabajadorSocial"+ super.toString() +"canton=" + canton;
    }
    
    
    
}
