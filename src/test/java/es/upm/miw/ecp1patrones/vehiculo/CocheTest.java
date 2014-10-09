package es.upm.miw.ecp1patrones.vehiculo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CocheTest {

	private static final int NUM_CATEGORIAS = 3;
	private Vehiculo[] coches;	

	@Before
	public void before() {
		coches = new Coche[NUM_CATEGORIAS];
		coches[0] = new Coche("id1", "Automatico", Categoria.A);
		coches[1] = new Coche("id2", "Manual", Categoria.B);
		coches[2] = new Coche("id3", "Manual", Categoria.C);
	}

	@Test
	public void testCalcularPrecio() {
		assertEquals(10.0, this.coches[0].calcularPrecio(1), 10e-3);
		assertEquals(30.0, this.coches[0].calcularPrecio(3), 10e-3);
		assertEquals(38.0, this.coches[0].calcularPrecio(4), 10e-3);
		assertEquals(62.0, this.coches[0].calcularPrecio(7), 10e-3);
		assertEquals(67.0, this.coches[0].calcularPrecio(8), 10e-3);
		assertEquals(15.0, this.coches[1].calcularPrecio(1), 10e-3);
		assertEquals(45.0, this.coches[1].calcularPrecio(3), 10e-3);
		assertEquals(57.0, this.coches[1].calcularPrecio(4), 10e-3);
		assertEquals(93.0, this.coches[1].calcularPrecio(7), 10e-3);
		assertEquals(100.5, this.coches[1].calcularPrecio(8), 10e-3);
		assertEquals(20.0, this.coches[2].calcularPrecio(1), 10e-3);
		assertEquals(60.0, this.coches[2].calcularPrecio(3), 10e-3);
		assertEquals(76.0, this.coches[2].calcularPrecio(4), 10e-3);
		assertEquals(124.0, this.coches[2].calcularPrecio(7), 10e-3);
		assertEquals(134.0, this.coches[2].calcularPrecio(8), 10e-3);
	}

	@Test
	public void testToString() {
		assertEquals("Coche: [id: id1], [descripcion: Automatico]", coches[0].toString());
	}

}
