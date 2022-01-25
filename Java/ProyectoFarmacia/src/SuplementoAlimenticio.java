
public class SuplementoAlimenticio extends Producto {
	private int cantidadVitaminas;
	private String informacionVitaminas;

	public SuplementoAlimenticio() {
		super();
		this.cantidadVitaminas = 0;
		this.informacionVitaminas = "";
	}
	
	public SuplementoAlimenticio(int codigo, int precioBase, String nombre,int cantidadVitaminas, String informacionVitaminas) {
		super(codigo, precioBase, nombre);
		this.cantidadVitaminas = cantidadVitaminas;
		this.informacionVitaminas = informacionVitaminas;
	}

	public int getCantidadVitaminas() {
		return cantidadVitaminas;
	}

	public void setCantidadVitaminas(int cantidadVitaminas) {
		this.cantidadVitaminas = cantidadVitaminas;
	}

	public String getInformacionVitaminas() {
		return informacionVitaminas;
	}

	public void setInformacionVitaminas(String informacionVitaminas) {
		this.informacionVitaminas = informacionVitaminas;
	}
	

	@Override
	public int descontar(String diaDeSemana) {
		if(diaDeSemana.equalsIgnoreCase("LUNES"))
		{
			this.descuento = (int)(super.getPrecioBase() * Contable.DESCUENTO);
		}	
		return this.descuento;
	}

	@Override
	public int totalizar(int cantidad) {
		int totalPorPagar = 0;
		totalPorPagar = cantidad * (super.getPrecioBase() - this.descuento);
		return totalPorPagar;
	}
	
	@Override
	public String mostrar() {
		// TODO Auto-generated method stub
		return "=====   Suplemento   =====" +
				"\nCódigo        =" + super.getCodigo() + 
				"\nPrecio Base   =" + super.getPrecioBase() + 
				"\nNombre        =" + super.getNombre() +
				"\nCant. Vitamina=" + this.cantidadVitaminas +
				"\nInfo. Vitamina=" + this.informacionVitaminas;
	}
}
