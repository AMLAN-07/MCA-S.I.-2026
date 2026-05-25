// Write a Java program to print the 2nd last element of an array. 
// Input-{1,2,3,4,5,6} 
// Output-{5} 
package Array_1D_Programs;

public class Q10 {
    public int printSecondLastElement(int[] arr) {
        return arr[arr.length - 2];
    }

    public static void main(String[] args) {
        Q10 obj = new Q10();
        int[] inputArray = {1, 2, 3, 4, 5, 6};
        System.out.println(obj.printSecondLastElement(inputArray));
    }
}
