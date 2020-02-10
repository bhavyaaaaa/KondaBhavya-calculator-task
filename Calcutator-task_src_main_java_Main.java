import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        Input i = new Input();
        double array[] = i.getnumbers();
        double num1 = array[0];
        double num2 = array[1];
        String op = i.getoperand();
        Serializable c = Calculate.compute(num1, num2, op);
        System.out.println(num1 + " " + op + " " + num2 + " = " + c);
    }
}
