package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumAOfDiffAndDiv(double first, double second) {
        return sum(diff(first, second), division(first, second));
    }

    public static double sumAOfAllOperations(double first, double second) {
        return sum(sumAndMultiply(first, second), sumAOfDiffAndDiv(first, second));
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAOfAllOperations(10, 20));
    }
}
