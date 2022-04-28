
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creacion de Automovil
		Automovil auto1 = new Automovil();
		
		System.out.println("Tipo de combustible 1: " + auto1.getTipoCombustible());
		
		Automovil auto2;
		auto2 = new Automovil();
		System.out.println("Tipo de combustible 2: " + auto2.getTipoCombustible());
		
		
		System.out.println("Tipo de combustible 3: " + new Automovil().getTipoCombustible());
		
		Automovil auto4 = new Automovil("aa4060", "fasdfasd2332", 
										"fds56465465", 1500, 
										5, false, 
										"Petroleo", 5000000);
		System.out.println("Tipo de combustible 4: " + auto4.getTipoCombustible());
		System.out.println("Precio actual : " + auto4.getPrecio() );
		auto4.setPrecio(6000000);
		System.out.println("Nuevo precio  : " + auto4.getPrecio() );
		
		System.out.println("****** Datos del vehículo *******");
		System.out.println("patente          :" + auto4.getPatente());
		System.out.println("nro Motor        :" + auto4.getNumeroMotor());
		
		System.out.println(auto4.ObtenerTodosLosDatos());
		System.out.println(auto1.ObtenerTodosLosDatos());
		System.out.println(auto2.ObtenerTodosLosDatos());
		System.out.println(auto1.toString() + " " + auto4.toString());
		Automovil auto10 = auto2;
		if(auto10 == auto4)
			System.out.println("Son Igules");
		else
			System.out.println("No Son Igules");

		System.out.println(auto2.ObtenerTodosLosDatos());
		auto10.setPatente("fc5054");
		auto2.setPrecio(50000);
		System.out.println(auto10.ObtenerTodosLosDatos());
		int a = 10;
		int b = a;
		b =  b + 1;
		System.out.println(a);
		
	}

}
