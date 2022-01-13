import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Actividad 2:
		// ingresar por consola los datos de varias marcas
		// y almacenarlo en una colección
		// Mostrar todas las marcas ingresadas.
		// menu: 1) ingresar marca 2) Listar marcas 3)Salir
		// arrayList debe estar fuera del while.
		// new Marca tiene que estar dentro de la opción 1
		
		// definir las variable/objetos
		ArrayList<Marca> marcas = new ArrayList<Marca>();
		Scanner leerTeclado = new Scanner(System.in);
		int opcion = 0;
		
		while(opcion!=3)
		{
			System.out.println("**** Menú ****");
			System.out.println("1) ingresar marca\n2) Listar marcas\n3) Salir");
			System.out.print("Ingrese su opción: ");
			opcion = leerTeclado.nextInt();
			
			
			if (opcion < 1 || opcion > 3) {
				System.out.print("Alternativa incorrecta, selecione una de las 3 opciones del menú\n"+
				"Precione (c) para continuar y enter ");
				leerTeclado.next();
				continue;
			}
			if(opcion == 1) // CRUD o mantenedores CREATE, READ, UPDATE y DELETE
			{
				//ingresar una nueva marca
				Marca marca = new Marca();
				System.out.println("\n||| ===== Ingreso de nombres de marca ===== ||||" );
				System.out.print("Ingrese id    : ");
				// captura el id (teclado) y se almacena en el obj
				marca.setId(leerTeclado.nextInt()); 
				System.out.print("Ingrese nombre: ");
				marca.setNombre(leerTeclado.next());
				System.out.print("Esta activo   : ");
				marca.setActivo(leerTeclado.nextBoolean());
				
				marcas.add(marca);
				
			}
			else if(opcion == 2)
			{
				// Listar las marcas
				System.out.println("||| ====== LISTADO DE MARCAS =======|||");
				for (Marca aux : marcas) {
					System.out.println(aux.mostrarDatos());
				}				
			}
			
		}
		
		
	}

}
