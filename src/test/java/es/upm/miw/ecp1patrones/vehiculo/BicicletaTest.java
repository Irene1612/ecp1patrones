package es.upm.miw.ecp1patrones.vehiculo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BicicletaTest extends VehiculoTest {

	private Vehiculo bici;	

	@Before
	public void before() {
		bici = new Bicicleta("id5", "El�ctrica");
	}

	@Test
	public void testCalcularPrecio() {
		assertEquals(3.0, this.bici.calcularPrecio(1), 10e-3);
		assertEquals(6.0, this.bici.calcularPrecio(2), 10e-3);
		assertEquals(8.0, this.bici.calcularPrecio(3), 10e-3);
		assertEquals(12.0, this.bici.calcularPrecio(5), 10e-3);		
	}

	@Test
	public void testToString() {
		assertEquals("Bicicleta: [id: id5], [descripcion: El�ctrica]", bici.toString());
	}
}
