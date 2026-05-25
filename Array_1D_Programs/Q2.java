// Write a Java program to print even index values of an array. 
// Input-{1,2,3,4,5,6} 
// Output-{1,3,5}  
package Array_1D_Programs;

public class Q2 {
    public void printEvenIndexValues(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Q2 obj = new Q2();
        int[] inputArray = {1, 2, 3, 4, 5, 6};
        obj.printEvenIndexValues(inputArray);
    }
}
