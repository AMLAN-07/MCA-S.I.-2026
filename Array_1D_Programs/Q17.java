// Write a Java program to find the maximum occured element in a given array. 
// Input-{1,2,1,3,1,4,} 
// Output-{1-3}
package Array_1D_Programs;

public class Q17 {
    public void findMaxOccuredElement(int[] arr) {
        int maxCount = 0;
        int maxElement = arr[0];

    for (int i = 0; i < arr.length; i++) {
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                count++;
            }
        }
        if (count > maxCount) {
            maxCount = count;
            maxElement = arr[i];
        }
    }

    System.out.println(maxElement + " - " + maxCount);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 1, 4};
        Q17 obj = new Q17();
        obj.findMaxOccuredElement(arr);
    }
}
