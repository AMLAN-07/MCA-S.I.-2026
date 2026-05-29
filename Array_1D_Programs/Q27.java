// Write a Java program to remove duplicates. 
// Input-{1,2,1,3,2,4} 
// Output-{1,2,3,4}   
package Array_1D_Programs;
import java.util.*;

public class Q27 {
    public List<Integer> removeDuplicates(int[] arr) {
        Set<Integer> uniqueElements = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        
        for (int i : arr) {
            if (!uniqueElements.contains(i)) {
                uniqueElements.add(i);
                result.add(i);
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Q27 obj = new Q27();
        int[] inputArray = {1, 2, 1, 3, 2, 4};
      System.out.println(obj.removeDuplicates(inputArray));
    }
}
