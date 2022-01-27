package Testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Model.Suma;

public class SumaTest2 {
	static Suma suma;
	@BeforeClass
	public static void beforeClass() {
		System.out.println("****** Iniciando pruebas");
		suma = new Suma();
	}

	@Before
	public void sumar2NumerosResultadoTestBefore() {
		System.out.println("Iniciando prueba");
	}
	@After
	public void sumar2NumerosResultadoTestAfter() {
		System.out.println("Prueba Terminada...");
//		suma = null;
	}

	@Test
	public void sumar2NumerosResultadoTest2() {
		System.out.println("Ejecutando prueba 2...");

		int resultado = suma.sumar2Numeros(200, 100);
		assertNotEquals(1, resultado);
	}
	@Test
	public void sumar2NumerosResultadoTest() {
		System.out.println("Ejecutando prueba 1...");
		int resultado = suma.sumar2Numeros(100, 100);
		assertEquals(200, resultado);
	}
	
	@Test
	public void sumarVariosNumerosIntTest()
	{
		System.out.println("Ejecutando prueba 3...");
		int [] numeros = {1,2,3,4,5};
		int resultado = suma.sumarVariosNumeros(numeros);
		assertEquals(15, resultado);
	}
	@Test
	public void sumarVariosNumerosLongTest()
	{
		System.out.println("Ejecutando prueba 4...");
		long [] numeros = {100000000000L,1,1,1,1};
		long resultado = suma.sumarVariosNumeros(numeros);
		assertEquals(100000000004L, resultado);
	}
	@Test
	public void sumarAbsolutosTest()
	{
		System.out.println("Ejecutando prueba 5...");
		long resultado = suma.sumarAbsolutos(-1,-1);
		assertEquals(2, resultado);
	}
	//Actividad: crear 4 test para la clase suma
	@Test
	public void sumarAbsolutosTest2()
	{
		System.out.println("Ejecutando prueba 6...");
		double resultado = suma.sumarAbsolutos(-1,1);
		assertNotEquals(0, resultado);
	}

}
