package by.epamtranning.action;

public class DateAction {

    private int nextDay;
    private int nextMonth;
    private int nextYear;

    public int getNextDay() {
        return nextDay;
    }

    public int getNextMonth() {
        return nextMonth;
    }

    public int getNextYear() {
        return nextYear;
    }

    public void findNextDay(int day, int month, int year) {
        int maxDay = 0;
        int beginPoint = 1582;
        int defaultAmountMonth = 12;

        int index400 = 400;  // годы, кратные 4 – високосные;
        int index4 = 4;      // годы, кратные 4 и 100 – невисокосные;
        int index100 = 100;  // годы, кратные 4, 100 и 400;

        if (year >= beginPoint) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    maxDay = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    maxDay = 30;
                    break;
                case 2:
                    if ((year % index400 == 0) || ((year % index4 == 0) && (year % index100 != 0))) {
                        maxDay = 29;
                    } else {
                        maxDay = 28;
                    }
                    break;
                default:
                    System.out.println("Incorrect month.");
                    break;
            }

            if ((day == maxDay) && (month == defaultAmountMonth)) {
                nextDay = 1;
                nextMonth = 1;
                nextYear = ++year;
            } else if (day == maxDay) {
                nextDay = 1;
                nextMonth = ++month;
                nextYear = year;
            } else if (day < maxDay) {
                nextDay = ++day;
                nextMonth = month;
                nextYear = year;
            } else {
                System.out.println("Incorrect day.");
            }
        } else {
            System.out.println("Incorrect year.");
        }
    }
}
