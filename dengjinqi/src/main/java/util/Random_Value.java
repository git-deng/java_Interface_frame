package util;

import org.apache.log4j.Logger;
import java.util.Random;

/**
 *@Time   取随机值
 *@author dengjinqi(daniel.deng@wetax.com.cn) 2018-12-18
 */

public class Random_Value {
    private static Logger log = Logger.getLogger(Random_Value.class);
    /**
     * 生成随机数字
     * @param length 指定随机数长度
     */
    public static void Random_Number(int length) {
        String data;
        if (length<1){
            log.error("随机数生成失败，随机数长度需要大于等于1，当前随机数长度为：【"+length+"】");
        }else{
            StringBuilder sb=new StringBuilder();
            Random rand=new Random();
            for(int i=0;i<length;i++)
            {
                sb.append(rand.nextInt(10));
            }
            data=sb.toString();
            log.info(length+"位随机数生成成功，随机数为:【"+data+"】");
        }
    }

    /**
     * 生成随机字符串
     * @param length 指定字符串长度
     */
    public static void getRandomStr(int length) {
        java.util.Random randGen = null;
        char[] numbersAndLetters = null;
        Object initLock = new Object();
        if (length < 1) {
            log.error("随机字符串生成失败，随机字符串长度需要大于等于1，当前随机字符串长度为：【"+length+"】");
        }else{
            if (randGen == null) {
                synchronized (initLock) {
                    if (randGen == null) {
                        randGen = new java.util.Random();
                        numbersAndLetters = ("0123456789abcdefghijklmnopqrstuvwxyz" + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
                    }
                }
            }
            char[] randBuffer = new char[length];
            for (int i = 0; i < randBuffer.length; i++) {
                randBuffer[i] = numbersAndLetters[randGen.nextInt(71)];
            }
            log.info(length+"位随机字符串生成成功，随机字符串为:【"+new String(randBuffer)+"】");
        }
    }
}
