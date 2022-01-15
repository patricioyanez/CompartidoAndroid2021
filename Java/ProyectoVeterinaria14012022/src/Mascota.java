
public class Mascota {
    private int id;
    private String nombre;
    private String tipo;
    private String raza;
    private Dueno dueno;
    
    //Constructores
    public Mascota() {
        this.id = 0;
        this.nombre = "";
        this.tipo = "";
        this.raza = "";
        this.dueno = null;
    }
    
    public Mascota(int id, String nombre, String tipo, String raza, Dueno dueno) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
        this.dueno = dueno;
    }

    //Getter y  Setter
    public int getId() {
    	return id;
    }


    public void setId(int id) {
    	this.id = id;
    }


    public String getNombre() {
    	return nombre;
    }


    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }


    public String getTipo() {
    	return tipo;
    }


    public void setTipo(String tipo) {
    	this.tipo = tipo;
    }


    public String getRaza() {
    	return raza;
    }


    public void setRaza(String raza) {
    	this.raza = raza;
    }
    

    public Dueno getDueno() {
        return dueno;
    }

    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }

    public String mostrarDatos() 
    {
        String datos = "|===== DATOS DE MASCOTA =====| " +
                        "\nId mascota: " + this.id + 
                        "\nNombre mascota : " + this.nombre.toUpperCase() +
                        "\nTipo mascota: " + this.tipo.toUpperCase() +                                
                        "\nRaza : " + this.raza +
                        "\n" + this.dueno.mostrarDatos(); // toString()
        return datos;
    }
}
