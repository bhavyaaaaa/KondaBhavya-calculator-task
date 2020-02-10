package Operations;

public class Addition implements Calculator {

    public void compute1(double num1, double num2) {
        System.out.println(num1 + num2);
    }

    @Override
    public double compute(double a, double b) {
        return a + b;
    }
}