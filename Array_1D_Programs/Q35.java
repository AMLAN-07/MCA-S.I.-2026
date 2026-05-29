// Write a Java program to print repeated elements present in an array. 
// Input-{1,2,3,4,3,2} 
// Output-{2,3}  
package Array_1D_Programs;

public class Q35 {
    public void printRepeatedElements(int[] arr) {
        System.out.print("Repeated elements: ");
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                boolean alreadyPrinted = false;
                for (int k = 0; k < i; k++) {
                    if (arr[i] == arr[k]) {
                        alreadyPrinted = true;
                        break;
                    }
                }
                if (!alreadyPrinted) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
