package module2.task02;

import module1.task01.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorOperations {
    /**
     * created on 18.03.23
     * @author Andre
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        CalculatorOperations calculatorOperations = new CalculatorOperations();
        System.out.println("Enter number of task: (1 - calculator, 2 - string array)");
        int numberOfTask = Integer.parseInt(bufferedReader.readLine());
        switch (numberOfTask) {
            case 1 -> calculatorOperations.calculatorMethod(bufferedReader);
            case 2 -> calculatorOperations.stringArrayMethod(bufferedReader);
        }
    }

    /**
     * method for finding the longest word
     * @param bufferedReader
     * @throws IOException
     */
    private void stringArrayMethod(BufferedReader bufferedReader) throws IOException {
        System.out.println("Enter array size");
        int arraySize = Integer.parseInt(bufferedReader.readLine());
        String[] array = new String[arraySize];
        System.out.println("Enter words for array");
        for (int i = 0; i < array.length; i++) {
            array[i] = bufferedReader.readLine();
        }
        String maxWord = array[0];
        for (String string:array
             ) {
            if (maxWord.length() < string.length()){
                maxWord = string;
            }
        }
        System.out.println("Longest word: " + maxWord);
    }

    /**
     * method for calculator
     * @param bufferedReader
     * @throws IOException
     */
    private void calculatorMethod(BufferedReader bufferedReader) throws IOException {
        Calculator calculator = new Calculator();
        System.out.println("Enter the first number");
        double a = Double.parseDouble(bufferedReader.readLine());
        System.out.println("Enter operation: 1 - addition\n" +
                "2 - subtraction\n" +
                "3 - multiplication\n" +
                "4 - division");
        int operation = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter the second number:");
        double b = Double.parseDouble(bufferedReader.readLine());
        switch (operation){
            case 1 -> System.out.printf("%.4f",calculator.additionMethot(a,b));
            case 2 -> System.out.printf("%.4f",calculator.subtractionMethot(a,b));
            case 3 -> System.out.printf("%.4f",calculator.multiplicationMethot(a,b));
            case 4 -> System.out.printf("%.4f",calculator.divisionMethot(a,b));
        }

    }
}
