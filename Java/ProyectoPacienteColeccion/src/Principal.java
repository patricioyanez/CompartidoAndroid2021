import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		Scanner leerTeclado = new Scanner(System.in);
		
		int rut = 0;
		rut = leerTeclado.nextInt();
		
		boolean existe = false;
		for(Paciente aux: pacientes)
		{
			if(aux.getRut() == rut)
			{
				existe = true;
				aux.mostrarDatos();
				break;
			}
		}
		if(!existe) // si no existe, pedir los datos
		{
			// pedir datos
		}
		
	}

}
