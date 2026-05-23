// Write a program to print the Fibonacci series up to N terms.
package Java_Number_Program_Questions;

public class Q18 {
    public void printFibonacci(int n) {
        int a = 1, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        new Q18().printFibonacci(10);
    }
}
