
package clases;

import java.security.Timestamp;
import java.util.Date;
import logica.IngresarVehiculoLog;

//Clase ingresar vehiculo de la base de datos
public class IngresarVehiculoClase {
    
    IngresarVehiculoLog objIngresarVehiculoLog;
    Vehiculo objVehiculo = new Vehiculo();
    
    private Date fecha;
  
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
