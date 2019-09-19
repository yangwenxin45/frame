package net.yangwenxin.frame.helper;

import net.yangwenxin.frame.ConfigConstant;
import net.yangwenxin.frame.util.PropsUtil;

import java.util.Properties;

/**
 * 属性文件助手类
 *
 * @author yangwenxin
 * @Date 2019-9-19 10:57
 */
public final class ConfigHelper {

    private static final Properties CONFIG_PROPS = PropsUtil.loadProps(ConfigConstant.CONFIG_FILE);

    /**
     * 获取JDBC驱动
     *
     * @author yangwenxin
     * @Date 2019-9-19 10:59
     */
    public static String getJdbcDriver() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.JDBC_DRIVER);
    }

    /**
     * 获取 JDBC URL
     *
     * @author yangwenxin
     * @Date 2019-9-19 11:00
     */
    public static String getJdbcUrl() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.JDBC_URL);
    }

    /**
     * 获取 JDBC 用户名
     *
     * @author yangwenxin
     * @Date 2019-9-19 11:01
     */
    public static String getJdbcUsername() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.JDBC_USERNAME);
    }

    /**
     * 获取 JDBC 密码
     *
     * @author yangwenxin
     * @Date 2019-9-19 11:02
     */
    public static String getJdbcPassword() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.JDBC_PASSWORD);
    }

    /**
     * 获取应用基础包名
     *
     * @author yangwenxin
     * @Date 2019-9-19 11:03
     */
    public static String getAppBasePackage() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.APP_BASE_PACKAGE);
    }

    /**
     * 获取应用 JSP 路径
     *
     * @author yangwenxin
     * @Date 2019-9-19 11:05
     */
    public static String getAppJspPath() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.APP_JSP_PATH, "/WEB-INF/view/");
    }

    /**
     * 获取应用静态资源路径
     *
     * @author yangwenxin
     * @Date 2019-9-19 11:06
     */
    public static String getAppAssertPath() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.APP_ASSERT_PATH, "/asset/");
    }
}
