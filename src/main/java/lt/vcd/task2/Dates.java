package lt.vcd.task2;

public class Dates {
    public int year_from;
    public int month_from;
    public int day_from;
    public int year_to;
    public int month_to;
    public int day_to;

    int daysCunt;
    public int daysCount(int year_from, int month_from, int day_from, int year_to, int  month_to, int day_to) {
        int yearFromDays = year_from * 365;
        int yearToDays = year_to * 365;

        int monthFromDays = 0;
        int monthToDays = 0;

        switch(month_from) {
            case 1:
                monthFromDays = 0;
                break;
            case 2:
                monthFromDays = 31;
                break;
            case 3:
                monthFromDays = 59;
                break;
            case 4:
                monthFromDays = 90;
                break;
            case 5:
                monthFromDays = 120;
                break;
            case 6:
                monthFromDays = 151;
                break;
            case 7:
                monthFromDays = 181;
                break;
            case 8:
                monthFromDays = 212;
                break;
            case 9:
                monthFromDays = 243;
                break;
            case 10:
                monthFromDays = 273;
                break;
            case 11:
                monthFromDays = 304;
                break;
            case 12:
                monthFromDays = 334;
                break;
        }

        switch(month_to) {
            case 1:
                monthToDays = 0;
                break;
            case 2:
                monthToDays = 31;
                break;
            case 3:
                monthToDays = 59;
                break;
            case 4:
                monthToDays = 90;
                break;
            case 5:
                monthToDays = 120;
                break;
            case 6:
                monthToDays = 151;
                break;
            case 7:
                monthToDays = 181;
                break;
            case 8:
                monthToDays = 212;
                break;
            case 9:
                monthToDays = 243;
                break;
            case 10:
                monthToDays = 273;
                break;
            case 11:
                monthToDays = 304;
                break;
            case 12:
                monthToDays = 334;
                break;
        }

        int daysFrom = yearFromDays + monthFromDays + day_from;
        int daysTo = yearToDays + monthToDays + day_to;

        return daysTo - daysFrom;
    }

}
