package model;

import com.sun.tools.javac.Main;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculatorWithLog<T> extends Calculator<T> {
    Logger logger;

    public CalculatorWithLog() {
        logger = Logger.getLogger(Main.class.getName());
        logger.log(Level.INFO, "Логи включены");
    }

    @Override
    public void pluse(T a, T b) {
        logger.log(Level.INFO, "сложение");
    }

    @Override
    public void minuse(T a, T b) {
        logger.log(Level.INFO, "операция вычитание");
    }

    @Override
    public void multi(T a, T b) {
        logger.log(Level.INFO, "операция умножение");
    }

    @Override
    public void divide(T a, T b) {
        logger.log(Level.INFO, "операция деление");
    }
}
