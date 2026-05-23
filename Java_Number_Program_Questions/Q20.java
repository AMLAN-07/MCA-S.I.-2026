// Write a program to find the GCD (Greatest Common Divisor) of two numbers
package Java_Number_Program_Questions;

public class Q20 {
   public int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(new Q20().findGCD(10, 0));
    } 
}
