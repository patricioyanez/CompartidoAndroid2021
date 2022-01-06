import java.util.Scanner;

public class Mascota { 
	// 1.- Atributos. (5) // genericos
	private String nombre;
	private String tipo;
	private String raza;
	private int edad;
	private double peso;
	private boolean vacunasAlDia;
	private String dueno;
		
	// 2.- Constructores (2 el con y sin parametros).
	public Mascota()
	{
		this.nombre = "";
		this.tipo = "";
		this.raza = "";
		this.edad = 0;
		this.peso = 0;
		this.vacunasAlDia = false;
		this.dueno = "";
	}
	public Mascota(String nombre, String tipo, String raza,
					int edad, double peso, boolean vacunasAlDia,
					String dueno)
	{
		this.nombre = nombre;
		this.tipo = tipo;
		this.raza = raza;
		this.edad = edad;
		this.peso = peso;
		this.vacunasAlDia = vacunasAlDia;
		this.dueno = dueno;
	}
	
	// 3.- getter and setter // accesadores y mutadores.	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public boolean isVacunasAlDia() {
		return vacunasAlDia;
	}
	public void setVacunasAlDia(boolean vacunasAlDia) {
		this.vacunasAlDia = vacunasAlDia;
	}
	public String getDueno() {
		return dueno;
	}
	public void setDueno(String dueno) {
		this.dueno = dueno;
	}
		
	
	// 4.- métodos customer o personalizado	
	@Override  // @af42344
	public String toString() {		
		return "|**** Mascota **** |\n nombre=" + nombre + ", tipo=" + tipo + ", raza=" + raza + ", edad=" + edad + ", peso=" + peso
				+ ", vacunasAlDia=" + vacunasAlDia + ", dueno=" + dueno;
	}	
	
	public int anioNacimiento()
	{
		return 2022 - edad;
	}
	
	public String vacuna()
	{
		if(vacunasAlDia)
		{
			return "Tiene las vacunas al día";
		}
		else
		{
			if(edad <2)
				return "necesita vacuna séxtuple";
			else
				return "necesita la vacuna óctuple";
		}
	}
	public void ingresoDeDatosPorTeclado()
	{
		Scanner leerTeclado = new Scanner(System.in);
		System.out.println("**** Ingrese los datos de la Mascota ****");
		System.out.print("Nombre : ");
		this.nombre = leerTeclado.next();
		System.out.print("Tipo   : ");
		this.tipo = leerTeclado.next();
		System.out.print("Raza   : ");
		this.raza= leerTeclado.next();
		System.out.print("Edad   : ");
		this.edad = leerTeclado.nextInt();
		System.out.print("Dueño  : ");
		this.dueno = leerTeclado.next();
		System.out.print("Peso   : ");
		this.peso = leerTeclado.nextDouble();
		System.out.print("Vacunas: ");
		this.vacunasAlDia = leerTeclado.nextBoolean();
	}
	

}
