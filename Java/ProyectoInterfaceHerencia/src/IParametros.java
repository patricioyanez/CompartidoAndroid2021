import java.util.ArrayList;

public interface IParametros {
	String PLANETA = "Tierra";
	
	String comer(); 
	String mover();
	
	ArrayList<?> listar();	
	int guardar(ArrayList<?> lista);
	int modificar();
	int eliminar();
	
}
