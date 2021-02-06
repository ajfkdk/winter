package itheima.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dataUtil {
    public String Data2String(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/mm/dd - HH:mm");
        String format1 = format.format(date);
        return format1;
    }

    public Date String2Date( String DateStr) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/mm/dd - HH:mm");
        Date parse = format.parse(DateStr);
        return parse;
    }
}
