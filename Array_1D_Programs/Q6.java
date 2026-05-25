// Write a Java program to print the sum of an array of elements. 
// Input-{1,2,3,4,5,6} 
// Output-{21}  
package Array_1D_Programs;

public class Q6 {
    public int printSumOfArray(int[] arr) {
        int sum = 0;
        for (int i: arr) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Q6 obj = new Q6();
        int[] inputArray = {1, 2, 3, 4, 5, 6};
        System.out.println(obj.printSumOfArray(inputArray));
    }
}
