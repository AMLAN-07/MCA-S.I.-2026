// Write a program to check whether a number is an Armstrong number.
package Java_Number_Program_Questions;
import java.lang.Math;
public class Q10 {
    public void checkArmstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = String.valueOf(n).length();
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        if (sum == original)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }

    public static void main(String[] args) {
    new Q10().checkArmstrong(15);
    }
}
