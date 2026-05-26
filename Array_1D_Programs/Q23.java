// Write a Java program to find 2nd smallest element in a given array. 
// Input-{1,2,1,3,2,4} 
// Output-{2}  


package Array_1D_Programs;

public class Q23 {
    public int findSecondSmallestElement(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 4};
        Q23 obj = new Q23();
        System.out.println(obj.findSecondSmallestElement(arr));
    }
}
