package org.example;

import org.example.house.HouseDirector;
import org.example.house.builder.ModernHouseBuilder;
import org.example.house.builder.TraditionalHouseBuilder;
import org.example.house.domain.HouseTypes;

import java.util.Scanner;

public class BuilderMain {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        createHouse();
    }

    private static void createHouse() {
        HouseDirector houseDirector = new HouseDirector();
        System.out.println("Select type of house:\nModern;\nTraditional;");
        String typeOfHouse = input.nextLine();
        if (typeOfHouse.equalsIgnoreCase(HouseTypes.MODERN.name())) {
            System.out.println(houseDirector.createPredefinedModernHouse(new ModernHouseBuilder()));
        } else if (typeOfHouse.equalsIgnoreCase(HouseTypes.TRADITIONAL.name())) {
            System.out.println(houseDirector.createPredefinedTraditionalHouse(new TraditionalHouseBuilder()));
        } else {
            createHouse();
        }
    }
}
