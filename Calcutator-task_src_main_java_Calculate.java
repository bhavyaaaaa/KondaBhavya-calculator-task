import Operations.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

class Calculate {
    public static Serializable compute(double num1, double num2, String op) {
        Calculator operation[] = {new Addition(), new Subtraction(), new Division(), new Multiplication()};
        String op1[] = {"+", "-", "*", "/"};
        //List<String> list = Arrays.asList(op1);
        int val = 0;
        if (op == "+" || op == "-" || op == "*" || op == "/") {

            for (int i = 0; i < 4; i++) {
                if (op.equals(op1[i])) {
                    val = i;
                    break;
                }
            }
        } else
            return "INVALID OPERATOR";
        return operation[val].compute(num1, num2);
    }

}

