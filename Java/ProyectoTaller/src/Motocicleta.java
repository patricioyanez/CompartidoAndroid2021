
public class Motocicleta extends Vehiculo {

	@Override
	public int totalConIva() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int obtenerDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int totalPorPagar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String mostrarDatos() {
		return "==== Motocicleta ==== " + 
				"\npatente            = " + super.getPatente() + 
				"\nmarca              = " + super.getMarca() + 
				"\ncolor              = " + super.getColor() + 
				"\ncosto del Servicio = " + super.getCostoServicio()
				
				;
	}

}
