package org.example.house.domain;

import lombok.Getter;
import lombok.Setter;
import org.example.house.domain.house.components.Door;
import org.example.house.domain.house.components.Room;
import org.example.house.domain.house.components.Wall;
import org.example.house.domain.house.components.Window;

@Getter
@Setter
public class ModernHouse extends House {
    private int sizeGarage;
    private int countTrainers;

    public ModernHouse(Wall wall, String typeOfRoof, Door door, Window window,
                       Room room, int sizeGarage, int countTrainers) {
        super(wall, typeOfRoof, door, window, room);
        this.sizeGarage = sizeGarage;
        this.countTrainers = countTrainers;
    }

    @Override
    public String toString() {
        return "ModernHouse{" +
                "sizeGarage=" + sizeGarage +
                ", countTrainers=" + countTrainers +
                ", wall=" + wall +
                ", typeOfRoof='" + typeOfRoof + '\'' +
                ", door=" + door +
                ", window=" + window +
                ", room=" + room +
                '}';
    }
}
