package controller;

import service.CalculatorService;
import service.imp.IntegerCalculatorService;
import service.imp.KompleksCalculatorService;

public class CalculatorController {
//    CalculatorService<Integer> service = new IntegerCalculatorService();
    CalculatorService<Double[]> service = new KompleksCalculatorService();
    public void setValue(String a, String operator, String b) {
        service.setValue(a,operator,b);
    }
}
