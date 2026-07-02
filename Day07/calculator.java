package Day07;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Addition = " + c.add(10, 20));
        System.out.println("Multiplication = " + Calculator.multiply(10, 20));
    }
}
