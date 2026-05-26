//  Write a Java program to insert even values in an array, the user will enter the values
package Array_1D_Programs;
import java.util.Scanner;
public class Q14 {
    Scanner sc = new Scanner(System.in);
    public void printEvenValues(int size) {
        int []arr= new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter your element number " + (i+1)+ ": ");
            int temp = sc.nextInt();
            if(temp % 2 == 0) {
                arr[i] = temp;
            }
        }
        System.out.println("Even values in the array:");
        for (int num : arr) {
            if (num != 0) {
                System.out.print(num + " ");
            }
        }

    }
    public static void main(String[] args) {
        Q14 obj = new Q14();
        System.out.println("Enter the size of the array: ");
        int size = obj.sc.nextInt();
        obj.printEvenValues(size);
    }
}
