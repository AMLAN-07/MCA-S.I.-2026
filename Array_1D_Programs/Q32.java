// Write a Java program to shift zeros (0) to the right side of the array. 
// Input-{2,0,5,3,1,0,3,1} 
// output-{2,5,3,1,3,1,0,0}
package Array_1D_Programs;

public class Q32 {
    public int[] shiftZeros(int []arr) {
        if(arr == null) return new int[0];
        int[] shifted = new int[arr.length];
        int idx = 0;
        for(int v: arr) {
            if(v != 0) shifted[idx++] = v;
        }
        return shifted;
    }
    public static void main(String[] args) {
        Q32 obj = new Q32();
        int[] arr = {2,0,5,3,1,0,3,1};
        System.out.println(java.util.Arrays.toString(obj.shiftZeros(arr)));
    }
}
