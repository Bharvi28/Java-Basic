/*Write a Java program to create an abstract class Vehicle with:
        ● An abstract method fuelType() that returns the type of fuel used.
        ● An abstract method noOfWheels() that returns the number of wheels.
Create two subclasses:
        ● Car that uses Petrol/Diesel and has 4 wheels.
● Bike that uses Petrol and has 2 wheels.
In the main method, create objects of Car and Bike, and display their fuel type and number of wheels.
 */

abstract class Vehicle {

    abstract String fuelType();
    abstract int noOfWheels();
}

class Car extends Vehicle {

    @Override
    String fuelType() {
        return "Petrol/Diesel";
    }

    @Override
    int noOfWheels() {
        return 4;
    }
}

class Bike extends Vehicle {

    @Override
    String fuelType() {
        return "Petrol";
    }

    @Override
    int noOfWheels() {
        return 2;
    }
}

public class Vehicles {
    public static void main(String[] args) {

        Vehicle v;

        v = new Car();
        System.out.println(" Car ");
        System.out.println("Fuel Type: " + v.fuelType());
        System.out.println("Number of Wheels: " + v.noOfWheels());

        v = new Bike();
        System.out.println(" Bike ");
        System.out.println("Fuel Type: " + v.fuelType());
        System.out.println("Number of Wheels: " + v.noOfWheels());
    }
}
/*
Car
Fuel Type: Petrol/Diesel
Number of Wheels: 4
Bike
Fuel Type: Petrol
Number of Wheels: 2
 */