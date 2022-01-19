
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo1 = new Vehiculo();
		vehiculo1.setCapacidadPasajeros(3);
		vehiculo1.setNumeroChasis("sdfasdf56564");
		vehiculo1.setPatente("fbcg12");
		vehiculo1.setRuedas(4);
		vehiculo1.setTipoCombustible("petroleo");
		System.out.println("La patente Vehiculo1 es: " + vehiculo1.getPatente());
		
		Automovil automovil1 = new Automovil("af3015", "Bencina", "a12312",4, 5,false, 0);
		System.out.println("La patente automovil1 es: " + automovil1.getPatente() );
		automovil1.setNumeroChasis("sd3545sdf565641sd");
		System.out.println("El nro de chasis del automovil1 es: " + automovil1.getNumeroChasis() );

		System.out.println(automovil1.mostrarDatos());
		System.out.println(vehiculo1.mostrarDatos());
		System.out.println(automovil1.encender()  );
		System.out.println(automovil1.encender(1) );
		System.out.println(automovil1.encender(true, false));
	}


}
