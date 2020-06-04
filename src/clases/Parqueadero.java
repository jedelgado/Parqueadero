
package clases;

import java.util.Date;


public class Parqueadero {
   
    private String placa;
    private String ccPropietario;
    private String nomPropietario;
    private String tipoVehiculo;
    private int cascos;
    private Date fechaHora;
    
    //Constructor vacio
     public Parqueadero() {
    }

    //Constructor con parametros
    public Parqueadero(String placa, String ccPropietario, String nomPropietario, String tipoVehiculo, int cascos, Date fechaHora) {
        this.placa = placa;
        this.ccPropietario = ccPropietario;
        this.nomPropietario = nomPropietario;
        this.tipoVehiculo = tipoVehiculo;
        this.cascos = cascos;
        this.fechaHora = fechaHora;
    }
    
    // getters y setters 
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCcPropietario() {
        return ccPropietario;
    }

    public void setCcPropietario(String ccPropietario) {
        this.ccPropietario = ccPropietario;
    }

    public String getNomPropietario() {
        return nomPropietario;
    }

    public void setNomPropietario(String nomPropietario) {
        this.nomPropietario = nomPropietario;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getCascos() {
        return cascos;
    }

    public void setCascos(int cascos) {
        this.cascos = cascos;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
  
    
    
}
