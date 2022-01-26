package Model;

public class Suma {

	public int sumar2Numeros(int n1, int n2)
	{
		return n1 + n2;
	}
	
	public int sumarVariosNumeros(int [] numeros) // 2xy31
	{
		int resultado = 0;
		for(int n: numeros)
		{
			resultado += n;
		}
		return resultado;
	}
	
	public long sumarVariosNumeros(long [] numeros)
	{
		int resultado = 0;
		for(long n: numeros)
		{
			resultado += n;
		}
		return resultado;
	}
	
	public int sumarAbsolutos(int n1, int n2)
	{
		int numeroAbsoluto1 = Math.abs(n1);
		int numeroAbsoluto2 = Math.abs(n2);
		return numeroAbsoluto1 + numeroAbsoluto2;
	}
	
}
