package academy.everyonecodes.java.optionals.enums.exercise2;

import java.time.DayOfWeek;
import java.time.Month;

public class Drawer {
    public Outfit getOutfitForToday(DayOfWeek day, Month month) {
        Socks sock = getProperSock(day);
        Headpiece headpiece = getProperHeadpiece(month);
        Outfit outfit = new Outfit(sock, headpiece);
        return outfit;

    }

    private Socks getProperSock(DayOfWeek day) {
        if (day.getValue() == 1) {
            return Socks.REDSOCKS;

        } else if (day.getValue() == 6 || day.getValue() == 7) {
            return Socks.GREENSOCKS;

        }

        return Socks.YELLOWSOCKS;
    }

    private Headpiece getProperHeadpiece(Month month) {
        if (month.getValue() == 11 || month.getValue() == 12 || month.getValue() == 1 || month.getValue() == 2) {
            return Headpiece.BEANIE;

        }
        return Headpiece.HAT;

    }

}
