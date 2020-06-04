package logica;

import clases.IngresarVehiculoClase;
import clases.Vehiculo;
import datos.Conexion;
import java.security.Timestamp;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class IngresarVehiculoLog implements IParqueadero<Vehiculo>{

    Conexion objConexion = new Conexion();
    
//    public void agregar3(String placa, String ccPropietario, String nomPropietario, int tipoVehiculo, int cascos, Date fecha) {
//          try {
//             java.sql.PreparedStatement pst = objConexion.getCon().prepareStatement("INSERT INTO  ingresavehiculo(placa,ccpropietario) VALUES (?,?)");
//             
//             pst.setString(1,placa);
//             pst.setString(2,ccPropietario);
//             pst.setString(3,nomPropietario);
//             pst.setInt(4,tipoVehiculo);
//             pst.setInt(5,cascos);
//     
//             pst.setDate(6, (java.sql.Date) fecha);
//             
//             
//             pst.executeLargeUpdate();
//        } catch (Exception e) {
//        }
//         
//    }

    //Metodo donde hacemos la consulta SQL y se agrega a la base de datos 
    @Override
    public boolean agregar(Vehiculo obj , Date fecha) {
        
         try {
             System.out.println("estoy en el metodo agregar ");
             java.sql.PreparedStatement pst = objConexion.getCon().prepareStatement("INSERT INTO  ingresavehiculo(placa,ccpropietario,nompropietario,tipovehiculo,cascos,fecha) VALUES (?,?,?,?,?,?)");
         
             SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
             String fecha1 = formatoFecha.format(fecha);
     
             pst.setString(1,obj.getPlaca());
             pst.setString(2,obj.getCcPropietario());
             pst.setString(3,obj.getNomPropietario());
             pst.setInt(4,obj.getTipoVehiculo());
             pst.setInt(5,obj.getCascos());           
             pst.setString(6, fecha1);
             System.out.println("efe  " + fecha.toString());
             
             pst.executeLargeUpdate();
        } catch (Exception e) {
                System.err.println("Error Para ejecutar."+e.getMessage());
        }
        return true;
    }

    @Override
    public boolean actualizar(Vehiculo obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean buscar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
    
  
}
