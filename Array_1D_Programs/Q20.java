// Write a Java program to find the largest element in a given array. 
// Input-{1,2,1,3,2,4,} 
// Output-{4}  

package Array_1D_Programs;

public class Q20 {
    public  int findLargestElement(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 4};
        Q20 obj = new Q20();
        System.out.println(obj.findLargestElement(arr));
    }
}
