package model;

public abstract class Calculator<T> {
    public Calculator() {
        System.out.println("Базовый калькулятор");
    }

    public void pluse(T a, T b) {
        System.out.println("метод по умолчанию");
    }

    public void minuse(T a, T b) {
        System.out.println("метод по умолчанию");
    }

    public void multi(T a, T b) {
        System.out.println("метод по умолчанию");
    }

    public void divide(T a, T b) {
        System.out.println("метод по умолчанию");
    }
}
