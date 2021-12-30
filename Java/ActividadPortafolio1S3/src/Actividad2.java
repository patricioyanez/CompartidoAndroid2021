
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

			Scanner leer= new Scanner(System.in);

			System.out.println("Ingrese el primer nombre");
			//Leer Teclado;
			nombre = leer.next();

			System.out.println("Ingrese su genero M o F");
			//Leer Teclado;
			genero = leer.next();
			genero=genero.toUpperCase();

			System.out.println("Ingrese su numero de celular");
			//Leer Teclado;
			celular = leer.nextInt();

			System.out.println("Ingrese su edad");
			//Leer Teclado;
			edad = leer.nextInt();


			if (genero=="M") {

			System.out.print(nombre + " " + celular);
			}

			else {
			System.out.print(nombre + " " + edad);
			}

		}

	}
