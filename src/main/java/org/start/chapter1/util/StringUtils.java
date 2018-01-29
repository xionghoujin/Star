package org.start.chapter1.util;

/**
 * Created by XHJ on 2018/1/29.
 * 字符串工具类
 */
public class StringUtils {
    /**
     * 判断字符串是否为空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str){
        if (str != null) {
            str=str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    /**
     * 判断字符串是否非空
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }
}
