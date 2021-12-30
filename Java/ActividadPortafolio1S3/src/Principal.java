import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// 1.- Definir las variables
		String nombre; 
		String apellido;
		int edad;	
				
		Scanner leerTeclado = new Scanner(System.in);
		
		//2.- Solicitar los datos
		System.out.print("Ingrese su nombre  : ");
		nombre = leerTeclado.next();
		System.out.print("Ingrese su apellido: ");
		apellido = leerTeclado.next();
		System.out.print("Ingrese su edad: ");
		edad = leerTeclado.nextInt();
		//edad = Integer.parseInt(leerTeclado.next()); // convierte
		
		//3.- procesar la info y avisar si es mayor o menor de e 
		if(edad >= 18)
		{
			System.out.println(nombre.toUpperCase() + " " + apellido + " eres mayor de edad.");
		}
		else {
			System.out.println(nombre +" "+ "NO eres mayor de edad");
		}
		
	}

}
