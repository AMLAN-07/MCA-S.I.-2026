// Write a Java program to print odd elements present in an array. 
// Input-{1,2,3,4,5,6} 
// Output-{1,3,5}  
package Array_1D_Programs;

public class Q5 {
    public void printOddElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Q5 obj = new Q5();
        int[] inputArray = {1, 2, 3, 4, 5, 6};
        obj.printOddElements(inputArray);
    }
}
