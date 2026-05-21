// Write a program to swap two numbers without using a third variable.
package Java_Number_Program_Questions;

public class Q5 {
    public void swapVar(int a,int b){
        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println("a= "+a +" b= "+b);
    }
    public static void main(String[] args) {
        new Q5().swapVar(10,20);
    }
}
