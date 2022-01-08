
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Proveedor proveedor1 = new Proveedor(1, '9', "Cecosud");
		Proveedor proveedor2 = new Proveedor(2, '7', "Lider");
		Proveedor proveedor3 = new Proveedor(3, '5', "Monserrat");
		
		Marca marca1 = new Marca(1, "Soprole", true);
		Marca marca2 = new Marca(2, "Nestle", true);
		Marca marca3 = new Marca(3, "Colun", true);
		
		Producto producto1 = new Producto(11111111, "Leche de 1lt", 100, 500, 750, proveedor1, marca3);
		
		System.out.println(producto1.mostrarDatos());
			
		
	}

}
