package module3.operations;

public class Subtraction implements IOperation{
    @Override
    public double calculateOperation(double variable1, double variable2) {
        return variable1 - variable2;
    }
}
