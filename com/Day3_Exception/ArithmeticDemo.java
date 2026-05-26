package com.Day3_Exception;

public class ArithmeticDemo {
    public void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
    public static void main(String[] args) {
        ArithmeticDemo demo = new ArithmeticDemo();
        demo.divide(10, 2); // Valid division
        demo.divide(10, 0); // This will cause an exception
    }
}
