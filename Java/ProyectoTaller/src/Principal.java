
public class Principal {

	public static void main(String[] args) {
		Taller taller = new Taller();
		Automovil auto1 = new Automovil();
		Automovil auto2 = new Automovil();
		Motocicleta moto1= new Motocicleta();
		
		boolean respuesta; 
		respuesta = taller.agregar(auto1);
		
		if(respuesta)
			System.out.println("Vehiculo Guardado");
		else
			System.out.println("Vehiculo no fue guardado");
		
		System.out.println(taller.agregar(auto1, 0));
		
		
		
		taller.agregar(auto2);
		taller.agregar(moto1);
		auto1.obtenerDescuento(.8); // uso de sobrecarga. agregar descuento manual
		System.out.println(taller.listar());
	}

}
