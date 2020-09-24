package classtest3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SimpleDateFormat_format {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Scanner scanner = new Scanner(System.in);
        List<Date>  list=new ArrayList<>();
        for (int i = 0; i <3; i++) {
            System.out.println("请你输入日期"+i);
            String str = scanner.nextLine();
            date=sdf.parse(str);
            list.add(date);
        }
       Collections.sort(list);
        for (Date i:list){
            System.out.println(sdf.format(i));
        }

    }
}
