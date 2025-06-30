/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas.Victima;

import Lists.List;

/**
 *
 * @author rodol
 */
public class ListaVictima implements List <Victima> {
    
    Victima [] listaVictimas;

    public ListaVictima() {
        this.listaVictimas = new Victima[200];
    }
    @Override
    public boolean agregar(Victima t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(Victima t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Victima buscar(Object id) {
        String idt = id.toString();
        int max = listaVictimas.length;
        for (int i = 0; i < max; i++) {
            if (listaVictimas[i].getCedula().equalsIgnoreCase(idt)){
                return listaVictimas[i];
            }
        } 
        return null;
    }
    
    
    
}
