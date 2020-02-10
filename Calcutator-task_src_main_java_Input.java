import java.util.Scanner;

public class Input {
    Scanner sc = new Scanner(System.in);

    public double[] getnumbers() {
        System.out.println("--CALCULATOR--");
        System.out.println("ADDITION SUBTRACTION DIVISION MULTIPLICATION");
        System.out.println("Enter two numbers:");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double arr[] = {num1, num2};
        return arr;

    }

    public String getoperand() {
        System.out.println("Enter operand");
        String op = sc.next();
        return op;
    }
}
