// Write a program to check whether a number is palindrome or not.
package Java_Number_Program_Questions;

public class Q8 {
    public String palindromCheck(int num){

         char digits[] = String.valueOf(num).toCharArray();

        int left = 0;
        int right = digits.length - 1;

        while (left < right) {
            if(digits[left]!=digits[right]) return "False";
            left++;
            right--;
        }
        return "Palindrom Number";
    }
    public static void main(String[] args) {
        System.out.println(new Q8().palindromCheck(12321));
    }
}
