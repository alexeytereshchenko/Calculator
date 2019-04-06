package sample;

public class Operations {

    public long operationsLong(long number1, long number2, String operations) {

        long result;
        String ret;

        switch (operations) {
            case "+":
                return result = number1 + number2;
            case "-":
                return result = number1 - number2;
            case "*":
                return result = number1 * number2;
            case "/":
                result = number1 / number2;
                if (result == 0) result = 0;
        }
        return  0;
    }

    public double operationsDouble(double a, double b, String operations) {

        double result;
        String ret;

        switch (operations) {
            case "+":
                return result = a + b;
            case "-":
                return result = a - b;
            case "*":
                return result = a * b;
            case "/":
                 result = a / b;
            if (result == 0) result = 0;
            return result;
//            default:
//                return "Unknown operations!!! ";
        }
//            return result;
        return 0;
        }
}