import java.util.Scanner;
public class MayorDeDosNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// definir las variable
		
		int numero1;
		int numero2;
		int numero3;
		int numeroAuxiliar;
		
		int numero4 = 100; // variable definida con valor por defecto		
		// permite leer lo que escribe el usuario
		Scanner leer = new Scanner(System.in);
		
		// solitar la información
		System.out.print("Ingrese el primer número : ");
		numero1 = leer.nextInt();	
		System.out.print("Ingrese el segundo número: ");
		//Leer Teclado;
		numero2 = leer.nextInt();

		// si //  if  op logicos: && (y) || (or)
		if(numero1 <= numero2)
		{
			System.out.print("" + numero1 + " " + numero2);
		}
		else  // sino. Se ejecuta cuando el 1er if es falso
		{
			System.out.print("" + numero2 + " " + numero1);
		}
		
		
		// Actividad de leer 2.1 y 2.2
		// 3.- Crear una app, en la cual, solicite un 
		// nombre y la edad. Que señale si es 
		// mayor de edad o no.
		
		// 1.- 2 variables
		// 2.- pedir o leer los datos ( importar Scanner)
		// 3.- Procesar la info y mostrar
		// w3school, google o manual de usuario.
		
	}

}
