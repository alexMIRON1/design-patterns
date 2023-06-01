package org.example.vehicle;

public class VehicleFactory {
    public Vehicle createVehicle(String typeOfVehicle) {
        if (typeOfVehicle.equalsIgnoreCase(VehiclesTypes.SCOOTER.name())) {
            return new Scooter();
        }
        if (typeOfVehicle.equalsIgnoreCase(VehiclesTypes.MOTORCYCLE.name())) {
            return new Motorcycle();
        }
        if (typeOfVehicle.equalsIgnoreCase(VehiclesTypes.CAR.name())) {
            return new Car();
        }
        throw new IllegalArgumentException("This type of vehicle does not exist");
    }
}
