package org.example.house.builder;

import org.example.house.domain.TraditionalHouse;
import org.example.house.domain.house.components.Door;
import org.example.house.domain.house.components.Room;
import org.example.house.domain.house.components.Wall;
import org.example.house.domain.house.components.Window;

public class TraditionalHouseBuilder implements HouseBuilder<TraditionalHouse, TraditionalHouseBuilder> {
    private Wall wall;
    private String typeOfRoof;
    private Door door;
    private Window window;
    private Room room;
    private int countGraves;
    private int countHorses;

    @Override
    public TraditionalHouseBuilder buildWalls(Wall wall) {
        wall.setMaterialWalls("stone");
        this.wall = wall;
        return this;
    }

    @Override
    public TraditionalHouseBuilder buildRoof() {
        this.typeOfRoof = "crenellated";
        return this;
    }

    @Override
    public TraditionalHouseBuilder buildDoors(Door door) {
        door.setMaterialDoors("iron");
        this.door = door;
        return this;
    }

    @Override
    public TraditionalHouseBuilder buildWindows(Window window) {
        window.setTypeWindows("arrow loop");
        this.window = window;
        return this;
    }

    @Override
    public TraditionalHouseBuilder buildRooms(Room room) {
        room.setStyleRooms("castle interior");
        this.room = room;
        return this;
    }

    public TraditionalHouseBuilder buildCemetery(int countGraves) {
        this.countGraves = countGraves;
        return this;
    }

    public TraditionalHouseBuilder buildStable(int countHorses) {
        this.countHorses = countHorses;
        return this;
    }

    @Override
    public TraditionalHouse build() {
        return new TraditionalHouse(wall, typeOfRoof, door, window, room, countGraves, countHorses);
    }
}
