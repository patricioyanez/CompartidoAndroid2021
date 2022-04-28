
public class Cliente {
	private int rut;
	private char dv;
	private String nombre;
	private String apellido;
	private String numeroCuenta;
	private int saldo;
	
	public Cliente()
	{
		this.rut = 0;
		this.dv = ' ';
		this.nombre = "";
		this.apellido = "";
		this.numeroCuenta = "";
		this.saldo = 0;
	}

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

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public String imprimir() {
		return "===== Cliente =====" +
				"\nRut=" + rut + "-" + dv + 
				"\nNombre=" + nombre + " " + apellido +
				"\nNumero Cuenta=" + numeroCuenta + " Saldo=" + saldo;
	}
	public boolean depositar(int cantidadDinero)
	{
		this.saldo += cantidadDinero;
		return true;
	}
	public boolean girar(int cantidadGiro)
	{
		if(cantidadGiro > this.saldo)
		{
			return false;
		}
		else
		{
			this.saldo -= cantidadGiro; // this.saldo = this.saldo - cantidadGiro
			return true;
		}		
	}
	
}
