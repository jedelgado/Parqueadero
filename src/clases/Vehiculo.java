package clases;

public class Vehiculo {
    private String placa;
    private String ccPropietario;
    private String nomPropietario;
    private int tipoVehiculo;
    private int cascos;
    
    //constructor vacio
    public Vehiculo() {
    }
    
    //constructor
    public Vehiculo(String placa, String ccPropietario, String nomPropietario, int tipoVehiculo, int cascos) {
        this.placa = placa;
        this.ccPropietario = ccPropietario;
        this.nomPropietario = nomPropietario;
        this.tipoVehiculo = tipoVehiculo;
        this.cascos = cascos;
    }
    
    
    //gettersy setters 
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

    public int getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(int tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getCascos() {
        return cascos;
    }

    public void setCascos(int cascos) {
        this.cascos = cascos;
    }
  
    
}



