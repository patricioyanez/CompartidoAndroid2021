import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// Declarar variables		
		// para escribir en la consola usar clase System
		// actividad: solicitar nombre, apellido y la edad.
		String nombre; // caracter = String
		String apellido;		
		int edad;   // entero = int
		
		Scanner leer = new Scanner(System.in);	// 	crea el objeto para el leer el teclado
		System.out.print("Ingrese su nombre  : ");
		nombre = leer.next();
		System.out.print("Ingrese su apellido: ");
		apellido = leer.next();
		System.out.print("Ingrese su edad    : ");
		edad = leer.nextInt();
		System.out.println("Tú nombre y apellido es " + nombre.toUpperCase() + " " + apellido.toLowerCase());
		System.out.println("Tú edad es " + edad + " años" );
		
		// como convertir a mayuscula los textos. 
		// Manual leer unidad 2.1 al 2.2 (solo ciclos)
		// 
		
	}

}
