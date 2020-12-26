package domain.ziutek;

import java.awt.*;

public class Ziutek {

    int x;
    int y;

    Dimension rozmiarPlanszy;

    Ziutek(int x, int y, Dimension rozmiarPlanszy) {
        this.x = x;
        this.y = y;
        this.rozmiarPlanszy = rozmiarPlanszy;

    }

    void przesun(char kierunek) {

        switch (kierunek) {
            case 'N' -> {
                if (x > 0) {
                    x--;
                }
            }
            case 'S' -> {
                if (x < rozmiarPlanszy.getHeight()) {
                    x++;
                }
            }
            case 'W' -> {
                if (y > 0) {
                    y--;
                }
            }
            case 'E' -> {
                if (y < rozmiarPlanszy.getWidth()) {
                    y++;
                }
            }
        }
    }
}
