// Write a Java program to shift zeros (0) to the left side of the array. 
// Input-{2,0,5,3,1,0,3,1} 
// output-{0,0,2,5,3,1,3,1}  

package Array_1D_Programs;

public class Q33 {
    public int[] shiftZerosLeft(int []arr) {
        if(arr == null) return new int[0];
        int[] shifted = new int[arr.length];
        int idx = arr.length - 1;
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] != 0) shifted[idx--] = arr[i];
        }
        return shifted;
    }
    public static void main(String[] args) {
        Q33 obj = new Q33();
        int[] arr = {2,0,5,3,1,0,3,1};
        System.out.println(java.util.Arrays.toString(obj.shiftZerosLeft(arr)));
    }
}
