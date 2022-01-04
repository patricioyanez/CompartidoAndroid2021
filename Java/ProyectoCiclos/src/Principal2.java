import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		// Ejemplo de mientras pero en java => while
		//String opcion = "";
		int opcion = 0;
		int numero1= 0;
		int numero2= 0;
		String tecla ="";
		Scanner leerTeclado = new Scanner(System.in);
		//while(!opcion.equalsIgnoreCase("s"))
		while(opcion != 6)
		{
			System.out.println("******  M e n ú  *******");
			System.out.println("1-. Sumar.");
			System.out.println("2.- Restar");
			System.out.println("3.- Multiplicar");
			System.out.println("4.- Dividir");
			System.out.println("5.- Mostrar la tabla del nro ingresado hasta el nro 10");
			System.out.println("6.- Salir");
			System.out.print("Ingrese la opción: ");			
			opcion = leerTeclado.nextInt();
			
			if(opcion < 1 || opcion > 6)
			{
				// opciones incorrectas
				System.out.println("Opción no válida. Vuelva a intentar.");
				System.out.println("presione c y enter para continuar");
				leerTeclado.next();		
			}
			else
			{
				// opciones correctas (el usuario presionó 1 o 2 o el 3)

				if(opcion == 5)
				{
					System.out.print("Ingrese el nro para la tabla");
					int numeroTabla = leerTeclado.nextInt();
					for (int i = 1; i <= 10; i++) { // i = i + 1;  i += 1;
						System.out.println(i + " x " + numeroTabla + " = " + (numeroTabla*i));
					}
				}
				else
				{
					System.out.print("Ingrese 1er nro: ");
					numero1 = leerTeclado.nextInt();
					System.out.print("Ingrese 2do nro: ");
					numero2 = leerTeclado.nextInt();
					
					if(opcion == 1)
					{
						System.out.println("El resultado es: " + (numero1 + numero2));
					}
					if(opcion == 2)
					{
						System.out.println("El resultado es: " + (numero1 - numero2));
					}
					if(opcion == 3)
					{
						System.out.println("El resultado es: " + (numero1 * numero2));
					}
					if(opcion == 4)
					{
						if(numero2 == 0)
							System.out.println("No se puede dividir por cero");
						else
							System.out.println("El resultado es: " + (numero1 / numero2));
					}
				}
				System.out.println("presione c y enter para continuar");
				leerTeclado.next();	
			}
			
		}
		
		System.out.println("*** Creado por Android Trainee Teams ***");		
	}

}
