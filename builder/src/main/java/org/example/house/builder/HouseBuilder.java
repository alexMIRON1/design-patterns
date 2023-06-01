package org.example.house.builder;

import org.example.house.domain.House;
import org.example.house.domain.house.components.Door;
import org.example.house.domain.house.components.Room;
import org.example.house.domain.house.components.Wall;
import org.example.house.domain.house.components.Window;

public interface HouseBuilder<T extends House, H extends HouseBuilder> {
    H buildWalls(Wall wall);

    H buildRoof();

    H buildDoors(Door door);

    H buildWindows(Window window);

    H buildRooms(Room room);

    T build();
}
