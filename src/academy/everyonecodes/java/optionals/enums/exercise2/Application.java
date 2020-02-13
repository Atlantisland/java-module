package academy.everyonecodes.java.optionals.enums.exercise2;

import java.time.DayOfWeek;
import java.time.Month;

public class Application {

    public static void main(String[] args) {
        WeeklyCalendar weeklyCalendar = new WeeklyCalendar();
        MonthlyCalendar monthlyCalendar = new MonthlyCalendar();
        Drawer drawer = new Drawer();
        DayOfWeek day = weeklyCalendar.askForDayOfWeek();
        Month month = monthlyCalendar.askForMonth();
        Outfit outfit = drawer.getOutfitForToday(day, month);
        Mirror mirror = new Mirror();
        mirror.sayHowItLooks(day, month, outfit);
    }
}
