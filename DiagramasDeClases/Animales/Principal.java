
public class Principal
{
   
    public static void main(String[] args)
    {
        Animal a = new Animal();
        System.out.println("Método Animal: " + a.comer());       
        
        
        Reptil reptil = new Reptil();        
        System.out.println("Método Reptil: " + reptil.comer());
        
        Mamifero gato = new Mamifero();
        System.out.println("Método Mamifero: " + gato.comer());
        System.out.println("Método Mamifero: " + gato.mover());
        
        Gato gatita = new Gato();
        System.out.println("Método Gato: " + gatita.comer());
        
        // crear 1 animal por especie y llamar metodo comer/mover
    }
}
