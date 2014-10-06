package es.upm.miw.ecp1patrones.operaciones;

public class Multiplication extends MathematicalOperation {
    public Multiplication(final int operator1, final int operator2) {
        super(operator1, operator2);
    }

    public int calculateOperation() {
        return this.operator1 * this.operator2;
    }

    @Override
    public String toString() {
        return "[" + operator1 + "*" + operator2 + "]";
    }
}
