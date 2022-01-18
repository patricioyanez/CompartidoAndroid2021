
public class Automovil extends Vehiculo{
	private boolean esAutomatico; //true / false
	private int cantidadAirBag;
	

	public Automovil() {
		super(); // invoca al contructor de Vehiculo sin parametros
		this.esAutomatico = false;
		this.cantidadAirBag = 0;
	}
	
	public Automovil(String patente, String tipoCombustible, 
			String numeroChasis, int ruedas, int capacidadPasajeros, 
			boolean esAutomatico, int cantidadAirBag) {
		super(patente, tipoCombustible, numeroChasis, ruedas, capacidadPasajeros);
		this.esAutomatico = esAutomatico;
		this.cantidadAirBag = cantidadAirBag;

	}

	public boolean isEsAutomatico() {
		return esAutomatico;
	}

	public void setEsAutomatico(boolean esAutomatico) {
		this.esAutomatico = esAutomatico;
	}

	public int getCantidadAirBag() {
		return cantidadAirBag;
	}

	public void setCantidadAirBag(int cantidadAirBag) {
		this.cantidadAirBag = cantidadAirBag;
	}
	
	public String encender(boolean tieneBoton) {
		if(tieneBoton)
			return "El Automovil enciende al presionar embrigue";
		else
			return "El Automovil enciende al girar al llave";
	}

	@Override
	public String toString() {
		return "Automovil \n esAutomatico=" + this.isEsAutomatico() + // this.esAutomatico 
				", cantidadAirBag        = " + this.getCantidadAirBag() + 
				", getPatente            = " + super.getPatente() + 
				", getTipoCombustible    = " + super.getTipoCombustible() + 
				", getNumeroChasis       = " + super.getNumeroChasis() + 
				", getRuedad             = " + super.getRuedas() + 
				", getCapacidadPasajeros = " + super.getCapacidadPasajeros();
	}
	
	
	
}
