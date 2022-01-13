import java.util.ArrayList;

public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creación de una colección arrayList
		ArrayList<String> nombres;
		nombres = new ArrayList<String>();
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		

		ArrayList<Marca> marcas;
		marcas = new ArrayList<Marca>();
		
		//agregar elemetos
		nombres.add("Juan");
		nombres.add("Juana"); // modificar por andrea
		nombres.add("ana");
		nombres.add("Antonia");// eliminar 
		nombres.add("Antonio"); 
		
		// Actividad 1: Como modifico y elimino un elemento de la colección.
		// ¿Como saber la cantidad de elementos que tiene una coleccion?
		System.out.println("Cantidad de elementos : " + nombres.size()); // permite obtener la cantida de elementos de una colección
		System.out.println("El nombre actual es   : " + nombres.get(1));
		
		nombres.set(1, "Andrea"); // modifica el valor		
		
		System.out.println("El nombre posterior es: " + nombres.get(1));
		
		nombres.remove(3);
		System.out.println("Cantidad de elementos : " + nombres.size());
		
		// permite recorre la colección
		for(String aux : nombres) // for each
		{
			if(aux.length()>4)
				System.out.println("Nombre: " + aux.toUpperCase());
			
		}
		
		
		// Actividad 2:
		// ingresar por consola los datos de varias marcas
		// y almacenarlo en una colección
		// Mostrar todas las marcas ingresadas.
		// menu: 1) ingresar marca 2) Listar marcas 3)Salir
		
		

	}

}
