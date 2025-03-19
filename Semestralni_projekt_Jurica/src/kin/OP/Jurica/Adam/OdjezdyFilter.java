package kin.OP.Jurica.Adam;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

//Načítání Odjezdů se zadaným kritériem - odjezdy právě teď
public class OdjezdyFilter {

    //filtruje odjezdy podle kriterii
    public List<Odjezd> filtrujOdjezdy(List<Odjezd> odjezdy, DayOfWeek currentDay, LocalTime currentTime, int maxPocet, int minutesToAdd) {

        boolean isWeekend = currentDay == DayOfWeek.SATURDAY || currentDay == DayOfWeek.SUNDAY;
        LocalDate today = LocalDate.now();
        LocalDate nextDay = today.plusDays(1);
        DayOfWeek dayOfWeek = nextDay.getDayOfWeek();

        boolean tomorrowIsWeekend = dayOfWeek == DayOfWeek.SATURDAY || currentDay == DayOfWeek.SUNDAY;

        List<Odjezd> vybraneOdjezdy = new ArrayList<>();
        int pocet = 0;

        for (Odjezd odjezd : odjezdy) {
            if (pocet >= maxPocet) {
                break;
            }
            odjezd.addMinutes(minutesToAdd);

            if (odjezd.getType() == 0 && !isWeekend) {
                if ((currentTime.getHour() < odjezd.getHour())
                        || (currentTime.getHour() == odjezd.getHour() && currentTime.getMinute() < odjezd.getMinute())) {
                    vybraneOdjezdy.add(odjezd);
                    pocet++;
                }
            } else if (odjezd.getType() == 1 && isWeekend) {
                if ((currentTime.getHour() < odjezd.getHour())
                        || (currentTime.getHour() == odjezd.getHour() && currentTime.getMinute() < odjezd.getMinute())) {
                    vybraneOdjezdy.add(odjezd);
                    pocet++;
                }
            }
        }
        if (pocet < maxPocet) {
            for (Odjezd odjezd : odjezdy) {
                if (pocet >= maxPocet) {
                    break;
                }
                odjezd.addMinutes(minutesToAdd);
                if (odjezd.getType() == 0 && !tomorrowIsWeekend) {
                    vybraneOdjezdy.add(odjezd);
                    pocet++;
                } else if (odjezd.getType() == 1 && tomorrowIsWeekend) {
                    vybraneOdjezdy.add(odjezd);
                    pocet++;
                }
            }
        }

        return vybraneOdjezdy;
    }
}
