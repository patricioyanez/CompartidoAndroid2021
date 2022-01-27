package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import Model.Suma;

public class SumaTest {

	@Test
	public void sumar2NumerosResultadoTest() {
		System.out.println("Iniciando prueba...");
		//fail("Not yet implemented");
		Suma suma = new Suma();
		int resultado = suma.sumar2Numeros(100, 100);
		assertEquals(200, resultado);
		System.out.println("Prueba Terminada...");
	}
	@Test
	public void sumar2NumerosResultadoTest2() {

		Suma suma = new Suma();
		int resultado = suma.sumar2Numeros(200, 100);
		assertNotEquals(1, resultado);
	}
	@Test
	public void sumarVariosNumerosIntTest()
	{
		int [] numeros = {1,2,3,4,5};
		Suma suma = new Suma();
		int resultado = suma.sumarVariosNumeros(numeros);
		assertEquals(15, resultado);
		System.out.println("Prueba Terminada...");
	}
	@Test
	public void sumarVariosNumerosLongTest()
	{
		long [] numeros = {100000000000L,1,1,1,1};
		Suma suma = new Suma();
		long resultado = suma.sumarVariosNumeros(numeros);
		assertEquals(100000000004L, resultado);
		System.out.println("Prueba Terminada...");
	}
	@Test
	public void sumarAbsolutosTest()
	{
		Suma suma = new Suma();
		long resultado = suma.sumarAbsolutos(-1,-1);
		assertEquals(2, resultado);
		System.out.println("Prueba Terminada...");
	}
	//Actividad: crear 4 test para la clase suma
	
}
