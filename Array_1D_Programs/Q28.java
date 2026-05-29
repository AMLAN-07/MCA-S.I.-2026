// Input-{23,55,57,93,1} 
// Output-{32,55,75,39,1} ( Reverse each element )  
package Array_1D_Programs;

public class Q28 {
    public int[] reverseEachElement(int[] arr) {
        int[] reversedArray = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int reversedNum = 0;
            
            while (num != 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num /= 10;
            }
            
            reversedArray[i] = reversedNum;
        }
        
        return reversedArray;
    }
    public static void main(String[] args) {
        Q28 obj = new Q28();
        int[] inputArray = {23, 55, 57, 93, 1};
        System.out.println(java.util.Arrays.toString(obj.reverseEachElement(inputArray)));
    }
}
