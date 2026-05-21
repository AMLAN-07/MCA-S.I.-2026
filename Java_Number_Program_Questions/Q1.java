//Q.1 Write a program to check whether a number is even or odd.
package Java_Number_Program_Questions;

import java.util.Scanner;

public class Q1 {
    Scanner sc = new Scanner(System.in);
    public String checkEven(){
        System.out.println("Enter your number");
        int num=sc.nextInt();
        return ((num%2==0)?"Even":"Odd");
    }
    public static void main(String[] args) {
        Q1 EO=new Q1();
        System.out.println(EO.checkEven());
    }
}
