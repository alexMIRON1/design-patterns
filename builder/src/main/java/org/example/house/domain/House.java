package org.example.house.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.house.domain.house.components.Door;
import org.example.house.domain.house.components.Room;
import org.example.house.domain.house.components.Wall;
import org.example.house.domain.house.components.Window;

@AllArgsConstructor
@Getter
@Setter
@ToString
public abstract class House {
    protected Wall wall;
    protected String typeOfRoof;
    protected Door door;
    protected Window window;
    protected Room room;
}
