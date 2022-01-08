
public class Proveedor {
	private int rut;
	private char dv;
	private String nombre;
	public Proveedor() {

		this.rut = 0;
		this.dv = ' ';
		this.nombre = "";
	}
	public Proveedor(int rut, char dv, String nombre) {
		super();
		this.rut = rut;
		this.dv = dv;
		this.nombre = nombre;
	}
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
	
	public String mostrarDatos() {
		return "*** Proveedor *** \n rut=" + rut + "-" + dv + 
				", nombre=" + nombre;
	}
	
	
	
}
