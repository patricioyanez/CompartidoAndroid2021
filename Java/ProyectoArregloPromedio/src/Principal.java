//Actividad promedios

import java.util.Scanner;

public class Principal {

public static void main(String[] args) {

	Scanner lectura = new Scanner(System.in);
	int cantidad;
	int valor = 0;
	float prom = 0;
	int pos = 0;
	
	System.out.println("~~~~~~~~~Bienvenido a promedio~~~~~~~~~");
	System.out.print("Ingrese la cantidad de notas: ");
	
	cantidad = lectura.nextInt(); //Numero de notas.
	
	int notas[] = new int [cantidad]; // CREAR ARREGLO
	
	
	for (int i=0; i<cantidad; i++) //ciclo para Asignar valores al arreglo
	{
	
		pos = i+1;
		System.out.println("ingrese nota " + pos + " :"); //texto solicitar notas
		
		
		notas[i] = lectura.nextInt(); //asginacion de valor
		valor = valor + notas[i]; //suma de las notas
	
	}
	
	System.out.print("Las nostas son: ");
	
	for (int i=0; i<cantidad; i++) //Mostrar notas por pantalla
	{
	
		System.out.print(notas[i] + " , ");
	
	}
	
	prom = (valor / cantidad) ; //promediar notas
	System.out.println("\nLa nota promedio es:" + prom); // mostrar promedio

}
}