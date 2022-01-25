
public class Medicamento extends Producto {
	
	private boolean esGenerico;

	public Medicamento() {
		super();
		this.esGenerico = false;
	}
	public Medicamento(int codigo, int precioBase, String nombre,boolean esGenerico) {
		super(codigo, precioBase, nombre);
		this.esGenerico = esGenerico;
	}
	public boolean isEsGenerico() {
		return esGenerico;
	}
	public void setEsGenerico(boolean esGenerico) {
		this.esGenerico = esGenerico;
	}

	@Override
	public int descontar(String diaDeSemana) {
		if(diaDeSemana.equalsIgnoreCase("LUNES") && this.esGenerico)
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
		return "=====   Medicamento   =====" +
				"\nCódigo      =" + super.getCodigo() + 
				"\nPrecio Base =" + super.getPrecioBase() + 
				"\nNombre      =" + super.getNombre() +
				"\nEs Genérico =" + (this.esGenerico ? "Si":"No") ;
	}


	
}
