package logica;

import datos.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

//Consulta SQL para validar los datos del login, para ingresar al sistema
public class LoginLog{
   Conexion objConexion = new Conexion();
   
     public boolean validarUsuario(String usuario, String clave){
       try {
              String sql = "select (1) from usuario where nomUsuario = '"+usuario+"' and clave = '"+clave+"'";
              Statement st = objConexion.getCon().createStatement();
              ResultSet rs = st.executeQuery(sql);
              if(rs.next()){ 
                  return true;
              }else{
                  return false;
              }
          } catch (SQLException ex) {
              Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
              return false;
          }
   }
     
     
}
