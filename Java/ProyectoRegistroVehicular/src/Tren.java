
public class Tren extends Vehiculo {
	private int cantidadVagones;
	private String tipo; // de pasajeros, de carga o ambos

	public Tren() {
		super();
		this.cantidadVagones = 0;
		this.tipo = "";
	}
	
	public Tren(String patente, String tipoCombustible, 
			String numeroChasis, int ruedas, int capacidadPasajeros,
			int cantidadVagones, String tipo) {
		super(patente, tipoCombustible, numeroChasis, ruedas, capacidadPasajeros);
		this.cantidadVagones = cantidadVagones;
		this.tipo = tipo;
	}

	public int getCantidadVagones() {
		return cantidadVagones;
	}

	public void setCantidadVagones(int cantidadVagones) {
		this.cantidadVagones = cantidadVagones;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String cambiarCarril()
	{
		return "El tren ha cambiado de carril";
	}
	
	
}
