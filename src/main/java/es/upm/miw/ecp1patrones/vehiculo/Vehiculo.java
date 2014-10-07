package es.upm.miw.ecp1patrones.vehiculo;

public abstract class Vehiculo {
    protected String id;
    protected String descripcion;   
    
    public abstract int calcularPrecio();
    public abstract String toString();
}
