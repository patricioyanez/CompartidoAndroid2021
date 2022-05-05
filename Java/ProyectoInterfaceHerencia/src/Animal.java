import java.util.ArrayList;

public class Animal implements IParametros{
	private int id;
	private int cantidadOjos;
	private int patas;
	
	
	public int getCantidadOjos() {
		return cantidadOjos;
	}
	public void setCantidadOjos(int cantidadOjos) {
		this.cantidadOjos = cantidadOjos;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	@Override
	public String comer() {	

		return "El animal esta comiendo";
	}
	@Override
	public String mover() {
		return "El animal se está moviendo";
	}
	@Override
	public ArrayList<Animal> listar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int guardar(ArrayList<?> lista) {
		
		(ListArray<Animal>)lista.get(0);
		ArrayList<Animal> lst=(Animal)(lista);
		lst.get(0).comer();
		return 0;
	}
	@Override
	public int modificar() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int eliminar() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
