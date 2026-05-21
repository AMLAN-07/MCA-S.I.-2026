// Write a program to check whether a number is positive, negative, or zero.
package Java_Number_Program_Questions;

import java.util.Scanner;

public class Q2 {
    Scanner sc=new Scanner(System.in);
    public String checkNumber()
    {
        System.out.println("Enter your number");
        int num =sc.nextInt();
        if(num==0)return "Nutral";
        return num>0?"+ve":"-ve";
    }
    public static void main(String[] args) {
        System.out.println(new Q2().checkNumber());
    }
}
