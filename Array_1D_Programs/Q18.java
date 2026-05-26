// Write a Java program to find the minimum occured element in a given array. 
// Input-{1,2,1,1,2,1} 
// Output-{2-2}  
package Array_1D_Programs;

public class Q18 {
    public void findMinOccuredElement(int[] arr) {
        int minCount = arr.length;
        int minElement = arr[0];

    for (int i = 0; i < arr.length; i++) {
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                count++;
            }
        }
        if (count < minCount) {
            minCount = count;
            minElement = arr[i];
        }
    }

    System.out.println(minElement + " - " + minCount);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 2, 1};
        Q18 obj = new Q18();
        obj.findMinOccuredElement(arr);
    }
}
