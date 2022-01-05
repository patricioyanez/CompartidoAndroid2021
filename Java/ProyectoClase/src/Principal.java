import java.util.Scanner;

public class Principal {

	
	// punto de inicio de la aplicación
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leerTeclado = new Scanner(System.in);
		
		Paciente paciente1 = new Paciente();
		paciente1.mostrarDatos();

		Paciente paciente2 = new Paciente(20100200,'k',"ana", "aros","Calle 1", 1, true);
		paciente2.mostrarDatos();

		/*
		Paciente paciente3 = new Paciente();
		paciente3.ingresoDeDatosPorTeclado();
		paciente3.mostrarDatos();
		*/

		Paciente paciente4 = new Paciente();
		paciente4.ingresoDeDatosPorTeclado();
		
		
		System.out.println("Modificar el rut paciente 4");
		// metodos set, permiten modificar los atributos de un objeto
		paciente4.setRut(1111111);
		paciente4.mostrarDatos();
		// metodos get, permiten obtener o rescatar los datos de los atributos de un objeto
		System.out.println("El nombre del paciente 4 es: " + paciente4.getNombre());
		System.out.println("El apellido del paciente 4 es: " + paciente4.getApellido());
		
		
		// mostrar el restante de los datos que faltan del paciente
		// crear un 3er paciente pero solicitar los datos por teclado.
		// y mostrar dichos datos mediante el metodo mostrarDatos()
		// crear variables auxiliares
		// leer capitulos de las clases.
		
	}

}
