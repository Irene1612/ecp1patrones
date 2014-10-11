package es.upm.miw.ecp1patrones.vehiculo;

public class Bicicleta extends Vehiculo {

	public static final int DIAS_PRECIO_BASE = 2;
	public static final double PRECIO_BASE = 3.0;
	public static final double PRECIO_DESCUENTO = 2.0;

	public Bicicleta(String id, String descripcion) {
		super(id, descripcion);
	}

	@Override
	public double calcularPrecio(int dias) {
		double total = 0.0;
		for (int i = 1; i <= dias; i++) {
			if (i <= DIAS_PRECIO_BASE) {
				total += Bicicleta.PRECIO_BASE;
			} else {
				total += Bicicleta.PRECIO_DESCUENTO;
			}
		}
		return total;
	}

	@Override
	public String toString() {
		return "Bicicleta: [id: " + this.id + "], [descripcion: "
				+ this.descripcion + "]";

	}

}
