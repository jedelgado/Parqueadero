package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

//Creamos la conexión con la base de datos 
public class Conexion {
       
    private String driver="com.mysql.jdbc.Driver";
    private String cadenaConeccion="jdbc:mysql://localhost/clubpark";//"jdbc:mysql://localhost/clubpark"
    private String usuario="root";
    private String contraseña="";
    private Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    //iniamos la conexión
    public Conexion(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                con=DriverManager.getConnection("jdbc:mysql://localhost/clubpark", "root","");
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            //JOptionPane.showMessageDialog(null,"conexion correcta");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"No se pudo conectar"+ex.getMessage());
        }
    }

}
