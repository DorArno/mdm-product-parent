package com.einwin.mdm.order.util;


import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 * 日期工具类
 * @author gaod003
 */
public class DateUtils {

    /**
     * 日期 格式化:yyyy-MM-dd
     */
    public static final String DATE = "yyyy-MM-dd";
    /**
     * 日期 格式化:yyyyMMdd
     */
    public static final String DATE_WITHOUT_SEPERATOR = "yyyyMMdd";

    /**
     * 日期-小时 格式化
     */
    public static final String DATE_HOUR = "yyyyMMddHH";

    public static final String DATE_HOUR_SECOND = "yyyyMMddHHmmss";

    public static final String DATE_HOUR_NANOSECOND = "yyyyMMddHHmmssSSS";

    /**
     * 日期小时分钟 格式化
     */
    public static final String DATE_SPACE_MINUTE = "yyyy-MM-dd HH:mm";
    /**
     * 日期时间 格式化
     */
    public static final String TIMESTAMP = "yyyy-MM-dd HH:mm:ss";

    /**
     * 1周的天数
     */
    public static final int ONE_WEEK_DAYS = 7;
    /**
     * 一秒的毫秒数
     */
    public static int ONE_SECOND_MILLI_SECONDS = 1000;
    /**
     * 一分钟的秒数
     */
    public static int ONE_MINUTE_SECONDS = 60;
    /**
     * 一分钟的毫秒数
     */
    public static int ONE_MINUTE_MILLISECONDS = ONE_MINUTE_SECONDS * ONE_SECOND_MILLI_SECONDS;
    /**
     * 一小时的毫秒数
     */
    public static final int ONE_HOUR_MILLISECONDS = 60 * 60 * 1000;
    /**
     * 一天的秒数
     */
    public static int ONE_DAY_SECONDS = 24 * 60 * 60;
    /**
     * 一周的秒数
     */
    public static int ONE_WEEK_SECONDS = ONE_DAY_SECONDS * ONE_WEEK_DAYS;

    private static final int LAST_SECOND_OF_MINUTE = 59;
    private static final int LAST_MINUTE_OF_HOUR = 59;
    private static final int LAST_HOUR_OF_DAY = 23;


    /**
     * 转换时间
     *
     * @param format
     * @param date
     * @return
     */
    public static String parseDate2Str(String format, Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }

