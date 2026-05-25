// Write a Java program to print odd index values of an array. 
// Input-{1,2,3,4,5,6} 
// Output-{2,4,6}  
package Array_1D_Programs;

public class Q3 {
    public void printOddIndexValues(int[] arr) {
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Q3 obj = new Q3();
        int[] inputArray = {1, 2, 3, 4, 5, 6};
        obj.printOddIndexValues(inputArray);
    }
}
