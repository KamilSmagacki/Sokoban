package domain.plansza;

import domain.pole.Pole;

import javax.swing.*;
import java.awt.*;

public class Plansza extends JPanel {
    int width;
    int height;
    String[][] polaPlanszyString;

    Pole[][] polaPlanszy;

    public Plansza(Poziom poziom) {
        this.width = poziom.wymiarX;
        this.height = poziom.wymiarY;
        this.polaPlanszyString = poziom.polaPoziomu;
        polaPlanszy = new Pole[width][height];
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //utworzPlanszeObiektow(polaPlanszyString);
        rysujPlansze(g);
    }

    private void utworzPlanszeObiektow(String[][] polaPlanszy) {
        for (int i = 0; i < polaPlanszy.length; i++) {
            for (int j = 0; j < polaPlanszy[i].length; j++) {
                this.polaPlanszy[i][j] = new Pole(polaPlanszy[i][j]);
            }
        }
    }

    private void rysujPlansze(Graphics g) {
        setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        //g.drawLine(10, 10, 30, 30);

        // narysuj siatke planszy na podstawie tabeli polaPlanszy[][]
        int startX = 10;
        int posX;
        int posY = 10;
        int width = 60;
        int height = 60;
        for (int i = 0; i < 5; i++) {
            posX = startX + i * width;
            g.drawRect(posX, posY, width, height);
        }


    }
}