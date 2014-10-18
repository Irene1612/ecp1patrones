package es.upm.miw.ecp1patrones.vehiculo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MotoTest extends VehiculoTest {

	private Vehiculo moto;	

	@Before
	public void before() {
		moto = new Moto("id4", "220cc");
	}

	@Test
	public void testCalcularPrecio() {
		assertEquals(8.0, this.moto.calcularPrecio(1), 10e-3);
		assertEquals(24.0, this.moto.calcularPrecio(3), 10e-3);
		assertEquals(56.0, this.moto.calcularPrecio(7), 10e-3);
		assertEquals(56.0, this.moto.calcularPrecio(8), 10e-3);		
	}

	@Test
	public void testToString() {
		assertEquals("Moto: [id: id4], [descripcion: 220cc]", moto.toString());
	}
}
