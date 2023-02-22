package school.mjc.stage0.conditions.task5;

import java.time.Month;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        switch (month) {
            case 1 -> System.out.println(Month.JANUARY.length(false));
            case 2 -> System.out.println(Month.FEBRUARY.length(false));
            case 3 -> System.out.println(Month.MARCH.length(false));
            case 4 -> System.out.println(Month.APRIL.length(false));
            case 5 -> System.out.println(Month.MAY.length(false));
            case 6 -> System.out.println(Month.JUNE.length(false));
            case 7 -> System.out.println(Month.JULY.length(false));
            case 8 -> System.out.println(Month.AUGUST.length(false));
            case 9 -> System.out.println(Month.SEPTEMBER.length(false));
            case 10 -> System.out.println(Month.OCTOBER.length(false));
            case 11 -> System.out.println(Month.NOVEMBER.length(false));
            case 12 -> System.out.println(Month.DECEMBER.length(false));
            default -> System.out.println("wrong number!");
        }
    }
}
