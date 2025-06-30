/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casos;

import java.time.LocalDate;
import Personas.Victima.Victima;

/**
 *
 * @author autoa
 */
public class Caso {
    private String id;
    private Victima victima;
    private String descripcion;
    private String tipo;
    private LocalDate fecha;
    private EnumPrioridad prioridad;

    public String getId() {
        return id;
    }

    public Victima getVictima() {
        return victima.id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    
    public EnumPrioridad getPrioridad() {
        return prioridad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrioridad(EnumPrioridad prioridad) {
        this.prioridad = prioridad;
    }

    public Caso(String id, Victima victima, String descripcion, String tipo, LocalDate fecha, EnumPrioridad prioridad) {
        this.id = id;
        this.victima = victima;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.fecha = fecha;
        this.prioridad = prioridad;
    }
    
    
    
}
