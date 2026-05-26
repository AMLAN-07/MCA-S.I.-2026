// Write a Java program to count the number of zeros(0) present in a given array. 
// Input-{1,0,3,0,5,6,0} 
// Output-{3}  
package Array_1D_Programs;

public class Q13 {
    public int countZeros(int []arr) {
        int count = 0;

        for (int num: arr) {
            if (num == 0) {
                count++;
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        Q13 obj = new Q13();
        int[] arr = {1, 0, 3, 0, 5, 6, 0};
        System.out.println(obj.countZeros(arr));
    }
    
}
