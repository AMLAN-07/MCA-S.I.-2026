//  Write a program to count the number of digits in a number.
package Java_Number_Program_Questions;

public class Q9 {
    public int countDigit(int num){

        char digits[] = String.valueOf(num).toCharArray();
        int size = digits.length;

        return size;
    }
    public static void main(String[] args) {
        System.out.println(new Q9().countDigit(12345));
    }
}
