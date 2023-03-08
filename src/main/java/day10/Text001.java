/**
 * author:sj
 */

package day10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Text001 {
    public static void main(String[] args) {
        Date today = new Date();   //当前时间
        Calendar calendar = Calendar.getInstance(); //得到日历
        calendar.setTime(today);
        calendar.add(Calendar.DAY_OF_MONTH, 1);  //设置为后一天
        Date tomorrow = calendar.getTime();   //得到后一天的时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //设置时间格式
        String format = sdf.format(tomorrow);
        String s="{\"isTeaching\": 0,\n" +
                " \"isFever\": 0, \n" +
                " \"isIllness\": 0, \n" +
                " \"infectionCondition\": 2, \n" +
                " \"infectionConditionOthres\": \"\",\n" +
                " \"clockDate\": \""+format+"\",\n" +
                " \"gh\": \"20408010109\",\n" +
                " \"vaccineCondition\": 3\n" +
                " }";
        Date date = new Date();
        date.setTime(1548831395065L); //注意此处毫秒值应该加上l，表示long型数据，否则报错
        DateFormat dateFormat = DateFormat.getDateInstance();
        String formatq = dateFormat.format(date);
        System.out.println(formatq);







    }
}
