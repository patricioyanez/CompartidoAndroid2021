
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegistroFarmacia rf = new RegistroFarmacia();
		System.out.println(new Medicamento(1,1000,"dipirona", true).mostrar());
		Medicamento m1 = new Medicamento(1,1000,"paracetamol", true);
		Medicamento m2 = new Medicamento(2,3000,"aspirina", false);
		SuplementoAlimenticio sa1 = new SuplementoAlimenticio(3, 12000, "enSure", 10, "Super nutritivo");
		
		String mensaje = "";
		// agregar productos
		mensaje = rf.agregar(m1);		
		System.out.println(mensaje);
		
		mensaje = rf.agregar(m1);		
		System.out.println(mensaje);
/*
		System.out.println("***********************" + m1.getNombre());
		m1 = null;
		// da error pq m1 ya no puede acceder al objeto (paracetamol)
		System.out.println("***********************" + m1.getNombre());
*/		
		mensaje = rf.agregar(m2);		
		System.out.println(mensaje);

		mensaje = rf.agregar(sa1);		
		System.out.println(mensaje);
		
		mensaje = rf.listar();
		System.out.println(mensaje);
	
		Producto prod = rf.buscarPorCodigo(3);
		prod.setNombre("Ensure Advance");
		sa1.setNombre("Ensure niños");
		System.out.println("___________________________" + prod.getNombre());
		System.out.println("\nEl producto 3 es: \n" + prod.mostrar());
		

		mensaje = rf.eliminar(3);
		System.out.println("\n" + mensaje);
		

	}

}
