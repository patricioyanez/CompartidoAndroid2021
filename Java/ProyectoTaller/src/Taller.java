import java.util.ArrayList;

public class Taller {
	ArrayList<Vehiculo> vehiculos;
	
	public Taller()
	{
		this.vehiculos = new ArrayList<Vehiculo>();
	}
	
	public boolean agregar(Vehiculo vehiculo)
	{
		for(Vehiculo aux: vehiculos)
		{
			if(aux.getPatente().equalsIgnoreCase(vehiculo.getPatente()))
				return false;// no lo agregar porque ya existe	 		
		}
		vehiculos.add(vehiculo);
		return true; //devuelve true para confirmar que se agregó
	}
	public String agregar(Vehiculo vehiculo, int x)
	{
		for(Vehiculo aux: vehiculos)
		{
			if(aux.getPatente().equalsIgnoreCase(vehiculo.getPatente()))
				return "No se almaceno el vehiculo porque ya existe";// no lo agregar porque ya existe	 		
		}
		vehiculos.add(vehiculo);
		return "Vehiculo " + vehiculo.getPatente() + " guardado con éxito"; //devuelve true para confirmar que se agregó
	}
	public String listar()
	{
		String datos = "";
		for(Vehiculo aux: vehiculos)
		{
			datos += "\n" + aux.mostrarDatos(); // acumular
		}
		return datos;
	}
	public String contabilizar()
	{
		int auto = 0;
		int moto = 0;
		for(Vehiculo aux: vehiculos)
		{
			if(aux instanceof Automovil)
				auto++; // auto = auto + 1;
			else // if(aux instanceof Motocicleta)
				moto++; // contador
		}
		return "Existen:\n" + auto + " automóviles y " + moto + " motocicletas";
	}
	
	public boolean eliminar(String patente)
	{
		for(Vehiculo aux: vehiculos)
		{
			if(aux.getPatente().equalsIgnoreCase(patente))
			{
				vehiculos.remove(aux);
				return true;// Vehiculo de la patente encontrada fue eliminada
			}			
		}
		return false; // no se encontó o no se elimino.
	}
}
