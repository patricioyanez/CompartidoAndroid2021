import java.util.Scanner;


public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crear 2 mascotas (objetos) e ingresar datos por consola.
		// mostrar sus datos y saber que vacuna se debe administrar.
		/*
		Mascota mascota1 = new Mascota();
		Mascota mascota2 = new Mascota();
		Mascota mascota3 = new Mascota("Firulais", "perro", "Kilterrier", 3, 15, false, "No indentificado");
		Mascota mascota4 = new Mascota("Leon", "gato", "Gatuna", 5, 5, false, "juan");
		
		
		
		System.out.println(mascota3.toString());
		
		mascota3.setDueno("Sebastián Requena");		
		System.out.println(mascota3.toString());
		
		mascota1.ingresoDeDatosPorTeclado();		
		System.out.println(mascota1.toString());
		System.out.println(mascota1.vacuna());
		
		mascota2.ingresoDeDatosPorTeclado();		
		System.out.println(mascota2.toString());
		System.out.println(mascota2.vacuna());
		*/
/*
		Mascota mascota1 = new Mascota();
		Scanner leerTeclado = new Scanner(System.in);
		
		System.out.println("|*** Ingreso de datos de la mascota ***|");
		System.out.print("Nombre :");
		mascota1.setNombre(leerTeclado.next());
		System.out.print("Tipo :");
		mascota1.setTipo(leerTeclado.next());		
		System.out.print("Raza :");
		mascota1.setRaza(leerTeclado.next());
		
		System.out.println(	mascota1.toString());
		System.out.println(mascota1.getNombre());
	*/
		
		Veterinario v = new Veterinario();
		v.setRut(16332489);
		v.setDv('0');
		v.setNombre("Juan");
		v.setApellido("Aros");
		v.setCelular(41234123);
		
		if(v.verficarRut())
		{
			System.out.println("Rut Correcto");
			v.verificarFormatoCelular();
			v.grabar();
		}
		else
		{
			System.out.println("Rut inválido");			
		}
		
	}

}
