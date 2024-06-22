package model.imp;

import model.Calculator;
import model.CalculatorWithLog;

//public class IntegerCalculator implements Calculator<Integer> {
public class IntegerCalculator extends CalculatorWithLog<Integer> {
    @Override
    public void pluse(Integer a, Integer b) {
        super.pluse(a, b);
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    @Override
    public void minuse(Integer a, Integer b) {
        super.minuse(a, b);
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    @Override
    public void divide(Integer a, Integer b) {
        super.divide(a, b);
        System.out.println(a + " / " + b + " = " + (a / b));
    }

    @Override
    public void multi(Integer a, Integer b) {
        super.multi(a, b);
        System.out.println(a + " * " + b + " = " + (a * b));
    }
}
