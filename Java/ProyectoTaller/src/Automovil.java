
public class Automovil extends Vehiculo {
	private int cantidadDePuerta;
	private int capacidadDelMaletero;
	
	private int totalPorPagar;
	
	public Automovil ()
	{
		this.cantidadDePuerta = 0;
		this.capacidadDelMaletero = 0;
	}


	public Automovil (String patente, String marca, String color, int costoServicio, int cantidadDePuerta , int capacidadDelMaletero)
	{
		super(patente, marca, color, costoServicio);
		this.cantidadDePuerta = cantidadDePuerta;
		this.capacidadDelMaletero = capacidadDelMaletero;
	}	
	
	public int getCantidadDePuerta() {
		return cantidadDePuerta;
	}


	public void setCantidadDePuerta(int cantidadDePuerta) {
		this.cantidadDePuerta = cantidadDePuerta;
	}


	public int getCapacidadDelMaletero() {
		return capacidadDelMaletero;
	}


	public void setCapacidadDelMaletero(int capacidadDelMaletero) {
		this.capacidadDelMaletero = capacidadDelMaletero;
	}


	@Override
	public int totalConIva() {
		// TODO Auto-generated method stub
		totalPorPagar = (int)(getCostoServicio() * IDescuento.IVA);
		return totalPorPagar;
	}

	@Override
	public int obtenerDescuento() { // descuento es sobre precio con iva
		totalPorPagar = (int)(this.totalConIva() * IDescuento.DESCUENTO_AUTOMOVIL);
		return totalPorPagar;
	}
	public int obtenerDescuento(double descuento) {
		totalPorPagar = (int)(this.totalConIva() * descuento);
		return totalPorPagar;
	}

	@Override
	public int totalPorPagar() {
		
		return totalPorPagar;
	}
	
	@Override
	public String mostrarDatos() {
		return "====== Automovil =====" +
			"\nCantidad de puertas : "+ this.cantidadDePuerta +
			"\nCapacidad del maletero : "+ this.capacidadDelMaletero +
			"\nPatente() : "+ super.getPatente() +
			"\nMarca() : "+ super.getMarca() +
			"\nColor() : "+ super.getColor() +
			"\nCosto Servicio() : $"+ super.getCostoServicio();

		}
}
