// Write a Java program to convert 0 into -1 and -1 into 0. 
// Input-{0,2,-1,0,2,-1,3} 
// Output-{-1,2,0,-1,2,0,3} 
package Array_1D_Programs;
import java.util.Arrays;
public class Q24 {
    public int[] convertZerosAndOnes(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = -1;
            } else if (arr[i] == -1) {
                arr[i] = 0;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, -1, 0, 2, -1, 3};
        Q24 obj = new Q24();
        System.out.println(Arrays.toString(obj.convertZerosAndOnes(arr)));
    }
}
