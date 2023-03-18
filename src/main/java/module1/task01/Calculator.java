package module1.task01;

import java.io.IOException;
import java.util.Scanner;

/**
 * created on 28.02.22
 * @author Andre
 * @see #additionMethot(double, double)
 */

public class Calculator {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Enter 2 numbers (double, use a comma)");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.printf("%.4f",calculator.additionMethot(a,b));
        scanner.close();
    }

    /**
     *
     * @param a input double first value
     * @param b input double second value
     * @return double addition result
     */
    public double additionMethot(double a,double b){
        return a+b;
    }

    /**
     *
     * @param a input double first value
     * @param b input double second value
     * @returndouble double subtraction result
     */
    public double subtractionMethot(double a,double b){
        return a-b;
    }
    /**
     *
     * @param a input double first value
     * @param b input double second value
     * @returndouble double multiplication result
     */
    public double multiplicationMethot(double a,double b){
        return a*b;
    }
    /**
     *
     * @param a input double first value
     * @param b input double second value
     * @returndouble double division result
     */
    public double divisionMethot(double a,double b){
        return a/b;
    }
}
