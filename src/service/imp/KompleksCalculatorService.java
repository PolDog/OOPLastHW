package service.imp;

import model.Calculator;
import model.imp.KompleksCalculator;
import service.CalculatorService;
import util.Converter;

import java.util.ArrayList;

public class KompleksCalculatorService implements CalculatorService<Double[]>
{
    Converter converter = new Converter();
    Calculator calculator = new KompleksCalculator();
    @Override
    public void setValue(String var1, String operator, String var2) {
        ArrayList<Double> a = converter.convertToComplex(var1);
        ArrayList<Double> b = converter.convertToComplex(var2);
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
