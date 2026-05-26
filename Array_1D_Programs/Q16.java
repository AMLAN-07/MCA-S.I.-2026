// Write a Java program to count the occurrence of each element in a given array. 
// Input-{1,2,1,3,2,4} 
// Output-{1-2, 2-2, 3-1, 4-1} 
package Array_1D_Programs;

import java.util.HashMap;

public class Q16 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 1, 1, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        System.out.println("Occurrences of each element:");

        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
