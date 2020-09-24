package classtest3;

import java.util.Calendar;

public class Calender_test {
    public static void main(String[] args) {
        Calendar nowtime=Calendar.getInstance();
        System.out.println(nowtime.get(Calendar.YEAR));
        System.out.println(nowtime.get(Calendar.MONTH)+1);
        System.out.println(nowtime.get(Calendar.DAY_OF_MONTH));
        System.out.println(nowtime.get(Calendar.MINUTE));
        System.out.println(nowtime.get(Calendar.SECOND));
        System.out.println(nowtime.get(Calendar.DAY_OF_WEEK));
    }
}
