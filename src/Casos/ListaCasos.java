/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casos;

import Lists.List;

/**
 *
 * @author autoa
 */
public class ListaCasos implements List <Caso> {
    private Caso[] casos;

    @Override
    public boolean agregar(Caso t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(Caso t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Caso buscar(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int contarPrioridades(EnumPrioridad prioridad){
        int cont = -1;
        for (int i = 0; i < casos.length; i++) {
            if (casos[i].getPrioridad() == prioridad)
                cont += 1;
        }
        return cont;
    }

    public ListaCasos(int tamanio) {
        this.casos = new Caso[tamanio];
    }
}
