package service.imp;

import model.Calculator;
import model.imp.IntegerCalculator;
import service.CalculatorService;
import util.Converter;

public class IntegerCalculatorService implements CalculatorService<Integer> {
    Calculator<Integer> calculator = new IntegerCalculator();
    Converter converter = new Converter();

    @Override
    public void setValue(String var1, String operator, String var2) {
        System.out.println();
        int a = converter.convertToInt(var1);
        int b = converter.convertToInt(var2);
        switch (operator) {
            case "+" -> {
                calculator.pluse(a, b);
            }
            case "-" -> {
                calculator.minuse(a, b);
            }
            case "/" -> {
                calculator.divide(a, b);
            }
            case "*" -> {
                calculator.multi(a,b);
            }
        }
    }
}
