import java.util.Scanner;

public class Principal {
	public static void main(String args[]) {
		
		Scanner leerTeclado = new Scanner(System.in);
		int opcion = 0;
		int opcionSalud = 0;
		Paciente paciente = new Paciente();
		
		while(opcion != 4)
		{
			System.out.println("| ====== M e n ú ======= |");
			System.out.println("1.- Registro de datos de paciente.");
			System.out.println("2.- Registro de consulta.");
			System.out.println("3.- Mostrar datos.");
			System.out.println("4.- Salir");
			System.out.print("Selecciones una opción: ");
			opcion = leerTeclado.nextInt();
			
			if(opcion < 1 || opcion > 4)
			{
				System.out.println("Opcion no válida, vuelva a intentar.");
				System.out.print("Presione c para continuar y enter: ");
				leerTeclado.next();
				continue;
			}
			
			if(opcion == 1)
			{
				System.out.println("\n");
				System.out.println("|*** Ingreso de nuevo Paciente ***|");
				System.out.print("Rut: ");
				paciente.setRut(leerTeclado.nextInt());
				System.out.print("Dv: ");
				paciente.setDv(leerTeclado.next().charAt(0));
				System.out.print("Nombre: ");
				paciente.setNombre(leerTeclado.next());
				System.out.print("Apellido: ");
				paciente.setApellido(leerTeclado.next());
				System.out.println("*** Sistemas de salud");
				System.out.println("1.- Isapre1");
				System.out.println("2.- Isapre2");
				System.out.println("3.- MasIsapre");
				System.out.println("4.- SuperIsapre");
				System.out.println("5.- Fonasa");
				System.out.println("Escoja sistema de salud: ");
				opcionSalud = leerTeclado.nextInt();
				
				if(opcionSalud < 1 || opcionSalud > 5)
				{
					System.out.println("Error en la opcion");
					System.out.print("Presione c para continuar y enter: ");
					leerTeclado.next();
					continue;
				}
				if(opcionSalud == 1)
				{
					paciente.setSeguroSalud("Isapre1");
				}
				else if(opcionSalud == 2)
				{
					paciente.setSeguroSalud("Isapre2");
				}
				else if(opcionSalud == 3)
				{
					paciente.setSeguroSalud("masIsapre");
				}
				else if(opcionSalud == 4)
				{
					paciente.setSeguroSalud("SuperIsapre");
				}
				else if(opcionSalud == 5)
				{
					paciente.setSeguroSalud("Fonasa");
				}
				System.out.println("Datos ingresados correctamente");
				System.out.print("Presione c para continuar y enter: ");
				leerTeclado.next();				
			}
			else if(opcion == 2)
			{
				System.out.println("Ingrese Motivo Consulta: ");
				paciente.setMotivoConsulta(leerTeclado.next());
				System.out.println("Ingrese diagnóstico: ");
				paciente.setDiagnostico(leerTeclado.next());
				System.out.println("Remedios recetados: ");
				paciente.setRemedio(leerTeclado.next());
				System.out.println("Exámenes solicitados: ");
				paciente.setExamen(leerTeclado.next());	
				System.out.println("Datos ingresados correctamente");
				System.out.print("Presione c para continuar y enter: ");
				leerTeclado.next();					
			}
			else if(opcion == 3)
			{
				System.out.println(paciente.fichaConsulta());
			}
		}
		
		
	}
}
