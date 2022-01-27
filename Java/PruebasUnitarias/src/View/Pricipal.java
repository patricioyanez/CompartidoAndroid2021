package View;
import Model.Suma;

public class Pricipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suma sumar = new Suma();
		int resultado = sumar.sumarAbsolutos(-100, -5);
		
		System.out.println("El resultado es: " + resultado);
		
		int[] numeros = new  int[5];
		numeros[0] = 10;
		numeros[1] = 10;
		numeros[2] = 10;
		numeros[3] = 10;
		numeros[4] = 10;
		resultado = sumar.sumarVariosNumeros(numeros);
		System.out.println("El resultado es: " + resultado);
	}

}
