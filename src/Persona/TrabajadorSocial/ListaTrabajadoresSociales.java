/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona.TrabajadorSocial;
import Lists.List;
/**
 *
 * @author llean
 */
public class ListaTrabajadoresSociales implements List <TrabajadorSocial> {
    private TrabajadorSocial list[];
    

    public ListaTrabajadoresSociales(int tamannio) {
        this.list = new TrabajadorSocial[tamannio];
    }
    
     @Override
    public boolean agregar(TrabajadorSocial t) {
        int max = list.length;
        for (int i = 0; i < max; i++) {
            if(list[i] == null){
                list[i]=t;
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean eliminar(TrabajadorSocial t) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == t) {
                list[i] = null;
                return true;
            }
        }
        return false;
    }
    
    @Override
    public TrabajadorSocial buscar(Object cedula) {
           int max = list.length;
        for (int i = 0; i <max; i++) {
            if(list[i].getCedula() == cedula){
                return list[i];
            }
        }
        return null;
    }
    
    public TrabajadorSocial[] buscarCanton(String canton) {
         int max = list.length;
         int cont = 0;
         TrabajadorSocial listCanton[] = new TrabajadorSocial[max];
        for (int i = 0; i <max; i++) {
            if(list[i].getCanton()==canton){
                listCanton[cont] = list[i];
                cont = cont+1;
            }
        }
        return listCanton;
    }
}

