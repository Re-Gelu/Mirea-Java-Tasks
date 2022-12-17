package task22.punkt3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Family {
    public static void main(String[] args) {
        System.out.println("Уткин");
        Calendar calendar = new GregorianCalendar(2022, Calendar.NOVEMBER, 8, 13, 43);
        Date date1 = calendar.getTime();
        System.out.println("Получил задание " + date1);
        Date date = new Date();
        System.out.println("Сдача задания " + date);

    }
}
