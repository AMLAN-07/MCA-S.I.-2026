// Write a program to check whether a number is a Duck number.
package Java_Number_Program_Questions;

public class Q13 {
    public void checkDuck(String num){
        if(num.contains("0") && num.charAt(0)!='0')
            System.out.println("Duck number");
        else
            System.out.println("Not a Duck number");
        
    }
    public static void main(String[] args) {
    new Q13().checkDuck("0123");
    }
}
