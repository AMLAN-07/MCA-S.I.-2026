// Write a Java program to print odd elements sum. 
// Input-{1,2,3,4,5,6} 
// Output-{9}  
package Array_1D_Programs;

public class Q9 {
    public int oddSum(int[] arr) {
        int sum = 0;
        for (int i: arr) {
            if (i % 2 != 0) {
                sum += i;
            }
        }return sum;
    }
    public static void main(String[] args) {
        Q9 obj = new Q9();
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(obj.oddSum(arr));
    }
}
