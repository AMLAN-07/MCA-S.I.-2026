// Write a Java program to find the smallest element in a given array. 
// Input-{1,2,1,3,2,4,} 
// Output-{1}  

package Array_1D_Programs;

public class Q21 {
    public int findSmallestElement(int[] arr) {
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 4};
        Q21 obj = new Q21();
        System.out.println(obj.findSmallestElement(arr));
    }
}
