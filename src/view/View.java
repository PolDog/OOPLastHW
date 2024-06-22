package view;

import controller.CalculatorController;
import util.Operators;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class View {
    CalculatorController controller = new CalculatorController();
    private final List<String> validOperators;

    public View() {
        this.validOperators = Arrays.stream(Operators.values())
                .map(Operators::operator)
                .collect(Collectors.toList());
    }

    public void start() {
        String varA = getStringValue("Введите первое число");
        String operator = getOperator("Введите требуемый математический оператор ( + , - , * , / )");
        String varB = getStringValue("Введите второе число");
        controller.setValue(varA,operator,varB);
    }
    private String getStringValue(String text) {
        System.out.println(text);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private String getOperator(String text) {
        System.out.println(text);
        Scanner scanner = new Scanner(System.in);
        String operator = scanner.nextLine();
        while (true) {
            if (isInvalidOperator(operator)) {
                System.err.println("Введен неверный оператор. " + "Используйте символы (*, +, /, -) : ");
                operator = scanner.nextLine();
            } else return operator;
        }
    }
    private boolean isInvalidOperator(String operator) {
        return !validOperators.contains(operator);
    }
}
