package es.upm.miw.ecp1patrones.vehiculo;

public abstract class Vehiculo {
	protected String id;
	protected String descripcion;

	public Vehiculo(String id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
	}

	public abstract double calcularPrecio(int dias);

	public abstract String toString();
}
