import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// CICLOS PSeInt para y mientras
		
		// para en java => for
		
		for(int i = 0; i < 10; i++) // ++  ++() * / + - 
		{
		 // bloque de codigos que se repetirán
			System.out.println("nro: " + i); 
		}
		for(int i = 0; i < 10; )  
		{
		 // bloque de codigos que se repetirán
			System.out.println("nro: " + i++); 
		}

		int indice = 0;
		for ( ; indice <= 10;) {
			indice++;
		}
		System.out.println("==== El valor es: "+ indice);
		
		//Ejercicio:
		/*
		 * 1.- Solicitar un numero y obtener el factorial
		 *   		5! =>  1*2*3*4*5 = 120
		 * */ 
		Scanner leerTeclado = new Scanner(System.in);
		int numero;
		int resultado = 1;
		System.out.print("Ingrese un número: ");
		numero = leerTeclado.nextInt();
		for (int i = 1; i <= numero; i++) {
			resultado = resultado * i;
		}
		System.out.println("El factorial de " + numero + 
				            " es " + resultado);
		
		
		/* 2.- solicitar cantidad de numero al azar y mostrarlos por
		 * pantalla o consola. Los numero al azar son hasta el 100.
		 * 
		 *  3 => 13 56 10
		 *  random
		 */
		
		int numero2;
		int numeroAzar = 0;
		Random random = new Random();
		System.out.print("Ingrese un número (AZAR): ");
		numero2 = leerTeclado.nextInt();
		for (int i = 1; i <= numero2; i++) {
			numeroAzar = random.nextInt(100);
			System.out.println(i + " : " + numeroAzar);
		}
	}

}
