package net.yangwenxin.frame.util;

import org.apache.commons.lang3.StringUtils;

/**
 * 字符串工具类
 *
 * @author yangwenxin
 * @Date 2019-9-18 17:00
 */
public class StringUtil {

    /**
     * 判断字符串是否为空
     *
     * @author yangwenxin
     * @Date 2019-9-18 17:01
     */
    public static boolean isEmpty(String str) {
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    /**
     * 判断字符串是否非空
     *
     * @author yangwenxin
     * @Date 2019-9-18 17:02
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    /**
     * 分隔固定格式的字符串
     *
     * @author yangwenxin
     * @Date 2019-9-19 16:41
     */
    public static String[] splitString(String str, String separator) {
        return StringUtils.splitByWholeSeparator(str, separator);
    }
}
