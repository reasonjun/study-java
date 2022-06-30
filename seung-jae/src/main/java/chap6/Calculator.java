package chap6;

public enum Calculator {
    ADD("+") {
        @Override
        public double calculate(double a, double b) {
            return a + b;
        }
    },
    SUB("-") {
        @Override
        double calculate(double a, double b) {
            return a - b;
        }
    },
    MUL("*") {
        @Override
        double calculate(double a, double b) {
            return a * b;
        }
    },
    DIV("/") {
        @Override
        double calculate(double a, double b) {
            return a / b;
        }
    };

    private final String operator;

    abstract double calculate(double a, double b);

    Calculator(String operator) {
        this.operator = operator;
    }
}
