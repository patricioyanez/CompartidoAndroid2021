
public abstract class Vehiculo implements IDescuento {
	private String patente;
	private String marca;
	private String color;
	private int costoServicio;
	
	public Vehiculo()
	{
		this.patente = "";
		this.marca = "";
		this.color = "";
		this.costoServicio = 0;
	}

	public Vehiculo(String patente, String marca, String color, int costoServicio) 
	{
		this.patente = patente;
		this.marca = marca;
		this.color = color;
		this.costoServicio = costoServicio;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCostoServicio() {
		return costoServicio;
	}

	public void setCostoServicio(int costoServicio) {
		this.costoServicio = costoServicio;
	}
	
	
	public String mostrarDatos() {
		return "==== Vehiculo ==== " + 
				"\npatente            = " + patente + 
				"\nmarca              = " + marca + 
				"\ncolor              = " + color + 
				"\ncosto del Servicio = " + costoServicio;
	}

	public abstract int totalPorPagar();
	
	
}