// Write a Java program to print ovals present in an array. 
// Input-{a,b,c,d,e,f,g} 
// output-{a,e}  
package Array_1D_Programs;

import java.util.ArrayList;

public class Q12 {
    public ArrayList<Character> isVowel(char []arr) {
        ArrayList<Character> vowels = new ArrayList<>();

        for (char c: arr) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels.add(c);
            }
        }
        
        return vowels;
    }
    public static void main(String[] args) {
        Q12 obj = new Q12();
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        System.out.println(obj.isVowel(arr));
    }
}
