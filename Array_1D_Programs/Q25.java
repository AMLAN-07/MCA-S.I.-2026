// Input-{23,55,57,93,10,1} 
// Output-{5,1,3,3,1,1} ( Sum of each element up to single digit )  
package Array_1D_Programs;
import java.util.Arrays;
public class Q25 {
    public int[] sumToSingleDigit(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            while (sum >= 10) {
                sum = sumDigits(sum);
            }
            arr[i] = sum;
        }
        return arr;
    }

    private int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Q25 obj = new Q25();
        int[] inputArray = {23, 55, 57, 93, 10, 1};
        System.out.println(Arrays.toString(obj.sumToSingleDigit(inputArray)));
    }
}
