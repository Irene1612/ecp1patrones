package es.upm.miw.ecp1patrones.vehiculo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BicicletaTest {

	private Vehiculo bici;	

	@Before
	public void before() {
		bici = new Bicicleta("id1", "Eléctrica");
	}

	@Test
	public void testCalcularPrecio() {
		assertEquals(3.0, this.bici.calcularPrecio(1), 10e-3);
		assertEquals(6.0, this.bici.calcularPrecio(2), 10e-3);
		assertEquals(8.0, this.bici.calcularPrecio(3), 10e-3);
		assertEquals(12.0, this.bici.calcularPrecio(4), 10e-3);		
	}

	@Test
	public void testToString() {
		assertEquals("Bicicleta: [id: id1], [descripcion: Eléctrica]", bici.toString());
	}
}
