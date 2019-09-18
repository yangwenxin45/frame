package net.yangwenxin.frame.helper;

import lombok.extern.slf4j.Slf4j;
import net.yangwenxin.frame.util.PropsUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 数据库操作助手类
 *
 * @author yangwenxin
 * @Date 2019-9-18 17:25
 */
@Slf4j
public final class DatabaseHelper {

    private static final String DRIVER;
    private static final String URL;
    private static final String USERNAME;
    private static final String PASSWORD;

    static {
        Properties conf = PropsUtil.loadProps("config.properties");
        DRIVER = conf.getProperty("jdbc.driver");
        URL = conf.getProperty("jdbc.url");
        USERNAME = conf.getProperty("jdbc.username");
        PASSWORD = conf.getProperty("jdbc.password");

        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            log.error("can not load jdbc driver", e);
        }
    }

    /**
     * 获取数据库连接
     *
     * @author yangwenxin
     * @Date 2019-9-18 17:28
     */
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            log.error("get connection failure", e);
        }
        return conn;
    }

    /**
     * 关闭数据库连接
     *
     * @author yangwenxin
     * @Date 2019-9-18 17:31
     */
    public static void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                log.error("close connection failure", e);
            }
        }
    }
}
