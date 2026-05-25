// Write a Java program to store characters in an array and print the characters in reverse order.  
package Array_1D_Programs;

public class Q1 {
    public void reversedCharArray(String str) {
        char[] charArray = str.toCharArray();
        System.out.println("Characters in reverse order:");
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
    public static void main(String[] args) {
        Q1 obj = new Q1();
        String inputString = "Hello, World!";
        obj.reversedCharArray(inputString);
    }
}
