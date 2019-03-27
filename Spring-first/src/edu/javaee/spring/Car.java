package edu.javaee.spring;

public class Car {
    private Person driver;

    public void setDriver(Person driver){
        this.driver = driver;
    }
    public void run(){
        driver.learn();
        System.out.print("car is running");
    }
}
