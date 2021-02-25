package aljahmer.nothing.thelastday.oreilly;

import java.security.InvalidParameterException;
import java.util.ArrayList;

public abstract interface CalculatorOperation {

    void perform();
}

class Addition implements CalculatorOperation {

    private double left;
    private double right;
    private double result;

    public Addition(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public double getRight() {
        return right;
    }

    public double getLeft() {
        return left;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public void setRight(double right) {
        this.right = right;
    }

    // constructor, getters and setters
    @Override
    public void perform() {
        result = left + right;
        System.out.println(result);
    }
}

class Division implements CalculatorOperation {

    private double left;
    private double right;
    private double result;

    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getRight() {
        return right;
    }

    public void setRight(double right) {
        this.right = right;
    }

    public Division(double left, double right) {
        this.left = left;
        this.right = right;

    }

    // constructor, getters and setters
    @Override
    public void perform() {
        if (right != 0) {
            result = left / right;
            System.out.println(result);
        }
    }
}

class Calculator {

    public float parseFloat(String s) {
        float f = 0.0f;
        try {
            f = Float.valueOf(s).floatValue();
            return f;
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid input " + s);
            f = Float.NaN;
            return f;
        } finally {
            System.out.println("finally");
        }
        // return f; unreachable
    }

    public void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Cannot perform operation");
        }
        operation.perform();
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.calculate(new Division(10, 5));
    }
}

class Sup {

    protected void method(int i) {
        System.out.println("Sup " + i);
    }
}

class Sub extends Sup {

    private void method(long x) {
        System.out.println("Sub " + x);
    }

    public static void main(String[] args) {

        Sub sub = new Sub();
        sub.method(2);
        sub.method(3l);
    }
}

class h {

    public static void main(String[] args) {

        ArrayList arr = new ArrayList();

       
    }
}
