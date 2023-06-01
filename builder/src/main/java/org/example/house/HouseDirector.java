package org.example.house;

import org.example.house.builder.ModernHouseBuilder;
import org.example.house.builder.TraditionalHouseBuilder;
import org.example.house.domain.ModernHouse;
import org.example.house.domain.TraditionalHouse;
import org.example.house.domain.house.components.Door;
import org.example.house.domain.house.components.Room;
import org.example.house.domain.house.components.Wall;
import org.example.house.domain.house.components.Window;

public class HouseDirector {
    public ModernHouse createPredefinedModernHouse(ModernHouseBuilder modernHouseBuilder) {
        return modernHouseBuilder
                .buildWalls(new Wall(4))
                .buildRoof()
                .buildDoors(new Door(10))
                .buildWindows(new Window(15))
                .buildRooms(new Room(6))
                .buildGarage(30)
                .buildHomeGyms(10)
                .build();
    }

    public TraditionalHouse createPredefinedTraditionalHouse(TraditionalHouseBuilder traditionalHouseBuilder) {
        return traditionalHouseBuilder
                .buildWalls(new Wall(7))
                .buildRoof()
                .buildDoors(new Door(20))
                .buildWindows(new Window(3))
                .buildRooms(new Room(15))
                .buildCemetery(4)
                .buildStable(2)
                .build();
    }
}
