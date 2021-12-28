import java.util.Scanner;
public class ProyectoTest {
// tiene el nombre de método y debe estar para arrancar la app
	public static void main(String[] args) {
		// escribir (PSeInt) pero en Java
		System.out.println("Hola Mundo"); // ln salto de linea
		// 4 tipos de datos? entero, real, logico y caracter
		
		int numero; 
		float notita;
		double nota;
		boolean cumple;
		String nombre;
		long dinero;
		
		// actividad 3 tipos de datos de java
		
		numero = 3;
		numero = 2147483647;
		numero = -2147483648;
		dinero = 3000000000000001l; //webb
		nota = 4500.5646465465465465465;
		// crea el objeto para leer el teclado
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		nombre = leer.next(); // lee el teclado
		System.out.print("Hola " + nombre);
	}

}
