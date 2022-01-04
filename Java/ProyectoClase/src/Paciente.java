
public class Paciente {	
	// atributos 
	private int rut;
	private char digito;
	private String nombre;
	private String apellido;
	private String direccion;
	private int numeroTelefono;
	private boolean esLeyDeUrgencia; // Verdadero o false
	
	
	// constructores
	public Paciente() // sin parametros o argumentos
	{
		this.rut 		= 0;
		this.digito 	= ' ';
		this.nombre 	= "";
		this.apellido	= "";
		this.direccion	= "";
		this.numeroTelefono = 0;
		this.esLeyDeUrgencia = false;
	}
	// constructor con parametros
	public Paciente(int rut, char digito, 
						String nombre, String apellido,
						String dirreccion, int numeroTelefono,
						boolean esLeyDeUrgencia) 
	{
		this.rut 	= rut;
		this.digito = digito;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.numeroTelefono = numeroTelefono;
		this.esLeyDeUrgencia = esLeyDeUrgencia;	
		
	}
	
	
	// metodos getter and setter	
	
	
	// customer o personalizado
	public void mostrarDatos() {
		System.out.println(this.rut + "-" + this.digito);
	}
	

} // fin de la clase
