package net.yangwenxin.frame.util;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;

import java.util.Collection;
import java.util.Map;

/**
 * 集合工具类
 *
 * @author yangwenxin
 * @Date 2019-9-18 17:05
 */
public class CollectionUtil {

    /**
     * 判断Collection是否为空
     *
     * @author yangwenxin
     * @Date 2019-9-18 17:06
     */
    public static boolean isEmpty(Collection<?> collection) {
        return CollectionUtils.isEmpty(collection);
    }

    /**
     * 判断Collection是否非空
     *
     * @author yangwenxin
     * @Date 2019-9-18 17:06
     */
    public static boolean isNotEmpty(Collection<?> collection) {
        return !isEmpty(collection);
    }

    /**
     * 判断Map是否为空
     *
     * @author yangwenxin
     * @Date 2019-9-18 17:08
     */
    public static Boolean isEmpty(Map<?, ?> map) {
        return MapUtils.isEmpty(map);
    }

    /**
     * 判断Map是否非空
     *
     * @author yangwenxin
     * @Date 2019-9-18 17:08
     */
    public static boolean isNotEmpty(Map<?, ?> map) {
        return !isEmpty(map);
    }
}
