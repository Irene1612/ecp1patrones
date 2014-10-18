package es.upm.miw.ecp1patrones.vehiculo;

import java.util.HashMap;
import java.util.Map;

public class GestorVehiculo {

	private Map<String, Vehiculo> vehiculos = new HashMap<>();

	public Map<String, Vehiculo> obtenerMapVehiculos() {
		return this.vehiculos;
	}

	public void aniadirVehiculo(Vehiculo vehiculo) {
		vehiculos.put(vehiculo.id, vehiculo);
	}

	public Vehiculo buscarVehiculo(String id) {
		assert vehiculos.get(id)!=null : "El veh�culo no ha sido a�adido.";
		return vehiculos.get(id);
	}

	public String toString() {
		return vehiculos.toString();
	}
}
