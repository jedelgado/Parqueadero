package clases;

public class Administrador extends Persona {
    
    private String codigo;

    //constructor sin parametros
    public Administrador() {
    }
    
     //Constructor Con parametros
    public Administrador(String codigo) {
        this.codigo = codigo;
    }

    public Administrador(String idPersona, String nomPersona, String telPersona,String codigo) {
        super(idPersona, nomPersona, telPersona);
        this.codigo = codigo;
    }
    
    //getters y setters 
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
   
    
}
