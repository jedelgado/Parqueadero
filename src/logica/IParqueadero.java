
package logica;

import java.security.Timestamp;
import java.util.Date;

// Interfaz que permite el registro de un vehiculo al parqueadero
public interface IParqueadero <T>{
    
    boolean agregar(T obj,Date fecha);
    boolean actualizar(T obj);
    boolean eliminar();
    boolean buscar();
}
