
public class Marca {
	// attr
	private int id;
	private String nombre;
	private boolean activo;

	public Marca() {
		this.id = 0;
		this.nombre = "";
		this.activo = false;
	}
	public Marca(int id, String nombre, boolean activo) {
		this.id = id;
		this.nombre = nombre;
		this.activo = activo;
	}
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
	public boolean isActivo() {
		return activo;
	} //oracle
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	public String mostrarDatos() {
		return "Marca [id=" + id + ", nombre=" + nombre + ", activo=" + activo + "]";
	}
	
	
	
}
