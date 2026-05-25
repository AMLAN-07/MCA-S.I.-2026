// Write a Java program to print even index values sum and odd index values sum. 
// Input-{1,2,3,4,5,6} 
// Output-{9 (sum of even index), 12(sum of odd index)} 
package Array_1D_Programs;

public class Q7 {
    public int[] sumType(int[] arr) {
        int even= 0;
        int odd= 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                even+= arr[i];
            } else {
                odd+= arr[i];
            }
        }
        return new int[]{even, odd};
    }
    public static void main(String[] args) {
        Q7 obj = new Q7();
        int[] inputArray = {1, 2, 3, 4, 5, 6};
        
        System.out.println(java.util.Arrays.toString(obj.sumType(inputArray)));
    }
}
