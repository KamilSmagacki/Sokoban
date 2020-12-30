package domain.plansza;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PlanszaRepository {
    private final List<Poziom> poziomy = new ArrayList<>();

    public Poziom wczytajPoziom() {
        String nazwaPliku = "level01.csv";
        String katalogPoziomow = "levels";
        Path sciezkaPoziomu = Paths.get(katalogPoziomow, nazwaPliku);
        Poziom poziom;
        //String[][] polaPlanszyString;
        String[][] polaPlanszyString = new String[0][0];
        try {
            String dane = Files.readString(sciezkaPoziomu, StandardCharsets.UTF_8);
            String[] wiersze = dane.split(System.getProperty("line.separator"));
            String[] wymiary = wiersze[0].split(",");
            polaPlanszyString = new String[wiersze.length][];
            for (int i = 0; i < wiersze.length; i++) {
                polaPlanszyString[i] = wiersze[i].split(",");
            }
            /*poziom = new Poziom(wymiary, polaPlanszyString);
            poziomy.add(poziom);*/
        } catch (IOException e) {
            e.printStackTrace();
        }
        //return poziomy.get(0);
        return new Poziom(10, 5, polaPlanszyString);
    }





}