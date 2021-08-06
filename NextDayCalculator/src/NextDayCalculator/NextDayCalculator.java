package NextDayCalculator;

public class NextDayCalculator {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }
    public static int dayOfMonth(int month, int year) {
        int NumOfDays;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                NumOfDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                NumOfDays = 30;
                break;
            case 2:
                if(isLeapYear(year)) {
                    NumOfDays = 29;
                } else {
                    NumOfDays = 28;
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + month);
        }
        return NumOfDays;
    }
    public static String nextDay(int day, int month, int year) {
        day++;
        if (day > dayOfMonth(month, year)) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
        String strDay = day + "";
        String strMonth = month + "";
        String strYear = year + "";

        return strDay + "/" + strMonth + "/" + strYear;
    }
}
