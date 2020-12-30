package domain.pole;

import java.awt.*;

public class Pole {
    public Dimension rozmiar = new Dimension(60, 60);
    public Point wierzcholek = new Point(0, 0);
    public Point srodek = new Point(0, 0);

    //0 - puste
    //1 - przeszkoda
    //2 - box
    //3 - ziutek
    //4 - cel
    String rodzaj;

    public Pole(int x, int y, int startX, int startY) {
        ustalWierzcholek(x, y, startX, startY);
        ustalSrodek();
    }

    public Pole(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    private void ustalWierzcholek(int x, int y, int startX, int startY) {
        wierzcholek.x = startX + (y * rozmiar.width);
        wierzcholek.y = startY + (x * rozmiar.height);
    }

    private void ustalSrodek() {
        srodek.x = wierzcholek.x + (rozmiar.width / 2);
        srodek.y = wierzcholek.y + (rozmiar.height / 2);
    }
}
