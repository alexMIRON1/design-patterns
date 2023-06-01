package org.example.house.domain.house.components;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Window {
    private int countWindows;
    private String typeWindows;

    public Window(int countWindows) {
        this.countWindows = countWindows;
    }
}
