
public class Motocicleta extends Vehiculo {

	@Override
	public int totalConIva() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int obtenerDescuento() {
		
		return (int)(super.getCostoServicio() * IDescuento.DESCUENTO_MOTOCICLETA);
	}

	@Override
	public int totalPorPagar() {
		int resultado = getCostoServicio();
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
