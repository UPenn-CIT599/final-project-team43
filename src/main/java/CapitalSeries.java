
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * store one capital series unit
 *
 * @author Haotian Zhang
 *
 */
public class CapitalSeries {

  Timestamp date;
  int capital;

  /**
   * store capital units each month
   *
   * @param date
   * @param capital
   */
  public CapitalSeries(String date, int capital) {
    this.date = dateToStamp(date);
    this.capital = capital;
  }

  /**
   * parase a string into timestamp
   *
   * @param s
   * @return
   */
  public static Timestamp dateToStamp(String s) {
    Calendar calendar = Calendar.getInstance(); // 19890926
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String nowtime = format.format(calendar.getTime());
    Timestamp timestamp = Timestamp.valueOf(nowtime);

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String res = "";
    if (!"".equals(s)) {
      try {
        res = String.valueOf(sdf.parse(s).getTime() / 1000);
      } catch (Exception e) {
        System.out.println("null detected");
      }
    } else {
      long time = System.currentTimeMillis();
      res = String.valueOf(time / 1000);
    }

    return timestamp;
  }
}
