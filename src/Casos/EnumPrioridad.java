/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casos;

/**
 *
 * @author autoa
 */
public enum EnumPrioridad {
    ALTA ("Alta"),
    MEDIA ("Media"),
    BAJA ("Baja");
    
    private final String prioridad;
    
    private EnumPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getStatus() {
        return prioridad;
    }

    @Override
    public String toString() {
        return "Current location: " + prioridad;
    }
}
