package es.upm.miw.ecp1patrones.vehiculo;

public enum Categoria {
    A(10), B(15), C(20);

    public final int precioBase;

    private Categoria(final int precioBase) {
        this.precioBase = precioBase;
    }
}
