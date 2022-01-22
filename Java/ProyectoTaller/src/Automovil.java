
public class Automovil extends Vehiculo {
 //  2 atributos/ los constructores / g & s
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
		return "==== AutoMovil ==== " + 
				"\npatente            = " + super.getPatente() + 
				"\nmarca              = " + super.getMarca() + 
				"\ncolor              = " + super.getColor() + 
				"\ncosto del Servicio = " + super.getCostoServicio()
				
				;
	}
}
