// Write a Java program to print even elements sum. 
// Input-{1,2,3,4,5,6} 
// Output-{12}  
package Array_1D_Programs;

public class Q8 {
    public int printEvenElementsSum(int[] arr) {
        int sum = 0;
        for (int i: arr) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Q8 obj = new Q8();
        int[] inputArray = {1, 2, 3, 4, 5, 6};
        System.out.println( obj.printEvenElementsSum(inputArray));
    }
}
