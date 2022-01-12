import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lectura = new Scanner(System.in);
		int cantidad;
		System.out.println("~~~~~~~~~ Bienvenido a cuenta letras ~~~~~~~~~");
		System.out.print("Ingrese la cantidad de nombre: ");		
		cantidad = lectura.nextInt(); // usuario ingresa cantidad de nombres
		
		String nombres[] = new String[cantidad]; // Crea el arreglo con la cantidad
		
		for (int i=0; i<cantidad; i++) //ciclo para Asignar valores al arreglo
		{	
			System.out.print("ingrese nombre " + (i+1) + ": "); //Mensaje para usuario
			nombres[i] = lectura.next(); //asignación del nombre según indice actual
		}
		int mayor = 0;
		int indice = 0;
		String nombre ="";
		for (int i = 0; i < nombres.length; i++) 
		{			
			if(mayor < nombres[i].length())	
			{
				indice = i;
				nombre = nombres[i];
				mayor = nombres[i].length();
			}
		}
		System.out.println("El nombre es: " + nombre);
		System.out.println("El nombre es: " + nombres[indice]);
		System.out.println("El nombre que tiene más caracteres es: " + mayor);
		
		// Actividad 4: Mostrar el nombre que tiene más caracteres.
		// investigación ¿Que son las colecciónes? y algunas diferencias con array
		
		
	}

}
