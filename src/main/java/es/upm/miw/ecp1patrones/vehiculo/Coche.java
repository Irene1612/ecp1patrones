package es.upm.miw.ecp1patrones.vehiculo;

public class Coche extends Vehiculo {

	private Categoria categoria;
	private static final int DIA_FIN_PRIMER_INTERVALO = 3;
	private static final int DIA_FIN_SEGUNDO_INTERVALO = 7;
	private static final double PRIMER_DESCUENTO = 0.8;
	private static final double SEGUNDO_DESCUENTO = 0.5;

	public Coche(String id, String descripcion, Categoria categoria) {
		super(id, descripcion);
		this.categoria = categoria;
	}

	@Override
	public double calcularPrecio(int dias) {
		double total = 0.0;
		if (dias > 0) {
			for (int i = 1; i <= dias; i++) {
				if (i <= DIA_FIN_PRIMER_INTERVALO) {
					total += this.categoria.precioBase;
				} else if (i > DIA_FIN_PRIMER_INTERVALO && i <= DIA_FIN_SEGUNDO_INTERVALO) {
					total += this.categoria.precioBase * PRIMER_DESCUENTO;
				} else {
					total += this.categoria.precioBase * SEGUNDO_DESCUENTO;
				}
			}
		}
		return total;
	}

	@Override
	public String toString() {
		return "Coche: [id: " + this.id + "], [descripcion: "
				+ this.descripcion + "]";
	}

}
