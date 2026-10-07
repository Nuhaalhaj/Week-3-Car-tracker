
package com.mycompany.car.tracker;


public class CarTracker {

    public static void main(String[] args) {
        
        Car car1 = new Car(
                "24 23 113",
                "Toyota",
                20,
                50
        );

        car1.checkStatus();

        car1.drive(120);
        car1.checkStatus();

        car1.refuel(10);
        car1.checkStatus();

        car1.drive(100);
        car1.checkStatus();


        car1.drive(500);

  
        car1.refuel(100);

        car1.checkStatus();
    
    }
}
