
package logica;

import javax.swing.table.DefaultTableModel;


public interface IParqueaderoLog<T> {
    boolean agregar(T obj);
    boolean eliminar(T obj);
    DefaultTableModel lista();
}
