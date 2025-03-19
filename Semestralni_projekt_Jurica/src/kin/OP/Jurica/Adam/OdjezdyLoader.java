package kin.OP.Jurica.Adam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Třída načítající data odjezdů z externího souboru
public class OdjezdyLoader {

    //nacita vsechny odjezdy ze zdrojovoho souboru
    public List<Odjezd> nactiOdjezdy(String fileName) {
        List<Odjezd> odjezdy = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String lineData;
            br.readLine(); // Přeskočí hlavičku

            while ((lineData = br.readLine()) != null) {
                String[] values = lineData.split(",");
                int type = values[0].trim().equals("weekday") ? 0 : 1;
                int hour = Integer.parseInt(values[1].trim());
                int minute = Integer.parseInt(values[2].trim());
                int line = Integer.parseInt(values[3].trim());
                odjezdy.add(new Odjezd(type, hour, minute, line));
            }

        } catch (IOException e) {
            System.out.println("Chyba při čtení souboru: " + e.getMessage());
        }

        return odjezdy;
    }
}
