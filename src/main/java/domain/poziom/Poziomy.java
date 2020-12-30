package domain.poziom;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Poziomy {
    int[][] level01 = {{1, 0, 1, 4, 1},
            {4, 2, 0, 2, 0},
            {1, 0, 3, 0, 0},
            {0, 2, 0, 2, 0},
            {1, 4, 0, 4, 1}};

    public void zapiszPoziom() {
        String file = "level01.csv";
        String dir = "levels";
        Path path = Paths.get(dir, file);
        StringBuilder sb = new StringBuilder();
        for (int[] ints : level01) {
            for (int i = 0; i < ints.length; i++) {
                sb.append(ints[i]);
                if (i < ints.length - 1) {
                    sb.append(",");
                } else {
                    sb.append(System.getProperty("line.separator"));
                }
            }
        }
        try {
            Files.writeString(path, sb, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Nie udało się zapisać pliku " + file);
            e.printStackTrace();
        }
    }
}
