import java.util.Scanner;//importo la clase scaner para leer el teclado

public class Principal {


	public static void main(String[] args) {

	// Se declaran las variables que se usaran
	int numero1; //las 3 primeras variables son tipo entero y estan vacias
	int numero2;
	int numero3;
	Scanner leer = new Scanner(System.in);//Con esta variable el usuario podra ingresar sus datos

	//Instrucciones e ingreso de datos por el usuario
	System.out.print("Ingrese el primer numero: ");
	numero1 = leer.nextInt();
	System.out.print("Ingrese el segundo numero: ");
	numero2 = leer.nextInt();
	System.out.print("Ingrese el tercer numero: ");
	numero3 = leer.nextInt();


	//Todo este codigo se activa cuando los 3 numeros ingresados por el usuario son distintos
	if(numero1 != numero2 && numero2 != numero3 && numero1 != numero3) { //Comparamos que los 3 numeros sean diferentes
	if(numero1 < numero2 && numero2 < numero3) {
	System.out.print("El orden de los numeros de menor a mayor es: "+ numero1 + " "+ numero2 + " " + numero3);
	}
	if(numero1 < numero3 && numero3 < numero2) {
		System.out.print("El orden de los numeros de menor a mayor es: "+ numero1 + " "+ numero3 + " " + numero2);
	}
	if(numero2 < numero1 && numero1 < numero3) {
	System.out.print("El orden de los numeros de menor a mayor es: "+ numero2 + " "+ numero1 + " " + numero3);
	}
	if(numero2 < numero3 && numero3 < numero1) {
	System.out.print("El orden de los numeros de menor a mayor es: "+ numero2 + " "+ numero3 + " " + numero1);
	}
	if(numero3 < numero1 && numero1 < numero2) {
	System.out.print("El orden de los numeros de menor a mayor es: "+ numero3 + " "+ numero1 + " " + numero2);
	}
	if(numero3 < numero2 && numero2 < numero1) {
	System.out.print("El orden de los numeros de menor a mayor es: "+ numero3 + " "+ numero2 + " " + numero1);
	}
	}

	//Todo este codigo se activa cuando 3 o 2 numeros ingresados por el usuario son iguales
	else {
	if(numero1 == numero2 && numero2 == numero3 ) {
	System.out.print("Los tres numeros son iguales");
	}
	if(numero1 == numero2 && numero3 != numero1) {
	if(numero2 < numero3) {
	System.out.print(numero1 + " es igual a " + numero2 + " y " + numero3 + " es el mayor");
	}
	else {
	System.out.print(numero3 + " es el menor, " + numero1 + " y "+ numero2 + " son iguales");
	}
	}
	if(numero2 == numero3 && numero1 != numero2) {
	if(numero1 < numero2) {
	System.out.print(numero1 + " es el menor, " + numero2 + " y "+ numero3 + " son iguales");
	}
	else {
	System.out.print(numero2 + " es igual a " + numero3 + " y " + numero1 + " es el mayor");
	}
	}
	if(numero1 == numero3 && numero2 != numero1) {
	if(numero1 < numero2) {
	System.out.print(numero1 + " es igual a " + numero3 + " y " + numero2 + " es el mayor");
	}
	else {
	System.out.print(numero2 + " es el menor, " + numero1 + " y "+ numero3 + " son iguales");
	}
	}

	}

	}

	}