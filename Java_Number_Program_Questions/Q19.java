//  Write a program to find the factorial of a number.
package Java_Number_Program_Questions;

public class Q19 {
    public int findFactorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * findFactorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(new Q19().findFactorial(5));
    }
}
