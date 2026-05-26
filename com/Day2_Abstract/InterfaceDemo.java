package com.Day2_Abstract;

interface Mobile {
    void call();
    void message();
    default void internet(){
        System.out.println("Using Internet");
    }
    // private void Security(){
    //     System.out.println("Ensuring Security");
    // }
    // static void music(){
    //     System.out.println("Listening to Music");
    // }

}
class Vivo implements Mobile{
    @Override
    public void call(){
        System.out.println("Calling using Vivo");
    }
    @Override
    public void message(){
        System.out.println("Messaging using Vivo");
    }
    @Override
    public void internet(){
        System.out.println("Using Internet on Vivo");
    }
    // @Override
    // public void Security(){
    //     System.out.println("Ensuring Security on Vivo");
    // }
    // @Override
    // public void music(){
    //     System.out.println("Listening to Music on Vivo");
    // }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Mobile mobile = new Vivo();
        mobile.call();
        mobile.message();
        mobile.internet();
        // mobile.Security();
        // mobile.music();
    }
}
