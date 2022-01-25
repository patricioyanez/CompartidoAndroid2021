
public abstract class Producto implements Contable{
	private int codigo;
	private int precioBase;
	private String nombre;

	protected int descuento; // atributo auxiliar (tendrá el desc por aplicar)
	
	public Producto() {
		this.codigo = 0;
		this.precioBase = 0;
		this.nombre = "";
		this.descuento = 0;
	}
		
	public Producto(int codigo, int precioBase, String nombre) {
		this.codigo = codigo;
		this.precioBase = precioBase;
		this.nombre = nombre;
		this.descuento = 0;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