    public static Date parseStr2Date(String format, String date) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.parse(date);
    }

    /**
     * 将 java.time.LocalDateTime 转为指定格式的时间字串
     */
    public static String localDateTime2Str(LocalDateTime localDateTime, String pattern) {
        if (localDateTime == null || pattern == null) {
            return "";
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return formatter.format(localDateTime);
    }

    /**
     * 将 java.time.LocalDate 转为指定格式的时间字串
     */
    public static String localDate2Str(LocalDate localDate, String pattern) {
        if (localDate == null || pattern == null) {
            return "";
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return formatter.format(localDate);
    }

    /**
     * 当前创建时间（yyyy-MM-dd HH:mm:ss）
     *
     * @return
     */
    public static String currentDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(TIMESTAMP);
        return simpleDateFormat.format(new Date());
    }

    public static String currentDate(String formate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formate);
        return simpleDateFormat.format(new Date());
    }

    /**
     * 以当期日期为基准，返回指定日期类型日期增量日期。
     *
     * @param dateType 日期类型
     * @param count    增加数量，可以为负数
     * @return
     */
    public static Date getMagicDate(int dateType, int count) {
        Calendar calendar = new GregorianCalendar();
        Date todayTime = new Date();
        calendar.setTime(todayTime);
        calendar.add(dateType, count);
        return calendar.getTime();
    }

    /**
     * 返回指定日期类型日期增量日期
     *
     * @param dateType 日期类型
     * @param count    增加数量，可以为负数
     * @param baseDate 参照日期
     * @return
     */
    public static Date getMagicDate(int dateType, int count, Date baseDate) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(baseDate);
        calendar.add(dateType, count);
        return calendar.getTime();
    }

    /**
     * 日期字符串转换为日期格式，转换出错时将返回null。
     *
     * @param dateStr    日期字符串
     * @param dateFormat 日期格式
     * @return date对象
     */
    public static Date strToDate(String dateStr, String dateFormat) {
        SimpleDateFormat format = new SimpleDateFormat(dateFormat);
        Date date = null;
        try {
            date = format.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     *
     * @param month -1:前一月,0:当前月,1:后一个月
     * @param dateFormat
     * @return
     */
    public static String getFirstDayOfmonth(int month,String dateFormat){
        Calendar cal_1= Calendar.getInstance();
        cal_1.add(Calendar.MONTH, month);
        cal_1.set(Calendar.DAY_OF_MONTH,1);
        SimpleDateFormat format = new SimpleDateFormat(dateFormat);
        return format.format(cal_1.getTime());
    }

    /**
     * 将时间戳转为"yyyy-MM-dd HH:mm:ss"格式的时间字串
     *
     * @param mill 时间戳
     * @return "yyyy-MM-dd HH:mm:ss"格式的时间字串
     */
    public static String stampToSecondStr(long mill) {
        Date date = new Date(mill);
        String strs = "";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(TIMESTAMP);
            strs = sdf.format(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strs;
    }

    /**
     * 日期转换为指定格式的字符
     *
     * @param date       日期
     * @param dateFormat 日期格式
     * @return
     */
    public static String dateToString(Date date, String dateFormat) {
        String returnValue = "";
        if (date != null) {
            SimpleDateFormat df = new SimpleDateFormat(dateFormat);
            returnValue = df.format(date);
        }
        return returnValue;
    }

    /**
     * 日期字符串转换为日期格式
     *
     * @param dateStr    日期字符串
     * @param dateFormat 日期格式
     * @return
     * @throws ParseException
     */
    public static Date stringToDate(String dateStr, String dateFormat) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat(dateFormat);
        try {
            return sf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new ParseException("日期解析错误！", 0);
        }
    }

    /**
     * 传入格式，返回今天的日期字串
     */
    public static String getTodayStr(String format) {
        String todayStr = dateToString(new Date(), format);
        return todayStr;
    }

    /**
     * @return 时间
     * @brief 获取一个时间，这个时间是今天的第0秒
     */
    public static Date getTodayAtFirstSecond() {
        Calendar now = Calendar.getInstance();
        now.setTimeInMillis(System.currentTimeMillis());
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(now.get(Calendar.YEAR), now.get(Calendar.MONTH), now.get(Calendar.DAY_OF_MONTH));
        return cal.getTime();
    }

    /**
     * @return 时间
     * @brief 获取一个时间，这个时间是今天的最后一秒
     */
    public static Date getTodayAtLastSecond() {
        Calendar now = Calendar.getInstance();
        now.setTimeInMillis(System.currentTimeMillis());
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(now.get(Calendar.YEAR), now.get(Calendar.MONTH), now.get(Calendar.DAY_OF_MONTH), LAST_HOUR_OF_DAY,
                LAST_MINUTE_OF_HOUR, LAST_SECOND_OF_MINUTE);
        return cal.getTime();
    }

    /**
     * 获取昨天的日期，时分秒与此刻相同。
     *
     * @return 昨天的日期，时分秒与此刻相同。
     */
    public static Date getYestodayDate() {
        Date yestoday = getMagicDate(Calendar.DAY_OF_MONTH, -1);
        return yestoday;
    }

    /**
     * 获取昨天第一秒的日期，即yyyy-MM-dd 00:00:00.
     *
     * @return 昨天第一秒的日期，即 yyyy-MM-dd 00:00:00.
     */
    public static Date getYestodayFirstTime() {
        // 获取昨天的日期，时分秒与此刻相同。
        Date yestoday = getYestodayDate();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(yestoday);
        // 时间设置为 00:00:00
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date yestodayFirstTime = calendar.getTime();

        return yestodayFirstTime;
    }

    /**
     * 获取昨天第一秒的日期，即 yyyy-MM-dd 00:00:00.
     *
     * @return 昨天第一秒的日期，即 yyyy-MM-dd 00:00:00.
     */
    public static String getYestodayFirstTimeStr() {
        Date yestodayFirstTime = getYestodayFirstTime();
        return dateToString(yestodayFirstTime, TIMESTAMP);
    }

    /**
     * 获取昨天最后一秒的日期，即 yyyy-MM-dd 23:59:59.
     *
     * @return 昨天最后一秒的日期，即 yyyy-MM-dd 23:59:59.
     */
    public static Date getYestodayLastTime() {
        // 获取昨天的日期，时分秒与此刻相同。
        Date yestoday = getYestodayDate();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(yestoday);
        // 时间设置为23:59:59
        calendar.set(Calendar.HOUR_OF_DAY, LAST_HOUR_OF_DAY);
        calendar.set(Calendar.MINUTE, LAST_MINUTE_OF_HOUR);
        calendar.set(Calendar.SECOND, LAST_SECOND_OF_MINUTE);
        Date yestodayLastTime = calendar.getTime();

        return yestodayLastTime;
    }

    /**
     * 获取昨天最后一秒的日期，即 yyyy-MM-dd 23:59:59.
     *
     * @return 昨天最后一秒的日期，即 yyyy-MM-dd 23:59:59.
     */
    public static String getYestodayLastTimeStr() {
        Date yestodayEnd = getYestodayLastTime();
        return dateToString(yestodayEnd, TIMESTAMP);
    }

    /**
     * 将yyyy-MM-dd HH:mm:ss时间格式的日期转化为LocalDateTime
     *
     * @param dateTime yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static LocalDateTime parseStr2LocalDate(String dateTime) {
        if (StringUtils.isEmpty(dateTime)) {
            return null;
        }
        return LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern(TIMESTAMP));
    }

    /**
     * <p>获取当前时间</p>
     *
     * @param pattern - 时间格式
     * @return - 时间字符串
     */
    public static String queryCurrentTime(String pattern) {
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(Calendar.getInstance().getTime());
    }

    //时间比较
    public static int compare_date(String date1, String date2) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d1 = df.parse(date1);
            Date d2 = df.parse(date2);
            if (d1.getTime() > d2.getTime()) {

                return 1;
            } else if (d1.getTime() < d2.getTime()) {

                return -1;
            } else {
                return 0;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return 0;

    }

    public static int compare_Time(String date1, String date2, String format) {
        SimpleDateFormat df = new SimpleDateFormat(format);
        try {
            Date d1 = df.parse(date1);
            Date d2 = df.parse(date2);
            if (d1.getTime() > d2.getTime()) {

                return 1;
            } else if (d1.getTime() < d2.getTime()) {

                return -1;
            } else {
                return 0;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return 0;

    }

    /**
     * 将时间字串转为 LocalDateTime，时间字串的格式请用 pattern 指定
     */
    public static LocalDateTime str2LocalDateTime(String datetimeStr, String pattern) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime localDateTime = LocalDateTime.parse(datetimeStr, dateTimeFormatter);
        return localDateTime;
    }

    public static DateTimeFormatter getTimeStampDateTimeFormatter(){
        return DateTimeFormatter.ofPattern(TIMESTAMP);
    }

    public static long getMsByDateStr(String   dateStr){
    	Date d=null;
        try{
            SimpleDateFormat sf =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            d=sf.parse(dateStr);
        }
        catch(Exception   e){
        	e.printStackTrace();
        }
        return d.getTime();
    }

}
