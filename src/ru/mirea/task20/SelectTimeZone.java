package ru.mirea.task20;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TimeZone;

public class SelectTimeZone {
    private final int    hour       = 1000 * 60 * 60;
    private final String TEMPL_TZ   = "%s (%s)";
    private final String TEMPL_OFFS = "hour offset=(%d)";


    String align(String str, int len)
    {
        if (len - str.length() > 0){
            char[] buf = new char[len - str.length()];
            Arrays.fill (buf, ' ');
            return str + new String(buf);
        } else
            return str.substring(0, len);
    }
    private void drawTimeZoneParam(final TimeZone tz)
    {
        String line = null;
        line  = String.format(TEMPL_TZ, tz.getID(),
                tz.getDisplayName());
        line  = align(line, 64);
        line += String.format(TEMPL_OFFS,
                tz.getRawOffset() / hour);
        System.out.println(line);
    }
    public SelectTimeZone(){
        //ввод местоположения
        System.out.println("Введите страну и город в следующем формате: Часть света/Город");
        Scanner in1 = new Scanner(System.in);
        String place = in1.nextLine();
        TimeZone tz = TimeZone.getTimeZone(place);
        System.out.println("Ваш часовой пояс: ");
        drawTimeZoneParam(tz);

        Calendar calendar = new GregorianCalendar();
//        calendar.setTimeZone(tz);
//        System.out.println("Текущее время: " + calendar.getTime());
        calendar.setTimeZone(tz);
        System.out.println("Текущее время: " + calendar.get(Calendar.HOUR_OF_DAY)+":"+calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND));

        //смена часового пояса
        System.out.println("Сменить часовой пояс? (1 - да, 0 - нет)");
        Scanner in2 = new Scanner(System.in);
        int choice = in2.nextInt();
        if(choice == 1){
            System.out.println("Введите страну и город в следующем формате: Часть света/Город");
            Scanner in3 = new Scanner(System.in);
            String newPlace = in3.nextLine();

            System.out.println("Часовой пояс изменен!");
            TimeZone newTz = TimeZone.getTimeZone(newPlace);
            System.out.println("Ваш часовой пояс: ");
            drawTimeZoneParam(newTz);

            calendar.setTimeZone(newTz);
            System.out.println("Текущее время: " + calendar.get(Calendar.HOUR_OF_DAY)+":"+calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND));
        }
    }
    public static void main(String[] args){
        new SelectTimeZone();
        System.exit(0);
    }
}
