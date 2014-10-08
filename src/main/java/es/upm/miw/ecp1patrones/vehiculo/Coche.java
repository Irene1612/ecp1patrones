package es.upm.miw.ecp1patrones.vehiculo;

public class Coche extends Vehiculo {

	private Categoria categoria;

	public Coche(String id, String descripcion, Categoria categoria) {
		super(id, descripcion);
		this.categoria = categoria;
	}

	@Override
	public double calcularPrecio(int dias) {
		
		return 0.0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
