
import java.util.Scanner;
public class Actividad2 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			/*
			 * Actividad 2 29-12-2021:
			 * Ingrese por teclado el nombre, edad, género y número de celular 
			 * de una persona. 
			 * Si es mujer, mostrar su nombre y número de celular, 
			 * otra opción mostrar solo el nombre y edad.
			 * 
			 * Como sugerencia usar m o M para saber si es mujer.
			 * 
			 * 1.- Definir variables.-    String, int, String, String
			 * 2.- solicitar los datos.-  import Scanner.
			 * 3.- procesar y mostrar los datos.-  if 
			 * 	-> Investigar como comparar 2 String e independiente si es
			 * 		mayúscula o minúscula
			 *  
			 * 		método equals de la clase String
			 */
			
			
			String nombre;
			String genero;
			int celular;
			int edad;
			
			// obtiene los datos o lee el teclado
			Scanner leer= new Scanner(System.in);

			System.out.println("Ingrese el primer nombre       : ");
			//Leer Teclado;
			nombre = leer.next();

			System.out.println("Ingrese su genero (M)Mujer, (H)Hombre u (O)omitir: ");
			//Leer Teclado;
			genero = leer.next();
			genero = genero.toUpperCase(); // m != M "case sensitive"

			System.out.println("Ingrese su numero de celular: ");
			//Leer Teclado;
			celular = leer.nextInt(); // 9 65 465 456

			System.out.println("Ingrese su edad: ");
			//Leer Teclado;
			edad = leer.nextInt();

//			if (genero.equals("M")) {
//			if (genero.equalsIgnoreCase("M")) { 
//			if (genero.equals("m") || genero.equals("M")) {
			if (genero.toUpperCase().equals("M")) {				
				System.out.print("Su nombre es: " + nombre + 
								" y su celular es: " + celular);
			}
			else {			
				System.out.print("Su nombre es: " + nombre + 
						" y su edad es: " + edad);
			}

		}

	}
