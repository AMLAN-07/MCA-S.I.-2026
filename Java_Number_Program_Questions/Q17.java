// Write a program to print all Prime numbers from 1 to N.
package Java_Number_Program_Questions;

public class Q17 {
   public int printPrime(int n){
    int count = 0;
       for(int i=2;i<=n;i++){
           boolean isPrime = true;
           for(int j=2;j*j<=i;j++){
               if(i%j==0){
                   isPrime = false;
                   break;
               }
           }
           if(isPrime)
               count++;
       }
         return count;
   }
    public static void main(String[] args) {
        System.out.println(new Q17().printPrime(5000000));
    } 
}
