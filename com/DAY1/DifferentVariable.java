//Q.1 Write a program to declare variables of different data types and display their values.
//Q.2 Write a program to initialize and print all primitive data types in Java.
package com.DAY1;
class DifferentVariable
    {
        byte byteVar = 100;
        short shortVar = 1000;
        int integerVar = 10000;
        long longVar = 250320100170l;
        float floatVar = 10.5f;
        double doubleVar = 10.5d;
        char charVar = 'A';
        boolean booleanVar = true;
        String stringVar = "Amlan";
        static int staticVar = 20;

        public void displayValues()
        {
            System.out.println("=====Variables of Different Data Types=====");
            System.out.println("String: " + stringVar);
            System.out.println("Long: " + longVar);
            System.out.println();
            System.out.println("Byte: " + byteVar);
            System.out.println("Short: " + shortVar);
            System.out.println("Integer: " + integerVar);
            System.out.println("Float: " + floatVar);
            System.out.println("Double: " + doubleVar);
            System.out.println("Character: " + charVar);
            System.out.println("Boolean: " + booleanVar);
            System.out.println("Static: " + staticVar);
        }
        public void DisplayPrimitives()
        {
            System.out.println("\n=====Primitive Data Types=====");
            System.out.println("Byte: " + byteVar);
            System.out.println("Short: " + shortVar);
            System.out.println("Integer: " + integerVar);
            System.out.println("Float: " + floatVar);
            System.out.println("Double: " + doubleVar);
            System.out.println("Character: " + charVar);
            System.out.println("Boolean: " + booleanVar);
        }
        public static void main(String[] args) {
            DifferentVariable DV = new DifferentVariable();
            DV.displayValues();
            DV.DisplayPrimitives();
        }
    }