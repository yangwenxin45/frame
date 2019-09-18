package net.yangwenxin.frame.service;

import lombok.extern.slf4j.Slf4j;
import net.yangwenxin.frame.model.Customer;
import net.yangwenxin.frame.util.PropsUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * 提供客户数据服务
 *
 * @author yangwenxin
 * @Date 2019-9-18 15:07
 */
@Slf4j
public class CustomerService {

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
     * 获取客户列表
     *
     * @author yangwenxin
     * @Date 2019-9-18 15:08
     */
    public List<Customer> getCustomerList() {
        Connection conn = null;
        List<Customer> customerList = new ArrayList<>();
        try {
            String sql = "select * from customer";
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getLong("id"));
                customer.setName(rs.getString("name"));
                customer.setContact(rs.getString("contact"));
                customer.setTelephone(rs.getString("telephone"));
                customer.setEmail(rs.getString("email"));
                customer.setRemark(rs.getString("remark"));
                customerList.add(customer);
            }
        } catch (SQLException e) {
            log.error("execute sql failure", e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    log.error("close connection failure", e);
                }
            }
        }
        return customerList;
    }

    /**
     * 获取客户
     *
     * @author yangwenxin
     * @Date 2019-9-18 15:09
     */
    public Customer getCustomer(long id) {
        // TODO: 2019-9-18
        return null;
    }

    /**
     * 创建客户
     *
     * @author yangwenxin
     * @Date 2019-9-18 15:10
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        // TODO: 2019-9-18
        return false;
    }

    /**
     * 更新客户
     *
     * @author yangwenxin
     * @Date 2019-9-18 15:11
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        // TODO: 2019-9-18
        return false;
    }

    /**
     * 删除客户
     *
     * @author yangwenxin
     * @Date 2019-9-18 15:11
     */
    public boolean deleteCustomer(long id) {
        // TODO: 2019-9-18
        return false;
    }
}
