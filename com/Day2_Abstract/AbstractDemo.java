package com.Day2_Abstract;

abstract class Sim{
    abstract void call();
    abstract void message();
}
class Airtel extends Sim{
    @Override
    void call(){
        System.out.println("Calling using Airtel");
    }
    @Override
    void message(){
        System.out.println("Messaging using Airtel");
    }
}
class Jio extends Sim{
    @Override
    void call(){
        System.out.println("Calling using Jio");
    }
    @Override
    void message(){
        System.out.println("Messaging using Jio");
    }
}
class Phone{
    void useCall(Sim sim){
        sim.call();
    }
    void useMessage(Sim sim){
        sim.message();
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Sim sim1 = new Airtel();
        Sim sim2 = new Jio();
        Phone phone = new Phone();
        phone.useCall(sim1);
        phone.useMessage(sim2);
        
    }
}
