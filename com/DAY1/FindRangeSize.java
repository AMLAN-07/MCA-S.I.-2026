//Q.3 Write a program to find the size and range of primitive data types.
package com.DAY1;
public class FindRangeSize 
    {
       public void DisplayRangeSize()
       {
           System.out.println("=====Size and Range of Primitive Data Types=====");
           System.out.println("Byte      : " + Byte.SIZE + " bits,  Range = " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
           System.out.println("Short     : " + Short.SIZE + " bits, Range = " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
           System.out.println("Integer   : " + Integer.SIZE + " bits, Range = " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
           System.out.println("Long      : " + Long.SIZE + " bits, Range = " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
           System.out.println("Float     : " + Float.SIZE + " bits, Range = " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
           System.out.println("Double    : " + Double.SIZE + " bits, Range = " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
           System.out.println("Character : " + Character.SIZE + " bits, Range = " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
           System.out.println("Boolean   : 1   bit, Range = " + Boolean.FALSE + " to " + Boolean.TRUE);
       }
         public static void main(String[] args) {
              FindRangeSize FRS = new FindRangeSize();
              FRS.DisplayRangeSize();
         }
         
    }