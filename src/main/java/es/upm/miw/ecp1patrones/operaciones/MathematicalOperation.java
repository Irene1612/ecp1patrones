package es.upm.miw.ecp1patrones.operaciones;

public abstract class MathematicalOperation {
    protected final int operator1, operator2;   

    public MathematicalOperation(final int operator1, final int operator2) {
        this.operator1 = operator1;
        this.operator2 = operator2;
    }

    public int getOperator1() {
        return operator1;
    }

    public int getOperator2() {
        return operator2;
    }

    public abstract int calculateOperation();

    public abstract String toString();

}
