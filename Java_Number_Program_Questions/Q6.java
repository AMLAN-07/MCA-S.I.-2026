// Write a program to find the sum of digits of a number.
package Java_Number_Program_Questions;

public class Q6 {
    public int totalSum(int Range){
        return (Range*(Range+1))/2;
    }
    public static void main(String[] args) {
        System.out.println(new Q6().totalSum(10));
    }
    
}
