package io.github.hexiangyuan.testdemo;

/**
 * Creator:HeXiangYuan
 * Date  : 16-11-18
 */

public class Calculator {

    public int add(int one, int another) {
        return one + another;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Dividor can be 0");
        }
        return a / b;
    }

    public int sub(int one, int another) {
        return one - another;
    }
}
