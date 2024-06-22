package model.imp;

import model.CalculatorWithLog;
import util.Converter;

import java.util.ArrayList;

public class KompleksCalculator extends CalculatorWithLog<ArrayList<Double>> {
    Converter converter = new Converter();

    @Override
    public void pluse(ArrayList<Double> var1, ArrayList<Double> var2) {
        super.pluse(var1, var2);
        double a = var1.getFirst();
        double b = var1.getLast();
        double c = var2.getFirst();
        double d = var2.getLast();
        ArrayList<Double> rez = new ArrayList<>();
        rez.add(a + c);
        rez.add(b + d);
        System.out.println(converter.convertComplexToString(var1) + "    +    " + converter.convertComplexToString(var2) + "    =    " + converter.convertComplexToString(rez));
    }

    @Override
    public void minuse(ArrayList<Double> var1, ArrayList<Double> var2) {
        super.minuse(var1, var2);
        double a = var1.getFirst();
        double b = var1.getLast();
        double c = var2.getFirst();
        double d = var2.getLast();
        ArrayList<Double> rez = new ArrayList<>();
        rez.add(a - c);
        rez.add(b - d);
        System.out.println(converter.convertComplexToString(var1) + "    -    " + converter.convertComplexToString(var2) + "    =    " + converter.convertComplexToString(rez));
    }

    @Override
    public void divide(ArrayList<Double> var1, ArrayList<Double> var2) {
        super.divide(var1, var2);
        ArrayList<Double> rez = new ArrayList<>();
        double a = var1.getFirst();
        double b = var1.getLast();
        double c = var2.getFirst();
        double d = var2.getLast();
        double first = (a * c + b * d) / (c * c + d * d);
        double second = (b * c - a * d) / (c * c + d * d);
        rez.add(first);
        rez.add(second);
        System.out.println(converter.convertComplexToString(var1) + "    /    " + converter.convertComplexToString(var2) + "    =    " + converter.convertComplexToString(rez));
    }

    @Override
    public void multi(ArrayList<Double> var1, ArrayList<Double> var2) {
        super.multi(var1, var2);
        ArrayList<Double> rez = new ArrayList<>();
        double a = var1.getFirst();
        double b = var1.getLast();
        double c = var2.getFirst();
        double d = var2.getLast();
        double first = (a * c - b * d);
        double second = (a*d+b*c);
        rez.add(first);
        rez.add(second);
        System.out.println(converter.convertComplexToString(var1) + "    /    " + converter.convertComplexToString(var2) + "    =    " + converter.convertComplexToString(rez));
    }
}
