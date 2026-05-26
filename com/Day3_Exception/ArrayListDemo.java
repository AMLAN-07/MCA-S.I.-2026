// print even through pointer in arraylist
package com.Day3_Exception;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ArrayListDemo {
    List<Integer> numbers = new ArrayList<>();
    Supplier<List<Integer>> listSupplier = () -> new ArrayList<>(2, 4, 6, 8, 10);
    Predicate<Integer> isEven = num -> num % 2 == 0;
    
    public void addNumbers() {
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
    }
    public void printEvenNumbers() {
        System.out.println("Even numbers in the list:");
        for (Integer num : numbers) {
            if (isEven.test(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
