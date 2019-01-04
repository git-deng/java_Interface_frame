package com.github.dengjinqi;
import org.apache.log4j.Logger;
import java.util.Random;

public class log4j_test {
    private static Logger log = Logger.getLogger(log4j_test.class);
    public static void main(String[] args){

//        log.info(createData(-1));
        createData(-11);
    }

    /**
     * 生成随机数字
     * @param length 指定字符串长度,length需要大于等于1
     * @return String
     */
    public static void createData(int length) {
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
}
