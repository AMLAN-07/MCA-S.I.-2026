//  Write a program to check whether a number is a Perfect number.
package Java_Number_Program_Questions;

public class Q15 {
    public String checkPerfect(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
                sum += i;
        }
        if(sum == num)
            return "Perfect number";
        else
            return "Not a Perfect number";
    }
    public static void main(String[] args) {
        System.out.println(new Q15().checkPerfect(28));
    }
}
