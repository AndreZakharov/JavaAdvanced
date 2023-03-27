package module3;

import module3.operations.*;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private Map<String, IOperation> iOperationMap = new HashMap<>();
    public Calculator() {

        iOperationMap.put("+",new Addition());
        iOperationMap.put("-",new Subtraction());
        iOperationMap.put("*", new Multiplication());
        iOperationMap.put("/", new Division());
    }

    public double calculate(double num1, double num2, String operation) {
        IOperation iOperationMapValue = iOperationMap.getOrDefault(operation, new DefaultWrongOperation(operation));
        return iOperationMapValue.calculateOperation(num1,num2);
    }
}
