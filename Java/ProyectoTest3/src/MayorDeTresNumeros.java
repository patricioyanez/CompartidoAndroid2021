import java.util.Scanner;

public class MayorDeTresNumeros {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		int numero3;
		
		Scanner leer = new Scanner(System.in);
		
		// solitar la información
		System.out.print("Ingrese el primer número : ");
		numero1 = leer.nextInt();	
		System.out.print("Ingrese el segundo número: ");
		//Leer Teclado;
		numero2 = leer.nextInt();
		System.out.print("Ingrese el tercer  número: ");
		//Leer Teclado;
		numero3 = leer.nextInt();
		if (numero1 <= numero2 && numero2 <= numero3 ){
			System.out.print("El orden de menor a mayor es: " + numero1 + " " + numero2 + " " + numero3);
		}
		else if (numero2 <= numero1 && numero1 <= numero3) {
			System.out.print("El orden de menor a mayor es: " + numero2 + " " + numero1 +" " + numero3);
		}
		else if (numero3 <= numero1 && numero1 <= numero2) {
			System.out.print("El orden de menor a mayor es: " + numero3 + " " + numero1 + " " + numero2);
		}
		else if (numero3 <= numero2 && numero2 <= numero1) {
			System.out.print("El orden de menor a mayor es: " + numero3 + " " + numero2 + " " + numero1);
		}
		else if (numero1 <= numero3 && numero3 <= numero2) {
			System.out.print("El orden de menor a mayor es: " + numero1 + " " + numero3 + " " + numero2);
		}
		else{
			System.out.print("El orden de menor a mayor es: " + numero2 + " " + numero3 + " " + numero1);
		}
	}

}
