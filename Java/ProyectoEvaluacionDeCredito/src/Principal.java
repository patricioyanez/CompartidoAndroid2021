import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// crear variables
		// solicitar los datos
		// entregarlos al objeto cliente
		// llamar al metodo e imprimir la resoluci�n del cr�dito.
		
		
		// Actividad asincrona:
		/*
		 * Crear un menu de 3 opciones
		 * 1.- ingresar un cliente (temporal) - 1 objeto
		 * 2.- mostrar si se aprueba o no el cr�dito
		 * 3.- salir men�.
		 */
		
		int opcion = 0;
		Scanner leerTeclado = new Scanner(System.in);
		Cliente cliente = new Cliente();
		
		while(opcion != 3)
		{
			System.out.println("-----------------------------------------");
			System.out.println("******** M E N � *******");
			System.out.println("-----------------------------------------");
			System.out.println(" 1.- Ingresar Cliente ");
			System.out.println(" 2.- Mostrar estado de Solicitud de Cr�dito ");
			System.out.println(" 3.- Salir del Men� ");
			System.out.print("Ingrese una opci�n v�lida: ");
			opcion = leerTeclado.nextInt();
			
			if (opcion < 1 || opcion > 3) {

				System.out.println("Opci�n no v�lida. Vuelva a intentar.");
				System.out.println("presione c y enter para continuar");
				leerTeclado.next();
				continue; // sube a la linea del while
			}
			
			if(opcion == 1)
			{
				System.out.println("|*** Ingreso de solicitud de Cr�dito***|");
				System.out.print("Rut         : ");
				cliente.setRut(leerTeclado.nextInt());
				System.out.print("Dv          : ");
				cliente.setDv(leerTeclado.next().charAt(0));
				System.out.print("Nombre      : ");
				cliente.setNombre(leerTeclado.next());
				System.out.print("Apellido    : ");
				cliente.setApellido(leerTeclado.next());
				System.out.print("Es Chileno  : ");
				cliente.setEsChilena(leerTeclado.nextBoolean());
				System.out.print("Edad        : ");
				cliente.setEdad(leerTeclado.nextInt());
				System.out.print("Sueldo: ");
				cliente.setSueldo(leerTeclado.nextInt());
				System.out.print("Monto a solicitar : ");
				cliente.setMontoCredito(leerTeclado.nextInt());
				System.out.print("Cantidad de Cuotas: ");
				cliente.setCuotas(leerTeclado.nextInt());
				System.out.print("Antiguedad laboral: ");
				cliente.setAntiguedadLaboral(leerTeclado.nextInt());
				System.out.print("Tiene Morosidad?  : ");
				cliente.setMorosidad(leerTeclado.nextBoolean());
				System.out.println("Datos ingresados correctamente.");
				System.out.println("presione c y enter para continuar");
				leerTeclado.next();
			}
			else if (opcion == 2)
			{
				System.out.println(	cliente.evaluarCredito());
			}
			else if (opcion == 3)
			{
				break;
			}
			
		}
		

	}

}
