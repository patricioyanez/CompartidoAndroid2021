
public class Principal {
	public static void main(String [] args)
	{
		Calculadora c = new Calculadora();
		int resultado = c.sumar(10, 11);
		System.out.println("El resultado es: " + resultado);
		
		int ventaSinIva = 10000;
		int ivaVenta = (int)(ventaSinIva * IOperaciones.IVA);
		int ventaTotal = (int)(ventaSinIva * IOperaciones.IVAINCLUIDO);
		System.out.println("Neto  : " + ventaSinIva);
		System.out.println("IVA   : " + ivaVenta);
		System.out.println("Total : " + ventaTotal);
		
	}
}
