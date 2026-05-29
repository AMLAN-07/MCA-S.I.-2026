// Write a Java program to merge two arrays. 
// Input-1-{1,2,3} 
// Input-2-{4,5,6} 
// output-{1,2,3,4,5,6} 
package Array_1D_Programs;

public class Q31 {
  public int[] mergeArray(int []arr1,int []arr2){
    if(arr1 == null && arr2 == null) return new int[0];
    if(arr1 == null) return java.util.Arrays.copyOf(arr2, arr2.length);
    if(arr2 == null) return java.util.Arrays.copyOf(arr1, arr1.length);

    int[] merged = new int[arr1.length + arr2.length];
    int idx = 0;
    for(int v: arr1) merged[idx++] = v;
    for(int v: arr2) merged[idx++] = v;
    return merged;
  }
  public static void main(String[] args) {
    Q31 obj = new Q31();
    int[] arr1 = {1,2,3};
    int[] arr2 = {4,5,6};
    System.out.println(java.util.Arrays.toString(obj.mergeArray(arr1, arr2)));
  }
}
