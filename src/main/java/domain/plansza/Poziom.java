package domain.plansza;

public class Poziom {
    int wymiarX;
    int wymiarY;
    String[][] polaPoziomu;

    public Poziom(int x, int y, String[][] polaPoziomu) {
        this.wymiarX = x;
        this.wymiarY = y;
        this.polaPoziomu = polaPoziomu;
    }
}