
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1 = new Cliente();
		cliente1.setRut(1); // 1-9  2-7   3-5   4-3
		cliente1.setDv('9');
		cliente1.setNombre("Juan");
		cliente1.setApellido("Aros");
		cliente1.setNumeroCuenta("100-50-60");
		cliente1.setSaldo(100000);

		Cliente cliente2 = new Cliente();
		cliente2.setRut(2); // 1-9  2-7   3-5   4-3
		cliente2.setDv('7');
		cliente2.setNombre("Juana");
		cliente2.setApellido("Díaz");
		cliente2.setNumeroCuenta("170-50-70");
		cliente2.setSaldo(50000);
		
		Cliente cliente3 = new Cliente();
		cliente3.setRut(3); // 1-9  2-7   3-5   4-3
		cliente3.setDv('5');
		cliente3.setNombre("Ana");
		cliente3.setApellido("Ríos");
		cliente3.setNumeroCuenta("200-150-60");
		cliente3.setSaldo(500000);
		
		Banco banco = new Banco(cliente1, cliente2, cliente3);
		
		System.out.println(banco.listadoCliente());
		System.out.println(banco.saldoTotal());
		
		cliente1.depositar(150);
		cliente2.depositar(200);
		cliente3.depositar(50);
		
		System.out.println(banco.saldoTotal());

		System.out.println(banco.listarSaldosDeClientes());

		cliente1.depositar(1500000);
		
		System.out.println(banco.listarSaldosDeClientes());
		
		Boolean fueMontoGirado = cliente3.girar(1500000);
		
		if(fueMontoGirado)
			System.out.println("Giro realizado.");
		else
			System.out.println("Giro no realizado.");
		
		System.out.println("Saldo Final:" + cliente3.getSaldo());
		
		//Uso de interface
		System.out.println("El Iva es: " + IParametros.IVA);
		System.out.println("El PI es:  " + IParametros.PI);
		
		
	}

}
