//  Write a Java program to add elements of 2 arrays.  
package Array_1D_Programs;

public class Q29 {
    public int[] addTwoArrays(int[] arr1, int[] arr2) {
        int maxLength = Math.max(arr1.length, arr2.length);
        int[] result = new int[maxLength];
        
        for (int i = 0; i < maxLength; i++) {
            int num1 = (i < arr1.length) ? arr1[i] : 0;
            int num2 = (i < arr2.length) ? arr2[i] : 0;
            result[i] = num1 + num2;
        }
        
        return result;
    }
    public static void main(String[] args) {
        Q29 obj = new Q29();
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6, 7};
        System.out.println(java.util.Arrays.toString(obj.addTwoArrays(array1, array2)));
    }
}
