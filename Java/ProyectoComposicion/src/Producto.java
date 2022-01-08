
public class Producto {
	private int codigoBarra;
	private String descripcion;
	private int stock;
	private int precioCosto;
	private int precioVenta;
	private Proveedor proveedor;
	private Marca marca;

	public Producto() {

		this.codigoBarra = 0;
		this.descripcion = "";
		this.stock = 0;
		this.precioCosto = 0;
		this.precioVenta = 0;
		this.proveedor = null; // new Proveedor();
		this.marca = null;
	}

	public Producto(int codigoBarra, String descripcion, int stock, int precioCosto, int precioVenta,
			Proveedor proveedor, Marca marca) {

		this.codigoBarra = codigoBarra;
		this.descripcion = descripcion;
		this.stock = stock;
		this.precioCosto = precioCosto;
		this.precioVenta = precioVenta;
		this.proveedor = proveedor;
		this.marca = marca;
	}

	public int getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(int codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrecioCosto() {
		return precioCosto;
	}

	public void setPrecioCosto(int precioCosto) {
		this.precioCosto = precioCosto;
	}

	public int getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String mostrarDatos() {
		return "Producto \n codigoBarra=" + codigoBarra + 
							", descripcion=" + descripcion + 
							", stock=" + stock + 
							", precioCosto=" + precioCosto + 
							", precioVenta=" + precioVenta + 
							", proveedor=\n" + proveedor.mostrarDatos() +
							",\n marca =" + marca.mostrarDatos()
							 ;
	}


	
}
