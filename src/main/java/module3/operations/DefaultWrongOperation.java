package module3.operations;

import java.util.InputMismatchException;

public class DefaultWrongOperation implements IOperation{
    private String erroneousStatement;

    public DefaultWrongOperation(String erroneousStatement) {
        this.erroneousStatement = erroneousStatement;
    }

    @Override
    public double calculateOperation(double variable1, double variable2) {
        throw new InputMismatchException("Invalid input value : " + erroneousStatement);
    }
}
