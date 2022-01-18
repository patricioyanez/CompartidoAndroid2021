
/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal
{
    // instance variables - replace the example below with your own
    private String nombre;    
    private int CantidaDeOjos;
    private String especie;
    private String duracionGestacion;
    private String tipoDeReproduccion; // vivipados/oviparos / 

    /**
     * Constructor for objects of class Animal
     */
    public Animal()
    {
        // initialise instance variables
        CantidaDeOjos = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String comer()
    {
        // put your code here
        return "El animal come";
    }
    public String mover()
    {
        return "El Animal se mueve";
    }
    
}
