package org.example.house.domain.house.components;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Room {
    private int countRooms;
    private String styleRooms;

    public Room(int countRooms) {
        this.countRooms = countRooms;
    }
}
