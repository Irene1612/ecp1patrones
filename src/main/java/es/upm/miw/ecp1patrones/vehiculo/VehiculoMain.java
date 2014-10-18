package es.upm.miw.ecp1patrones.vehiculo;

import upm.jbb.IO;

public class VehiculoMain {

	public static void main(String[] args) {
		Controlador controlador = new Controlador();
		IO.out.addController(controlador);
	}
}
