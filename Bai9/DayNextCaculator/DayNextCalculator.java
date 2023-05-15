package Bai9.DayNextCaculator;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DayNextCalculator {
    static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public static String dayNextCalculator(String today) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        Date inputToday = format.parse(today);
        calendar.setTime(inputToday);
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        Date tomorrow = calendar.getTime();
        return format.format(tomorrow);

    }

}
