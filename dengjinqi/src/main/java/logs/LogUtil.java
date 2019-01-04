package logs;
import org.apache.log4j.Logger;

/**
 * 自定义日志
 *	@author dengjinqi(daniel.deng@wetax.com.cn)
 */

public class LogUtil {

    public static Logger log ;

    /**
     * error级别日志
     * @param message
     */
    public void error(Object message){
        log.error(message);
    }
    /**
     * info 级别日志
     * @param message
     */
    public void info(Object message){
        log.info(message);
    }
    /**
     * debug级别日志
     * @param message
     */
    public void debug(Object message){
        log.debug(message);
    }
    /**
     * warn级别日志
     * @param message
     */
    public void warn(Object message){
        log.error(message);
    }

    public static void main(String[] args) {
        log.error("aaaaaaaaaa");
    }

}
