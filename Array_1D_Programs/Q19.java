// Input-{1,2,3,4,5} 
// Output-{1,4,9,16,25} ( square of each element )  
package Array_1D_Programs;
import java.util.Arrays;
public class Q19 {
    public int[] squareOfElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Q19 obj = new Q19();
        System.out.println(Arrays.toString(obj.squareOfElements(arr)));
      
        
    }
}
