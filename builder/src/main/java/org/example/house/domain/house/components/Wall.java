package org.example.house.domain.house.components;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Wall {
    private int countWalls;
    private String materialWalls;

    public Wall(int countWalls) {
        this.countWalls = countWalls;
    }
}
