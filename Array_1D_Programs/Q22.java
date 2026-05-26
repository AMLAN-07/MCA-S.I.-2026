// Write a Java program to find 2nd largest element in a given array. 
// Input-{1,2,1,3,2,4,} 
// Output-{3} 

package Array_1D_Programs;

public class Q22 {
    public int findSecondLargestElement(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 4};
        Q22 obj = new Q22();
        System.out.println(obj.findSecondLargestElement(arr));
    }
}
