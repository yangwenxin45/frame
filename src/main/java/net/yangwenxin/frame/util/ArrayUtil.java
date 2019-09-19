package net.yangwenxin.frame.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * 数组工具类
 *
 * @author yangwenxin
 * @Date 2019-9-19 13:54
 */
public final class ArrayUtil {

    /**
     * 判断数组是否非空
     *
     * @author yangwenxin
     * @Date 2019-9-19 13:55
     */
    public static boolean isNotEmpty(Object[] array) {
        return !ArrayUtils.isEmpty(array);
    }

    /**
     * 判断数组是否为空
     *
     * @author yangwenxin
     * @Date 2019-9-19 13:57
     */
    public static boolean isEmpty(Object[] array) {
        return ArrayUtils.isEmpty(array);
    }
}
