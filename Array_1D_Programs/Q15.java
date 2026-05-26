// Write a Java program to print an array's last index value of a given element. 
// Input-{1,2,9,3,9,4,9,6,7,8} find the last index of 9 
// Output-{5} 
package Array_1D_Programs;

public class Q15 {
    public int findlastindex(int target, int[] arr) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }
    public static void main(String[] args) {
        Q15 obj = new Q15();
        int[] arr = {1, 2, 9, 3, 9, 4, 9, 6, 7, 8};
        int target = 9;
        System.out.println(obj.findlastindex(target, arr));
    }
}
