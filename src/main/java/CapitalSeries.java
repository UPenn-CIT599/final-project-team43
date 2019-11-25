package main.java;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * store one capital series unit
 *
 * @author Haotian Zhang
 *
 */
public class CapitalSeries {

  LocalDateTime date;
  double capital;
  String dateStr;

  /**
   * store capital units each month
   *
   * @param date(2018-05-12 08:30:30)
   * @param d
   * @param dateStr(20180512) 
   */
  public CapitalSeries(String date, double d) {
    this.date = parseDate(date);
    this.capital = d;
    this.dateStr = date;
    
  }

  /**
   * parase a string into LocalDateTime
   *
   * @param s
   * @return
   */
  public static LocalDateTime parseDate(String s) {
	
	DateTimeFormatter formatDataTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");
	
//	LocalDateTime localDateTime1 = LocalDateTime.now();
	LocalDateTime localDateTime = LocalDateTime.of(Integer.parseInt(s.substring(0, 4)), 
			Integer.parseInt(s.substring(4, 6)), 
			Integer.parseInt(s.substring(6, 8)), 0, 0);
	
	String formatDataTimeStr = localDateTime.format(formatDataTime);
	String formatDateStr = localDateTime.format(formatDate);
	String formatTimeStr = localDateTime.format(formatTime);
	
	
//	LocalDateTime time1 = LocalDateTime.parse(s+ " 08:30:30", formatDate);
//	LocalDateTime time2 = LocalDateTime.parse("2018-04-20 16:30:30", formatDataTime);
	
	LocalDateTime res = null;
    if (!"".equals(s)) {
      try {
        res = localDateTime;
      } catch (Exception e) {
        System.out.println("null detected");
      }
    } else {
      LocalDateTime time = LocalDateTime.now();
      res = time;
    }

    return res;
  }
  
  @Override
  public String toString() {
	  return this.dateStr;
  }
}
