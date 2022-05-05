
public class Banco {
	
	String direccion;
	Cliente cliente1;
	Cliente cliente2;
	Cliente cliente3; //lista arraylist n clientes

	public Banco(Cliente cliente1, Cliente cliente2, Cliente cliente3)
	{
		this.cliente1 = cliente1;
		this.cliente2 = cliente2;
		this.cliente3 = cliente3;
	}
	
	public int saldoTotal()
	{
		int saldoFinal = cliente1.getSaldo() +
						cliente2.getSaldo() +
						cliente3.getSaldo();
		return saldoFinal;
	}
	
	public String listadoCliente() 
	{
		String nombresCliente = "==== Listado de clientes =====\n";
		nombresCliente += cliente1.getNombre() + " " + cliente1.getApellido() + "\n";
		nombresCliente += cliente2.getNombre() + " " + cliente2.getApellido() + "\n";
		nombresCliente += cliente3.getNombre() + " " + cliente3.getApellido() + "\n";
		return nombresCliente;
	}
	
	public String listarSaldosDeClientes()
	{
		String listadoDeSaldos = "Saldo de todos los clientes\n";
		listadoDeSaldos += cliente1.getRut() + ":" + cliente1.getSaldo() + "\n";
		listadoDeSaldos += cliente2.getRut() + ":" + cliente2.getSaldo() + "\n";
		listadoDeSaldos += cliente3.getRut() + ":" + cliente3.getSaldo() + "\n";
		return listadoDeSaldos;
	}
}
