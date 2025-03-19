package kin.OP.Jurica.Adam;

import java.time.LocalTime;

//Třída formátující získaná data ze souborů. Zároveň přidává k odjezdům z konečné stanice minuty podle toho na jaké zastávce jsme
public class Odjezd {

    private final int type; // 0 = weekday, 1 = weekend
    private int hour;
    private int minute;
    private final int line;

    public Odjezd(int type, int hour, int minute, int line) {
        this.type = type;
        this.hour = hour;
        this.minute = minute;
        this.line = line;
    }

    //vrací hodnotu podle toho zda se jedna o vikend nebo pracovni tyden
    public int getType() {
        return type;
    }

    //vraci hodinu
    public int getHour() {
        return hour;
    }

    //vraci minutu
    public int getMinute() {
        return minute;
    }

    //vraci linku tramvaje
    public int getLine() {
        return line;
    }

    //vraci formatovany cas
    public String getFormattedTime() {
        return String.format("%02d:%02d", hour, minute);
    }

    // Přidání minut k času
    public void addMinutes(int minutesToAdd) {
        // Použijeme LocalTime pro manipulaci s časem
        LocalTime time = LocalTime.of(this.hour, this.minute);
        time = time.plusMinutes(minutesToAdd);
        this.hour = time.getHour();
        this.minute = time.getMinute();
    }
}
