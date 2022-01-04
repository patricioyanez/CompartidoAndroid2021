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
		
		// mostrar el restante de los datos que faltan del paciente
		// crear un 3er paciente pero solicitar los datos por teclado.
		// y mostrar dichos datos mediante el metodo mostrarDatos()
		// crear variables auxiliares
		// leer capitulos de las clases.
		
	}

}
