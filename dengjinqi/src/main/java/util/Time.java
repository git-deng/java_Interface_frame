package util;

import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *@Time   时间工具类
 *@author dengjinqi(daniel.deng@wetax.com.cn) 2018-12-18
 */

public class Time {
    private static Logger log = Logger.getLogger(Time.class);
    /**
     * 说明：获取当前时间，返回的格式为：yyyMMddHHmmss
     * @return String yyyMMddHHmmss
     */
    public static String get_time(){
        long time = System.currentTimeMillis();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:dd");
        String datetime = format.format(new Date(time));
        return datetime;
    }

    /**
     * 说明：获取当前时间戳，Unix时间戳格式
     * @return String
     */
    public static String getTimestamp() {
        String nowTime = Long.toString(new Date().getTime() / 1000);
        return nowTime;
    }

    /**
     * 等待
     * @param Seconds 秒
     */
    public static void sleep(int Seconds){
        try {
            Thread.sleep(Seconds*1000);
        } catch (InterruptedException e) {
            log.error(e.getMessage());
        }
    }
}
