/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas.Victima;

import Personas.Persona;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author rodol
 */
public class Victima extends Persona {
    
    private LocalDate fechaNacimiento;
    private String genero;
    private String direccion;

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }
    
    @Override
    public String getNombre(){
        return String.valueOf(super.getNombre().hashCode());
    }
    
    public int calcularEdad(LocalDate fechaNacimiento){
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public Victima(String cedula, String nombre, String correo, String telefono, LocalDate fechaNacimiento, String genero, String direccion) {
        super(String.valueOf(cedula.hashCode()), nombre, correo, telefono);
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Victima: " + super.getCedula() + super.getNombre().hashCode() + " Fecha de Nacimiento" + fechaNacimiento + " Genero: " + genero;
    }
}
