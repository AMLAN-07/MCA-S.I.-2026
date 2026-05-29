// Write a Java program to find the length of an array without using the length attribute.
package Array_1D_Programs;

public class Q34 {
    public int arrayLength(int []arr) {
        if(arr == null) return 0;
        int length = 0;
        for(int v: arr) length++;
        return length;
    }
    public static void main(String[] args) {
        Q34 obj = new Q34();
        int[] arr = {1,2,3,4,5};
        System.out.println(obj.arrayLength(arr));
    }
}
