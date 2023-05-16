package Bai9.DayNextCaculator;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DayNextCalculator {
    static Scanner scanner = new Scanner(System.in);
    static Calendar calendar = Calendar.getInstance();
    static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public static String output() throws ParseException {
        String today;
        Date inputDate;
        while (true) {
            try {
                System.out.println("Nhập ngày tháng năm theo định dạng dd/MM/yyyy");
                today = scanner.nextLine();
                inputDate = format.parse(today);
                break;
            } catch (Exception e) {
                System.out.println("Không đúng định dạng.");
            }
        }
        calendar.setTime(inputDate);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);
        boolean isLeapYear = checkLeapYear(year);
        return output(day, month, year, isLeapYear);
    }

    public static String output(int day, int month, int year, boolean isLeapYear) {
        if ((day == 28 || day == 29) && month == 2) {
            if (isLeapYear && day == 28) {
                day = 29;
            } else {
                day = 1;
                month = 3;
            }
        } else if (day == 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)) {
            day = 1;
            month = month + 1;
        } else if (day == 31 && month == 12) {
            day = 1;
            month = 1;
            year = year + 1;
        } else if (day == 30 && (month == 3 ||month==4|| month == 6 || month == 9 || month == 11)) {
            day = 1;
            month += 1;
        } else {
            day += 1;
        }
        System.out.println("Ngày hôm sau:");
        return day + "/" + month + "/" + year;
    }


    public static boolean checkLeapYear(int year) {
        boolean check;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    check = true;
                } else {
                    check = false;
                }
            } else {
                check = true;
            }
        } else {
            check = false;
        }
        return check;
    }

}