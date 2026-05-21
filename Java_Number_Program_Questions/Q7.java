// Write a program to reverse a number.
package Java_Number_Program_Questions;

public class Q7 {
    public int reverse(int num){
       
        char digits[] = String.valueOf(num).toCharArray();

        int left = 0;
        int right = digits.length - 1;

        while (left < right) {
            char temp = digits[left];
            digits[left++] = digits[right];
            digits[right--] = temp;

            // left++;
            // right--;
        }

        return Integer.parseInt(new String(digits));
    }
    public static void main(String[] args) {
        System.out.println(new Q7().reverse(2000));
    }
}
