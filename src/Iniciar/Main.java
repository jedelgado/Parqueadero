
package Iniciar;

import logica.LoginLog;
import presentacion.LoginGui;


public class Main {

   
    public static void main(String[] args) {
        
        //Instanciamos la interfaz del login, donde inicia el administrador
        LoginGui objLoginGui = new LoginGui();
        objLoginGui.setLocationRelativeTo(null);
        objLoginGui.setVisible(true);
        
        
    }
    
}
