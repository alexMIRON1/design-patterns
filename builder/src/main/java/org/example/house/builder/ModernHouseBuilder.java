package org.example.house.builder;

import org.example.house.domain.ModernHouse;
import org.example.house.domain.house.components.Door;
import org.example.house.domain.house.components.Room;
import org.example.house.domain.house.components.Wall;
import org.example.house.domain.house.components.Window;

public class ModernHouseBuilder implements HouseBuilder<ModernHouse, ModernHouseBuilder> {
    private Wall wall;
    private String typeOfRoof;
    private Door door;
    private Window window;
    private Room room;
    private int sizeGarage;
    private int countTrainers;
    @Override
    public ModernHouseBuilder buildWalls(Wall wall) {
        wall.setMaterialWalls("drywall");
        this.wall = wall;
        return this;
    }
    @Override
    public ModernHouseBuilder buildRoof() {
        this.typeOfRoof = "Shed Roof";
        return this;
    }
    @Override
    public ModernHouseBuilder buildDoors(Door door) {
        door.setMaterialDoors("glass");
        this.door = door;
        return this;
    }
    @Override
    public ModernHouseBuilder buildWindows(Window window) {
        window.setTypeWindows("Double-Hung Windows");
        this.window = window;
        return this;
    }
    @Override
    public ModernHouseBuilder buildRooms(Room room) {
        room.setStyleRooms("Neutral Color Palette");
        this.room = room;
        return this;
    }

    public ModernHouseBuilder buildGarage(int sizeGarage) {
        this.sizeGarage = sizeGarage;
        return this;
    }

    public ModernHouseBuilder buildHomeGyms(int countTrainers) {
        this.countTrainers = countTrainers;
        return this;
    }

    public ModernHouse build() {
        return new ModernHouse(wall, typeOfRoof, door, window, room, sizeGarage, countTrainers);
    }
}
