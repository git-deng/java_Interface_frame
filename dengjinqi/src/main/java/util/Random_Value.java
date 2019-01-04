package util;

import org.apache.log4j.Logger;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;

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
    public static String Random_Number(int length) {
        StringBuilder sb = new StringBuilder();
        if (length<1){
            log.error("随机数生成失败，随机数长度需要大于等于1，当前随机数长度为：【"+length+"】");
            return null;
        }else {

            Random rand = new Random();
            for(int i = 0;i < length; i++)
            {
                sb.append(rand.nextInt(10));
            }
        }
        return sb.toString();
    }

    /**
     * 生成随机字符串
     * @param length 指定字符串长度
     */
    public static String getRandomStr(int length) {
        java.util.Random randGen = null;
        char[] numbersAndLetters = null;
        char[] randBuffer = new char[length];
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

            for (int i = 0; i < randBuffer.length; i++) {
                randBuffer[i] = numbersAndLetters[randGen.nextInt(71)];
            }
        }
        return new String(randBuffer);
    }
}