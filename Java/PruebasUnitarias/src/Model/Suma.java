package Model;

public class Suma {

	public int sumar2Numeros(int n1, int n2)
	{
		return n1 + n2;
	}
	
	public int sumarVariosNumeros(int [] numeros)
	{
		int resultado = 0;
		for(int n: numeros)
		{
			resultado += n;
		}
		return resultado;
	}
	
	
}
