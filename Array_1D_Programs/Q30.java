// Input-{231,554,572,962,24,1} 
// Output-{2,4,2,8,6,1} ( Sum of even digits of each element ) 
package Array_1D_Programs;

public class Q30 {
   public int[] sumOfEvenDigits(int[] arr) {
        int[] result = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int sumEvenDigits = 0;
            
            while (num != 0) {
                int digit = num % 10;
                if (digit % 2 == 0) {
                    sumEvenDigits += digit;
                }
                num /= 10;
            }
            
            result[i] = sumEvenDigits;
        }
        
        return result;
    }

    public static void main(String[] args) {
        Q30 obj = new Q30();
        int[] inputArray = {231, 554, 572, 962, 24, 1};
        System.out.println(java.util.Arrays.toString(obj.sumOfEvenDigits(inputArray)));
    } 
}
