
public class Marca {
	int id;
	String nombre;
	boolean activo;
	
	public Marca() {
		this.id = 0;
		this.nombre = "";
		this.activo = false;
	}
	public Marca(int id, String nombre, boolean activo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.activo = activo;
	}
	public String mostrarDatos() {
		return "Marca [id=" + id + ", nombre=" + nombre + ", activo=" + activo + "]";
	}
	
	
	
}
