package com.Day3_Exception;

public class ExceptionDemo {

    public void printStar()
    {
        for(int i=0; i<5; i++)
        {
            System.out.print("* ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void greet(String name) throws InterruptedException {
        String msg = "Hello "+name;
        for(char ch: msg.toCharArray())
        {
            System.out.print(ch);
            Thread.sleep(300);
        }

    }
    public static void main(String[] args) throws InterruptedException {
        ExceptionDemo demo = new ExceptionDemo();
        demo.printStar();
        ExceptionDemo demo1 = new ExceptionDemo();
        demo1.greet("Amlan");
    }
}
