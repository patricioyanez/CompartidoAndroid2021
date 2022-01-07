
public class Cliente {	
	private int rut;
	private char dv;
	private String nombre;
	private String apellido;
	private int montoCredito;
	private int cuotas;
	private int edad;
	private boolean esChilena;
	private int sueldo;
	private int antiguedadLaboral;
	private boolean morosidad;
	
	
	public Cliente() {
		this.rut = 0;
		this.dv = ' ';
		this.nombre = "";
		this.apellido = "";
		this.montoCredito = 0;
		this.cuotas = 0;
		this.edad = 0;
		this.esChilena = false;
		this.sueldo = 0;
		this.antiguedadLaboral = 0;
		this.morosidad = false;
	}
	public Cliente(int rut, char dv, String nombre, String apellido, int montoCredito, int cuotas, int edad,
			boolean esChilena, int sueldo, int antiguedadLaboral, boolean morosidad) {
		super();
		this.rut = rut;
		this.dv = dv;
		this.nombre = nombre;
		this.apellido = apellido;
		this.montoCredito = montoCredito;
		this.cuotas = cuotas;
		this.edad = edad;
		this.esChilena = esChilena;
		this.sueldo = sueldo;
		this.antiguedadLaboral = antiguedadLaboral;
		this.morosidad = morosidad;
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
	public int getMontoCredito() {
		return montoCredito;
	}
	public void setMontoCredito(int montoCredito) {
		this.montoCredito = montoCredito;
	}
	public int getCuotas() {
		return cuotas;
	}
	public void setCuotas(int cuotas) {
		this.cuotas = cuotas;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isEsChilena() {
		return esChilena;
	}
	public void setEsChilena(boolean esChilena) {
		this.esChilena = esChilena;
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	public int getAntiguedadLaboral() {
		return antiguedadLaboral;
	}
	public void setAntiguedadLaboral(int antiguedadLaboral) {
		this.antiguedadLaboral = antiguedadLaboral;
	}
	public boolean isMorosidad() {
		return morosidad;
	}
	public void setMorosidad(boolean morosidad) {
		this.morosidad = morosidad;
	}
	
	public String evaluarCredito()
	{
		// continuar con la actividad solcitada
		// según los datos devolver el mensaje de aprobación o rechazo
		// señalado en el caso.
		if(montoCredito >= 500000 && montoCredito <= sueldo * 10)
		{
			if(cuotas >= 3 && cuotas <= 84)
			{
				if(edad >= 24 && edad <= 79)
				{
					if(esChilena)
					{
						if(sueldo > 250000)
						{
							if(antiguedadLaboral > 3)
							{
								if(morosidad == false)
								{
									return "--------------------------------"
									+ nombre.toUpperCase() + " " + apellido.toUpperCase() + " " + rut
									+ "--------------------------------" 
									+ "Cumple con los requisitos" 
									+ "Sueldo : " + sueldo 
									+ "Monto máximo : " + sueldo * 10 
									+ "Monto Solicitado : " + montoCredito 
									+ "Tasa Mensual : 1,46%" 
									+ "N° de Cuotas : " + cuotas 
									+ "Monto a pagar: " + (montoCredito * 1.46) ;
								}
							}
						}
					}
				}
			}
		}

		return "-------------------------- \n" + nombre.toUpperCase() + " " + apellido.toUpperCase() + " "
		+ rut + "\n--------------------------\n" + "No cumple con los requisitos";


	}

	
	
	
} // fin de clase
