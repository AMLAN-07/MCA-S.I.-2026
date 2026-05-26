package com.Day3_Exception;

public class ThreadDemo extends Thread {
    public void printAlphabets() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
            try {
                Thread.sleep(400); // Sleep for 400 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
    public static void main(String[] args) {

         new ThreadDemo().printAlphabets();

         System.out.println(Thread.currentThread());
         System.out.println("Thread execution completed.");
    }
}
