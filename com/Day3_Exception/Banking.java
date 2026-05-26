package com.Day3_Exception;

import java.time.LocalDate;

public class Banking {
    public void currentTime(){
       LocalDate currentDate = LocalDate.now();
       System.out.println("Current Date: " + currentDate);
    //    System.out.println(LocalDate.of(2024, 6, 1));

    }
    public static void main(String[] args) {
        Banking bank = new Banking();
        bank.currentTime();
    }
}
