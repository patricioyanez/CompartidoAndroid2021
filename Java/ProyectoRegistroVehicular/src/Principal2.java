import java.util.ArrayList;

public class Principal2 {

	public static void main(String[] args) {
		
		Vehiculo vehiculo = new Automovil("af3015", "Bencina", "a12312",4, 5,false, 4);
		System.out.println(vehiculo.mostrarDatos());
		
		Vehiculo vehiculo2= new Tren("t800","electrico","aer097",12, 100,5,"pasajeros");
		System.out.println(vehiculo2.mostrarDatos());
		//vehiculo.
		// Automovil automovil = new Vehiculo(); // no es soportado
		// Tren automovilTren = new Vehiculo();
		
		Tren trenNos = (Tren)vehiculo2;
		System.out.println(trenNos.cambiarCarril());

		// actividad: como resolver este problema???
		
		// se debe convertir en automóvil para acceder al método encender
		Automovil auto = (Automovil)vehiculo;
		System.out.println(auto.encender(10));
		
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		vehiculos.add(trenNos);
		vehiculos.add(auto);
		
		for(Vehiculo v: vehiculos)
		{
			System.out.println(v.getPatente());
			if(v instanceof Tren)
			{
				System.out.println( ((Tren)v).cambiarCarril());
			}
			else if(v instanceof Automovil)
			{
				System.out.println(((Automovil)v).encender(true, false));
			}	
		}
	}

}
