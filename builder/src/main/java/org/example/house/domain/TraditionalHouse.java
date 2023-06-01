package org.example.house.domain;

import lombok.Getter;
import lombok.Setter;
import org.example.house.domain.house.components.Door;
import org.example.house.domain.house.components.Room;
import org.example.house.domain.house.components.Wall;
import org.example.house.domain.house.components.Window;

@Getter
@Setter
public class TraditionalHouse extends House {
    private int countGraves;
    private int countHorse;

    public TraditionalHouse(Wall wall, String typeOfRoof, Door door,
                            Window window, Room room, int countGraves, int countHorse) {
        super(wall, typeOfRoof, door, window, room);
        this.countGraves = countGraves;
        this.countHorse = countHorse;
    }

    @Override
    public String toString() {
        return "TraditionalHouse{" +
                "countGraves=" + countGraves +
                ", countHorse=" + countHorse +
                ", wall=" + wall +
                ", typeOfRoof='" + typeOfRoof + '\'' +
                ", door=" + door +
                ", window=" + window +
                ", room=" + room +
                '}';
    }
}
