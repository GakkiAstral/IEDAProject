package Day1026;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DaysBeforeTest {
    public static void main(String[] args) throws ParseException {
        String birthday = "2019年09月22日";
        String today = "2020年10月26日";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

        Date d1 = (Date) sdf.parse(birthday);
        Date d2 = (Date) sdf.parse(today);

        long time = d2.getTime() - d1.getTime();
        System.out.println(time / 1000 / 60 / 60 / 24);
    }
}
