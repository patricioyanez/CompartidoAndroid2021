// automotora
public class Automovil {
	// atributos
	private String patente;
	private String numeroMotor;
	private String numeroChasis;
	private int cilindradas;
	private int puertas;
	private boolean encendidoElectronico;
	private String tipoCombustible;
	private int precio;
	
	// constructores
	public Automovil() // sin parametros
	{
		this.patente = "";
		this.numeroMotor = "";
		this.numeroChasis = "";
		this.cilindradas = 0;
		this.puertas = 0;
		this.encendidoElectronico = false;
		this.tipoCombustible = "bencina";
		this.precio = 0;
	}
	public Automovil(String patente, String numeroMotor, String numeroChasis,
					int cilindradas, int puertas, boolean encendidoElectronico,
					String tipoCombustible, int precio) // con parametros
	{
		this.patente = patente;
		this.numeroMotor = numeroMotor;
		this.numeroChasis = numeroChasis;
		this.cilindradas = cilindradas;
		this.puertas = puertas;
		this.encendidoElectronico = encendidoElectronico;
		this.tipoCombustible = tipoCombustible;
		this.precio = precio;
	}
	// accesadores y mutadores setter and getter
	public void setPatente(String patente)
	{
		this.patente = patente;
	}
	public String getPatente() 
	{
		return this.patente;
	}
	public String getNumeroMotor() {
		return numeroMotor;
	}
	public void setNumeroMotor(String numeroMotor) {
		this.numeroMotor = numeroMotor;
	}
	public String getNumeroChasis() {
		return numeroChasis;
	}
	public void setNumeroChasis(String numeroChasis) {
		this.numeroChasis = numeroChasis;
	}
	public int getCilindradas() {
		return cilindradas;
	}
	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public boolean isEncendidoElectronico() {
		return encendidoElectronico;
	}
	public void setEncendidoElectronico(boolean encendidoElectronico) {
		this.encendidoElectronico = encendidoElectronico;
	}
	public String getTipoCombustible() {
		return tipoCombustible;
	}
	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	// metodos personalizados	
	
	public int aplicarImpuestos()
	{
		int total = this.precio;
		// impuesto verde
		if(this.tipoCombustible == "petroleo")
		{
			total *= 1.08;
		}
		else
		{
			total *= 1.04;
		}
		total *= 1.19; // IVA
		return total;
	}
}
