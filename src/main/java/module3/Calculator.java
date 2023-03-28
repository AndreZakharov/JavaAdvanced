package module3;

import module3.operations.*;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private double value1;
    private double value2;
    private String operationType;
    private double result;
    private Map<String, IOperation> iOperationMap = new HashMap<>();
    public Calculator() {
    }

    public Calculator(double value1, double value2, String operationType) {
        this.value1 = value1;
        this.value2 = value2;
        this.operationType = operationType;
    }

    public void calculate() {

        iOperationMap.put("+",new Addition());
        iOperationMap.put("-",new Subtraction());
        iOperationMap.put("*", new Multiplication());
        iOperationMap.put("/", new Division());

        IOperation iOperationMapValue = iOperationMap.getOrDefault(operationType, new DefaultWrongOperation(operationType));
        result = iOperationMapValue.calculateOperation(value1, value2);
    }

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public double getResult() {
        return result;
    }
}
