// extends Principal esta a modo de ejemplo
// herencia solo para 1 clase
// interface pueden ser varias (se separan por comas)
public class Calculadora extends Principal implements IOperaciones{

	@Override
	public int sumar(int numero1, int numero2) {
		return numero1 + numero2;
	}

	@Override
	public int restar(int numero1, int numero2) {
		return numero1 - numero2;
	}

	@Override
	public double dividir(int numero1, int numero2) {
		return numero1 / numero2;
	}

	@Override
	public long multiplicacion(int numero1, int numero2) {
		return numero1 * numero2;
	}

}
