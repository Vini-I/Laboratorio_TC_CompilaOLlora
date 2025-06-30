/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Lists;

/**
 *
 * @author autoa
 */
public interface List <T>{
    
    public boolean agregar(T t);
    
    public boolean eliminar(T t);
    
    public T buscar(Object id);
}
