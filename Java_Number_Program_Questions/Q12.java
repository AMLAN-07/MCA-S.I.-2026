// Write a program to check whether a number is a Spy number.
package Java_Number_Program_Questions;

public class Q12 {
    public String checkSpy(int num){
        int product=1;
        int sum=0;
        char digits[] = String.valueOf(num).toCharArray();
        for(char c : digits){
            int digit = Character.getNumericValue(c);
            product *= digit;
            sum += digit;
        }
        if(product == sum)
            return "Spy number";
        else
            return "Not a Spy number";
    }
    public static void main(String[] args) {
        System.out.println(new Q12().checkSpy(123));
    }
}
