// Write a program to swap two numbers using a third variable.
package Java_Number_Program_Questions;
import java.util.Scanner;
public class Q4 {
    Scanner sc = new Scanner(System.in);
    public void swapWithTemp() {
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    public static void main(String[] args) {
        new Q4().swapWithTemp();
    }
}
