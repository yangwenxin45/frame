package net.yangwenxin.frame.util;

/**
 * 转型操作工具类
 *
 * @author yangwenxin
 * @Date 2019-9-18 16:21
 */
public final class CastUtil {

    /**
     * 转为String型
     *
     * @author yangwenxin
     * @Date 2019-9-18 16:23
     */
    public static String castString(Object obj) {
        return CastUtil.castString(obj, "");
    }

    /**
     * 转为String型（提供默认值）
     *
     * @author yangwenxin
     * @Date 2019-9-18 16:24
     */
    public static String castString(Object obj, String defaultValue) {
        return obj != null ? String.valueOf(obj) : defaultValue;
    }

    /**
     * 转为double型
     *
     * @author yangwenxin
     * @Date 2019-9-18 16:31
     */
    public static double castDouble(Object obj) {
        return CastUtil.castDouble(obj, 0);
    }

    /**
     * 转为double型（提供默认值）
     *
     * @author yangwenxin
     * @Date 2019-9-18 16:32
     */
    public static double castDouble(Object obj, double defaultValue) {
        double doubleValue = defaultValue;
        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    doubleValue = Double.parseDouble(strValue);
                } catch (NumberFormatException e) {
                    doubleValue = defaultValue;
                }
            }
        }
        return doubleValue;
    }

    /**
     * 转为long型
     *
     * @author yangwenxin
     * @Date 2019-9-18 16:35
     */
    public static long castLong(Object obj) {
        return CastUtil.castLong(obj, 0);
    }

    /**
     * 转为long型（提供默认值）
     *
     * @author yangwenxin
     * @Date 2019-9-18 16:35
     */
    private static long castLong(Object obj, long defaultValue) {
        long longValue = defaultValue;
        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    longValue = Long.parseLong(strValue);
                } catch (NumberFormatException e) {
                    longValue = defaultValue;
                }
            }
        }
        return longValue;
    }

    /**
     * 转为int型
     *
     * @author yangwenxin
     * @Date 2019-9-18 16:38
     */
    public static int castInt(Object obj) {
        return CastUtil.castInt(obj, 0);
    }

    /**
     * 转为int型（提供默认值）
     *
     * @author yangwenxin
     * @Date 2019-9-18 16:38
     */
    public static int castInt(Object obj, int defaultValue) {
        int intValue = defaultValue;
        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    intValue = Integer.parseInt(strValue);
                } catch (NumberFormatException e) {
                    intValue = defaultValue;
                }
            }
        }
        return intValue;
    }

    /**
     * 转为boolean型
     *
     * @author yangwenxin
     * @Date 2019-9-18 16:45
     */
    public static boolean castBoolean(Object obj) {
        return CastUtil.castBoolean(obj, false);
    }

    /**
     * 转为boolean型（提供默认值）
     *
     * @author yangwenxin
     * @Date 2019-9-18 16:46
     */
    public static boolean castBoolean(Object obj, boolean defaultValue) {
        boolean booleanValue = defaultValue;
        if (obj != null) {
            booleanValue = Boolean.parseBoolean(castString(obj));
        }
        return booleanValue;
    }
}
