//Q.4 Write a program to swap two variables using a third variable.
//Q.5 Write a program to swap two variables without using a third variable.
package DAY1;
import java.util.Scanner;
public class WAPswap {
    public void SwapTemp(int value1, int value2) {
        int temp = value1; 
        value1 = value2;  
        value2 = temp;  
        
        System.out.println("\n=====Swapping with a Temporary Variable=====");
        System.out.println("1st value " + value1 + "\n2nd value = " + value2);
    }
    public void SwapWithoutTemp(int value1, int value2) {
        value1 = value1 + value2; 
        value2 = value1 - value2; 
        value1 = value1 - value2; 
        System.out.println("\n=====Swapping without a Temporary Variable=====");
        System.out.println("1st value " + value1 + "\n2nd value = " + value2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WAPswap s= new WAPswap();
        System.out.println("Enter the first value: ");
        int a = sc.nextInt();
        System.out.println("Enter the second value: ");
        int b = sc.nextInt();
        s.SwapTemp(a, b);
        s.SwapWithoutTemp(a, b);
        sc.close();
    }
}
