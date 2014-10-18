package es.upm.miw.ecp1patrones.vehiculo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GestorVehiculoTest {
    
    private GestorVehiculo gestorVehiculo;
    
    @Before
    public void before(){
        this.gestorVehiculo = new GestorVehiculo();        
    }

    @Test
    public void testAniadirBuscarVehiculo() {
    	gestorVehiculo.aniadirVehiculo(new Coche("coche1", "Automático", Categoria.A));
    	Vehiculo vehiculo = gestorVehiculo.buscarVehiculo("coche1");
    	assertEquals("coche1", vehiculo.id);
    	assertEquals("Automático", vehiculo.descripcion);
    }

//    @Test
//    public void testToString() {
//        fail("Not yet implemented");
//    }

}
