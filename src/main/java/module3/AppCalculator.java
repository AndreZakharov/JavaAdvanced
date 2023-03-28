package module3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two numbers (double) and operation like : +, -, *, / , smthg");
        double num1 = 0.;
        double num2 = 0.;
        String operation = "0";
        try {
            num1 = Double.parseDouble(bufferedReader.readLine());
            num2 = Double.parseDouble(bufferedReader.readLine());
            operation = bufferedReader.readLine();
        } catch (NumberFormatException | IOException e) {
            throw new RuntimeException(e);
        }

        Calculator calculator = new Calculator(num1,num2,operation);
        calculator.calculate();
        System.out.println("Result : " + calculator.getResult());
    }
}
