// Write a Java program to print even elements present in an array. 
// Input-{1,2,3,4,5,6} 
// Output-{2,4,6}  
package Array_1D_Programs;

public class Q4 {
    public void printEvenElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Q4 obj = new Q4();
        int[] inputArray = {1, 2, 3, 4, 5, 6};
        obj.printEvenElements(inputArray);
    }
}
