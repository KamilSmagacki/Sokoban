package domain.plansza;

import domain.pole.Pole;

import javax.swing.*;
import java.awt.*;

public class Plansza extends JPanel {
    int width;
    int height;
    int startX = 10;
    int startY = 10;
    String[][] polaPlanszyString;
    Pole[][] tabelaPol;

    public Plansza(Poziom poziom) {
        this.width = poziom.wymiarX;
        this.height = poziom.wymiarY;
        this.polaPlanszyString = poziom.polaPoziomu;
        // polaPlanszy = new Pole[width][height];
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //utworzPlanszeObiektow(polaPlanszyString);
        rysujPlansze(g);
    }

   /* private void utworzPlanszeObiektow(String[][] polaPlanszy) {
        for (int i = 0; i < polaPlanszy.length; i++) {
            for (int j = 0; j < polaPlanszy[i].length; j++) {
                this.polaPlanszy[i][j] = new Pole(polaPlanszy[i][j]);
            }
        }
    }*/

    private void rysujPlansze(Graphics g) {
        setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        //g.drawLine(10, 10, 30, 30);
        // narysuj siatke planszy na podstawie tabeli polaPlanszy[][]
        int width = 60;
        int height = 60;
        Pole p;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                p = tabelaPol[i][j];
                g.drawRect(p.wierzcholek.x, p.wierzcholek.y, p.rozmiar.width, p.rozmiar.height);
            }
        }
        g.drawOval(30, 30, 20, 20);
    }

    public void utworzTabelePol(int x, int y) {
        tabelaPol = new Pole[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                Pole p = new Pole(i, j, startX, startY);
                tabelaPol[i][j] = p;
            }
        }
    }
}