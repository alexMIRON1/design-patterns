package org.example;

import org.example.vehicle.Vehicle;
import org.example.vehicle.VehicleFactory;

import java.util.Scanner;

public class FactoryMain {
    private static final VehicleFactory vehicleFactory = new VehicleFactory();
    private static  final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        createVehicle();
    }
    private static void createVehicle(){
        System.out.println("What type of vehicle create:\nCar;\nMotorcycle;\nScooter");
        String typeOfVehicle = input.nextLine();
        try{
             Vehicle vehicle = vehicleFactory.createVehicle(typeOfVehicle);
             vehicle.start();
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            createVehicle();
        }
    }
}
