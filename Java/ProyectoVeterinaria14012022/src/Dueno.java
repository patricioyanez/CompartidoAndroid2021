
public class Dueno {

	private int rut ;
	private char dv;
	private String nombre ;
	private int telefono ;


	// sin constructor

	public Dueno() {
		this.rut = 0;
		this.dv = ' ';
		this.nombre = "";
		this.telefono =0;
	}

	// con constructor
	public Dueno(int rut, char dv, String nombre, int telefono) {
		this.rut = rut;
		this.dv = dv;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	// getter and setter

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public char getDv() {
		return dv;
	}

	public void setDv(char dv) {
		this.dv = dv;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	// m�todos customer	
	public String mostrarDatos() {
		return "Due�o\nrut=" + rut + "-" + dv + 
					"\nnombre=" + nombre + 
					"\ntelefono=" + telefono;		
	}
}
