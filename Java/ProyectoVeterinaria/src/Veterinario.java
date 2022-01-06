
public class Veterinario {
	// 1.- Atributos
	private int rut;
	private char dv;
	private String nombre;
	private String apellido;
	private int celular;
	
	// 2.- Constructores
	public Veterinario() {
		this.rut = 0;
		this.dv = ' ';
		this.nombre = "";
		this.apellido = "";
		this.celular = 0;
	}
	public Veterinario(int rut, char dv, String nombre, String apellido, int celular) {
		this.rut = rut;
		this.dv = dv;
		this.nombre = nombre;
		this.apellido = apellido;
		this.celular = celular;
	}
	// 3.- getter and setter  o accesadores y mutadores
	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		this.rut = rut;
	}
	public char getDv() {
		return dv;
	}
	public void setDv(char dv) {
		this.dv = dv;
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
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	
	// 4.- customer o personalizado
	
	@Override
	public String toString() {
		return "Veterinario \n rut=" + rut + ", dv=" + dv + ", nombre=" + nombre + ", apellido=" + apellido + ", celular="
				+ celular;
	}
	
	public boolean verficarRut()
	{
		// investigar como se verifica si el rut correcto
		/*
		int m = 0;
		int s = 1;
		for (; rut != 0; rut /= 10)
			s = (s + rut % 10 * (9 - m++ % 6)) % 11;

		return dv == (char) (s != 0 ? s + 47 : 75);
		*/
		Integer M=0,S=1,T=rut;
		for (;T!=0;T=(int) Math.floor(T/=10))
		S=(S+T%10*(9-M++%6))%11;
		String digito = ( S > 0 ) ? String.valueOf(S-1) : "k";
		return digito.equalsIgnoreCase(""+dv); 
	}
	
	public boolean verificarFormatoCelular()
	{
		// verificar +56  254 321 12

		return true;
	}

	public boolean grabar()
	{
		return true;
	  // enviar a BDD
	}
	public boolean eliminar()
	{
		return true;
	  // enviar a BDD
	}
	public boolean buscar()
	{
		return true;
	  // enviar a BDD
	}
	public boolean listado()
	{
		return true;
	  // enviar a BDD
	}
	
}
