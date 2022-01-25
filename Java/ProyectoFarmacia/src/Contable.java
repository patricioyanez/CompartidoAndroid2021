
public interface Contable {

	double DESCUENTO = 0.1; 
	
	int descontar(String diaDeSemana);
	String mostrar();
	int totalizar(int cantidad);
	
}
