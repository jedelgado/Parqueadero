package clases;

//Superclase persona
public class Persona {
    
    private String idPersona;
    private String nomPersona;
    private String telPersona;
    
    //constructos sin parametros 
    public Persona() {
    }
    
    //Constructor con parametros 
    public Persona(String idPersona, String nomPersona, String telPersona) {
        
        this.idPersona = idPersona;
        this.nomPersona = nomPersona;
        this.telPersona = telPersona;
    }
    
    //getters y setters 
    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getNomPersona() {
        return nomPersona;
    }

    public void setNomPersona(String nomPersona) {
        this.nomPersona = nomPersona;
    }

    public String getTelPersona() {
        return telPersona;
    }

    public void setTelPersona(String telPersona) {
        this.telPersona = telPersona;
    }
    
 
    
}
