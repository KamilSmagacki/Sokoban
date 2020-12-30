import domain.plansza.Plansza;
import domain.plansza.PlanszaService;
import domain.poziom.Poziomy;

import javax.swing.*;

public class App {
    private final PlanszaService planszaService = new PlanszaService();

    App() {
        JFrame ramka = new JFrame("Sokoban");
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setLayout(null);
        ramka.setResizable(false);
        ramka.setLocation(100, 100);
        ramka.setSize(1000, 600);
        ramka.setVisible(true);

        Plansza plansza = new Plansza(planszaService.wczytajPoziom());
        plansza.setLocation(100,100);
        plansza.setSize(600, 400);

        ramka.add(plansza);
    }

    public static void main(String[] args) {
//        Poziomy p = new Poziomy();
//        p.zapiszPoziom();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App();
            }
        });
    }
}