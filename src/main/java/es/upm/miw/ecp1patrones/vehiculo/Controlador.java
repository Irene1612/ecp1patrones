package es.upm.miw.ecp1patrones.vehiculo;

import upm.jbb.IO;

public class Controlador {

    private GestorVehiculo gestorVehiculo = new GestorVehiculo();
    
    public void mostrarVehiculos(){
    	IO.out.println(gestorVehiculo.toString());
    }
    
    public void mostrarFormAltaCoche(){
    	this.gestorVehiculo.aniadirVehiculo((Vehiculo) IO.in.read(Coche.class, "Introduzca un id y una descripción."));
    }
    
    public void mostrarFormAltaMoto(){
    	this.gestorVehiculo.aniadirVehiculo((Vehiculo) IO.in.read(Moto.class, "Introduzca un id y una descripción."));
    }
    
    public void mostrarFormAltaBicicleta(){
    	this.gestorVehiculo.aniadirVehiculo((Vehiculo) IO.in.read(Bicicleta.class, "Introduzca un id y una descripción."));
    }
    
    public void mostrarPrecio(){
        IO.out.println(this.gestorVehiculo.buscarVehiculo(IO.in.readString("Introduzca en id del vehículo.")).calcularPrecio(IO.in.readInt("Introduzca el número de días a alquilar.")) + "€");
    }
}
