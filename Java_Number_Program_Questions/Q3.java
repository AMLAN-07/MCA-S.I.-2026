// Write a program to find the largest of three numbers.
package Java_Number_Program_Questions;

import java.util.Scanner;

public class Q3 {
    Scanner sc= new Scanner(System.in);
    int a,b,c;
    public int findLargest() {
        System.out.println("Enter 3 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        return (c>=a && c>=b)? c:((a>=b)?a:b);
    }
    public static void main(String[] args) {
        System.out.println(new Q3().findLargest());
        
    }
}
