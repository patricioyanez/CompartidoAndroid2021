import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Mascota> mascotas = new ArrayList<Mascota>();

	    Dueno dueno1 = new Dueno(12345678,'9',"Juan Perez",91234567);        
        Mascota masco1 = new Mascota(15," Perro"," Mestizo"," Cachupin" , dueno1);

        Dueno dueno2 = new Dueno(23456789,'1',"Ana Aros", 923456789);
        Mascota masco2 = new Mascota(16," Gato"," Angora"," Nyx",dueno2  );
        
        
        Dueno dueno3 = new Dueno(3456789,'0'," Ramon Diaz",93456789);
        Mascota masco3 = new Mascota(17," Gato"," Persa"," Gardfiel", dueno3);
        
        mascotas.add(masco1);
        boolean existe = false; // no existe la mascota
        
        // recorrer la coleccion de mascotas
        for (Mascota aux : mascotas)
        {  
        	if (aux.getId() == masco2.getId())
        	{
	        	existe = true;
	        	break; // cierra el ciclo for (termina de ejecutarse)
        	}
        }
        if(!existe)
        	mascotas.add(masco2);
        else
        	System.out.println("Mascota ya existe");
        
        existe = false; // no existe la mascota
        for (Mascota aux : mascotas)
        {  
        	if (aux.getId() == masco3.getId())
        	{
	        	existe = true;
	        	break;
        	}
        }
        if(!existe)
        	mascotas.add(masco3);
        else
        	System.out.println("Mascota ya existe");

		System.out.println("*** Cantidad de elementos en la colección son: " + mascotas.size());
		
		Mascota eliminado = mascotas.remove(2);
		System.out.println("=== Mascota eliminada ===");
		System.out.println(eliminado.mostrarDatos());
		System.out.println("*** Cantidad de elementos en la colección son: " + mascotas.size());
		
		/* 
		 * realizar el punto 6 del ejercicio mostrar nombre de
		 * mascota y nombre del dueño y su telefono
		 * 
		 *  Leer Unidad 4 hererncia y polimorfismo.
		 *  
		 *  Avanzar en la evaluación disponible en la plataforma.
		 *  
		 */
		
		
		
	}

}
