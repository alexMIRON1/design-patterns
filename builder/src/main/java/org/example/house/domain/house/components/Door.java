package org.example.house.domain.house.components;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Door {
    private int countDoors;


    private String materialDoors;

    public Door(int countDoors) {
        this.countDoors = countDoors;
    }
}
