package org.start.chapter1.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by XHJ on 2018/1/29.
 * 加载属性文件工具类
 */
public class PropsUtil {
    private static final Logger logger = LoggerFactory.getLogger(PropsUtil.class);

    /**
     * 属性文件工具类
     * @param fileName
     * @return
     */
    public static Properties loadProps(String fileName) {
        Properties props = null;
        InputStream is = null;


            try {
                is = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
                if (is == null) {
                    throw new FileNotFoundException(fileName + "file is not found");
                }
                props = new Properties();
                props.load(is);
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }finally {
                if (is != null) {
                    try {
                        is.close();
                    } catch (IOException e) {
                        logger.error("close input stream failure",e);
                    }
                }
            }
        return props;
    }

    /**
     * 获取字符属性（默认值为空字符串）
     * @param props
     * @param key
     * @return
     */
    public static String getString(Properties props, String key) {
        return getString(props,key,"");
    }

    /**
     * 获取字符属性（可指定默认值）
     * @param props
     * @param key
     * @param defaultVale
     * @return
     */
    public static String getString(Properties props, String key, String defaultVale) {
        String value = defaultVale;
        if (props.containsKey(key)) {
            value = props.getProperty(key);
        }
        return value;
    }

    /**
     * 获取数值型属性（默认值为0）
     * @param props
     * @param key
     * @return
     */
    public static int getInt(Properties props, String key) {
        return getInt(props,key,0);
    }

    /**
     * 获取数值型属性（默认值为0）
     * @param props
     * @param key
     * @param defaultValue
     * @return
     */
    public static int getInt(Properties props, String key, int defaultValue) {
        int value = defaultValue;
        if (props.containsKey(key)) {
            value = CastUtil.castInt(props.getProperty(key));
        }
        return value;
    }

    /**
     * 获取布尔型属性（默认值为false）
     * @param props
     * @param key
     * @return
     */
    public static boolean getBoolean(Properties props, String key) {
        return getBoolean(props, key, false);
    }

    public static boolean getBoolean(Properties props, String key, boolean defaultValue) {
        boolean value = defaultValue;
        if (props.containsKey(key)) {
            value = CastUtil.castBoolean(props.getProperty(key));
        }
        return value;
    }
}
