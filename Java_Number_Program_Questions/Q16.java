// Write a program to check whether a number is a Prime number.
package Java_Number_Program_Questions;

public class Q16 {
    public String checkPrime(int num){
        if(num <= 1)
            return "Not a Prime number";
        for(int i=2;i*i<=num;i++){
            if(num%i==0)
                return "Not a Prime number";
        }
        return "Prime number";
    }
    public static void main(String[] args) {
        System.out.println(new Q16().checkPrime(2));
    }
    
}
