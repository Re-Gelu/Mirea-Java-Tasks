package task22.punkt2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Time {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar(2017, Calendar.JULY , 25, 10, 42, 12);
        //calendar.set(Calendar.HOUR, 10);
        //calendar.set(Calendar.MINUTE, 42);
        //calendar.set(Calendar.SECOND, 12);

        //System.out.println("Год: " + calendar.get(Calendar.YEAR));
        //System.out.println("Месяц: " + (calendar.get(Calendar.MONTH) + 1));
        //System.out.println("Порядковый номер недели в месяце: " + calendar.get(Calendar.WEEK_OF_MONTH));//порядковый номер недели в месяце

        //System.out.println("Число: " + calendar.get(Calendar.DAY_OF_MONTH));

        //System.out.println("Часы: " + calendar.get(Calendar.HOUR));
        //System.out.println("Минуты: " + calendar.get(Calendar.MINUTE));
        //System.out.println("Секунды: " + calendar.get(Calendar.SECOND));
        //System.out.println("Миллисекунды: " + calendar.get(Calendar.MILLISEOND));
        DateFormat df = new SimpleDateFormat("dd MMMMMMMMMMM yyyy hh:mm:ss");
        System.out.println(df.format(calendar.getTime()));

        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(97975676756L);

        System.out.println(formater.format(date));

    }
}
