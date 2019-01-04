//package util;
//
//import io.restassured.path.json.JsonPath;
//import org.apache.log4j.Logger;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
///**
// *  Jsonpath 验证工具类
// *  @author dengjinqi(daniel.deng@wetax.com.cn) 2018-12-18
// */
//
//public class Jsonpath_Verification {
//    public static Logger log = Logger.getLogger(Jsonpath_Verification.class);
//
//    public static void Jsonpath_Verification(String json, String path, String expectea_results) {
//        String jsondata = replaceBlank(json);
//        JsonPath jsonpath = new JsonPath(jsondata);
//        Boolean actual_results = jsonpath.getString(path).contentEquals(expectea_results);
//        if (actual_results == true) {
//            log.info("jsonpath正确");
//        } else {
//            log.error("jsonpath错误");
//        }
//    }
//
//    public static String replaceBlank(String str) {
//        String dest = "";
//        if (str != null) {
//            Pattern p = Pattern.compile("\\s*|\t|\r|\n");
//            Matcher m = p.matcher(str);
//            dest = m.replaceAll("");
//        }
//            return dest;
//    }
//}