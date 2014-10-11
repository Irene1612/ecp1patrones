package es.upm.miw.ecp1patrones.vehiculo;

public class Moto extends Vehiculo {

	public static final int DIAS_SEMANA = 7;
	public static final double PRECIO_BASE = 8.0;
	public static final double PRECIO_DESCUENTO = 7.0;

	public Moto(String id, String descripcion) {
		super(id, descripcion);
	}

	@Override
	public double calcularPrecio(int dias) {
		double total = 0.0;
		for (int i = 0; i < dias; i++) {
			if (dias <= DIAS_SEMANA) {
				total += Moto.PRECIO_BASE;
			} else {
				total += Moto.PRECIO_DESCUENTO;
			}
		}
		return total;
	}

	@Override
	public String toString() {
		return "Moto: [id: " + this.id + "], [descripcion: " + this.descripcion
				+ "]";
	}

}
