package es.upm.miw.ecp1patrones.operaciones;

public class Operations {
    private MathematicalOperation[] operators = new MathematicalOperation[10];

    public void add(MathematicalOperation operator) {
        for (int i = 0; i < operators.length; i++) {
            if (operators[i] == null) {
                operators[i] = operator;

                return;
            }
        }
        return;
    }

    public void reset() {
        for (int i = 0; i < operators.length; i++) {
            operators[i] = null;
        }
    }

    public int total() {
        int result = 0;
        String separator = "";
        for (MathematicalOperation operando : operators) {
            if (operando != null) {
                System.out.print(separator + operando.toString());
                result += operando.calculateOperation();
            }
            separator = "+";
        }
        System.out.print(">>> ");
        return result;
    }
}
