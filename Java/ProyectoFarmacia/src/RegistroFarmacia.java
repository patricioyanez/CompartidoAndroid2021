import java.util.ArrayList;

public class RegistroFarmacia {

	ArrayList<Producto> productos;
	
	public RegistroFarmacia()
	{
		productos = new ArrayList<Producto>();
	}
	
	public String agregar(Producto producto)
	{
		for(Producto aux: productos)
		{
			if(aux.getCodigo() == producto.getCodigo())
				return "Producto ya existe.";
		}		
		productos.add(producto);
		return "EL producto fue agregado";
	}
	public Producto buscarPorCodigo(int codigo)
	{
		for(Producto aux: productos)
		{
			if(aux.getCodigo() == codigo)
				return aux;
		}
		return null;
	}
	public String listar()
	{
		String datos = "";
		for(Producto aux: productos)
		{ 
			datos += "\n" + aux.mostrar();
			// datos = datos + "\n" + aux.mostrar();
		}
		return datos;
	}
	public String eliminar(int codigo)
	{
		for(Producto aux: productos)
		{
			if(aux.getCodigo() == codigo)
			{
				productos.remove(aux);				
				return "El producto fue eliminado";				
			}
		}		
		return "Producto no encontrado";
	}
	
}
