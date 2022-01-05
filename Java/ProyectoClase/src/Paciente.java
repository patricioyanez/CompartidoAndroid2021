import java.util.Scanner;

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
						String direccion, int numeroTelefono,
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
	
	
	// metodos getter and setter // accesadores y mutadores	
	public int getRut()
	{
		return this.rut;
	}
	public void setRut(int rut)
	{
		this.rut = rut;
	}
	public char getDigito() {
		return digito;
	}
	public void setDigito(char digito) {
		this.digito = digito;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public boolean isEsLeyDeUrgencia() {
		return esLeyDeUrgencia;
	}
	public void setEsLeyDeUrgencia(boolean esLeyDeUrgencia) {
		this.esLeyDeUrgencia = esLeyDeUrgencia;
	}
	
	
	
	// customer o personalizado
	public void mostrarDatos() {
//		System.out.println(this.rut + "-" + this.digito + "-" + this.nombre + "-" + this.apellido + "-" + this.direccion + "-" + this.numeroTelefono + "-" + this.esLeyDeUrgencia );
/*
		System.out.println("\n"+"DATOS DEL PACIENTE"+"\n"+
				"RUT :"+this.rut + "-" + this.digito + "\n"+
				"NOMBRE :"+ this.nombre + " " + this.apellido+ "\n"+
				"DIRECCIÓN :" + this.direccion + "\n"+
				"TELEFONO :"+ this.numeroTelefono );
				if (this.esLeyDeUrgencia == true){
					System.out.println("Aplica ley de Urgencia");
				}
				else {
					System.out.println("No aplica ley de Urgencia");
				}
		*/
		System.out.println(this.rut + "-" + this.digito);
		System.out.println(this.nombre + " " + this.apellido);
		System.out.println(this.direccion);
		System.out.println(this.numeroTelefono);
		System.out.println("Ingresa por ley de urgencia: " + (this.esLeyDeUrgencia?"Si":"No"));

	}
	
	
	public void ingresoDeDatosPorTeclado()
	{		
		Scanner leerTeclado = new Scanner(System.in);
		System.out.println("**** Ingrese los datos ****");
		System.out.print("Rut       : ");
		this.rut = leerTeclado.nextInt();
		System.out.print("digito    : ");
		this.digito = leerTeclado.next().charAt(0);
		System.out.print("nombre	: ");
		this.nombre = leerTeclado.next();
		System.out.print("apellido	: ");
		this.apellido= leerTeclado.next();
		System.out.print("direccion	: ");
		this.direccion = leerTeclado.next();
		System.out.print("fono		: ");
		this.numeroTelefono = leerTeclado.nextInt();
		System.out.print("urgencia	: ");
		this.esLeyDeUrgencia = leerTeclado.nextBoolean();
	}

} // fin de la clase
