package domain.plansza;

public class Poziom {
    int wymiarX;
    int wymiarY;
    String[][] polaPoziomu;

    public Poziom(String[] wymiaryPoziomu, String[][] polaPoziomu) {
        this.wymiarX = Integer.parseInt(wymiaryPoziomu[0]);
        this.wymiarY = Integer.parseInt(wymiaryPoziomu[1]);
        this.polaPoziomu = polaPoziomu;
    }
}