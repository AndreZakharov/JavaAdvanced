package module3.operations;

public class Division implements IOperation{

    @Override
    public double calculateOperation(double variable1, double variable2) {
        if (variable2 == 0) throw new IllegalArgumentException("Divide by zero error");
        return variable1 / variable2;
    }
}
