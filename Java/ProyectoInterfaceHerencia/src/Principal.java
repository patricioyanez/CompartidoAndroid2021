import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		animal.setPatas(6);
		animal.setCantidadOjos(8);
		
		System.out.println(animal.comer());
		System.out.println(animal.mover());
		
		ArrayList<Animal> animales = new ArrayList<Animal>();
		Animal animal2 = new Animal();
		Animal animal3 = new Animal();
		Animal animal4 = new Animal();
		animales.add(animal);
		animales.add(animal2);
		animales.add(animal3);
		animales.add(animal4);
		
		animal.guardar(animales);
		
		System.out.println("Fin de la app");
		
	}

}
