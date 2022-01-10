import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array/ arreglos  // colecciones 
		int numero;
		numero = 10;		
		int numero2 = 20;		
		numero2 = 3;
		
		int precios[];
		precios = new int[5];
		
		int []valores = new int[5];
		
		int[] numeros = {2,4,6,8,10};
		String [] marcas = {"volvo", "fiat","lada", "peugeot", "geely"};
		
		boolean flag[]= {true, false, true};
		// rescato el valor del arreglo, según el indice
		System.out.println( (numeros[1]+numeros[2]) );
		// modifica el valor del arreglo(según indice)
		numeros[1] = 5;
		numeros[2] = 7;	
		System.out.println( (numeros[1]+numeros[2]) );		
		
		
		// actvidad: solicitar 5 numeros y guardarlos en un arreglo
		// luego sumar todos los valores mostrar total y promediarlos

		
		Scanner leerTeclado = new Scanner(System.in);

		int []numeritos = new int[5];
		int total = 0;
		System.out.println("Actividad: Ingreso de datos ");
		System.out.print("Ingrese número 1: ");
		numeritos[0] = leerTeclado.nextInt();
		System.out.print("Ingrese número 2: ");
		numeritos[1] = leerTeclado.nextInt();
		System.out.print("Ingrese número 3: ");
		numeritos[2] = leerTeclado.nextInt();
		System.out.print("Ingrese número 4: ");
		numeritos[3] = leerTeclado.nextInt();
		System.out.print("Ingrese número 5: ");
		numeritos[4] = leerTeclado.nextInt();
		
		total = numeritos[0] +
					numeritos[1] +
					numeritos[2] +
					numeritos[3] +
					numeritos[4];
		
		System.out.println("El total de la suma es: " + total);
		System.out.println("El promedio es: " + (total/5));

		for (int i = 0; i < 5; i++) {
			System.out.println("Ingrese numero");			
			numeritos[i]=leerTeclado.nextInt();
		}
		System.out.println("el promedio es: "+ (numeritos[0] +
												numeritos[1] +
												numeritos[2] +
												numeritos[3] +
												numeritos[4])/5);
		
		// actividad: Promediar notas
		// solicitar cuantas notas ingresará, solicitar las notas,
		// luego mostrar: cada una de las notas y su promedio.
		
		
		
		
	}

}
