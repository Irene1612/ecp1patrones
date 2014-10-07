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
		coches[0] = new Coche("id1", "Automático", Categoria.A);
		coches[1] = new Coche("id2", "Manual", Categoria.B);
		coches[2] = new Coche("id3", "Manual", Categoria.C);
	}

	@Test
	public void testCalcularPrecio() {
		
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}
