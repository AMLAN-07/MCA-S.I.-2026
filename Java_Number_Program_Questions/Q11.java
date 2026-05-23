// Write a program to check whether a number is a Neon number.
package Java_Number_Program_Questions;
public class Q11 {
    public String checkNeon(int num){
        int squre=num*num;
        char digits[] = String.valueOf(squre).toCharArray();
        int sum=0;
        for(char c : digits){
            sum += Character.getNumericValue(c);
        }
        if(sum == num)
            return "Neon number";
        else
            return "Not a Neon number";
    }
    public static void main(String[] args) {
        System.out.println(new Q11().checkNeon(1));
    }
}
