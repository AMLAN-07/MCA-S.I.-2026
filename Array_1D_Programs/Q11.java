// Write a Java program to print prime numbers present in an array. 
// Input-{1,2,3,4,5,6} 
// Output-{2,3,5} 
package Array_1D_Programs;

public class Q11 {
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i*i <=n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void printPrimeNumbers(int[] arr) {
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }
    public static void main(String[] args) {
        Q11 obj = new Q11();
        int[] arr = {1, 2, 3, 4, 5, 6};
        obj.printPrimeNumbers(arr);
    }

}
