import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class TimeUtil {

    public static long getTimestamp() {
        try {
            Date A = new Date(System.currentTimeMillis());
            Date B = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse("01/01/1970 00:00:00");  
        
            long res = A.getTime() - B.getTime();       

            return res;
          } catch (Exception e) {
            e.printStackTrace();
            return -1;
          } 
    }

    public static Date timeToDate(long time) {
        try {
            Date B = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse("01/01/1970 00:00:00");  
            return new Date(time + B.getTime());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
