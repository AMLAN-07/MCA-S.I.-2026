//  Write a program to check whether a number is a Strong number.
package Java_Number_Program_Questions;

public class Q14 {
    public String checkStrong(int num){
        int original=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact *= i;
            }
            sum += fact;
            num /= 10;
        }
        if(sum == original)
            return "Strong number";
        else
            return "Not a Strong number";
    }
    public static void main(String[] args) {
        System.out.println(new Q14().checkStrong(145));
    }
}
