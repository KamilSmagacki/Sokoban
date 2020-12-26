package domain.plansza;

import domain.przeszkoda.Pole;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Plansza {
    int width;
    int height;
    Pole[][] polaPlanszy;

    public Plansza(int width, int height) {
        this.width = width;
        this.height = height;

        polaPlanszy = new Pole[5][5];
    }

    public void wczytajPoziom() {
        String nazwaPliku = "level_01.csv";
        String katalogPoziomow = "levels";
        Path sciezkaPoziomu = Paths.get(katalogPoziomow, nazwaPliku);
        String[][] polaPlanszyString;
        try {
            String dane = Files.readString(sciezkaPoziomu, StandardCharsets.UTF_8);
            String[] wiersze = dane.split(System.getProperty("line_separator"));
            polaPlanszyString = new String[wiersze.length][];
            for (int i = 0; i < wiersze.length; i++) {
                polaPlanszyString[i] = wiersze[i].split(",");
            }

            for (int i = 0; i < polaPlanszyString.length; i++) {
                for (int j = 0; j < polaPlanszyString[i].length; j++) {
                    polaPlanszy[i][j] = new Pole(polaPlanszyString[i][j]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
