package net.yangwenxin.frame.service;

import lombok.extern.slf4j.Slf4j;
import net.yangwenxin.frame.helper.DatabaseHelper;
import net.yangwenxin.frame.model.Customer;
import net.yangwenxin.frame.util.PropsUtil;

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
        String sql = "select * from customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

    /**
     * 获取客户
     *
     * @author yangwenxin
     * @Date 2019-9-18 15:09
     */
    public Customer getCustomer(long id) {
        String sql = "select * from customer where id = ?";
        return DatabaseHelper.queryEntity(Customer.class, sql, id);
    }

    /**
     * 创建客户
     *
     * @author yangwenxin
     * @Date 2019-9-18 15:10
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    /**
     * 更新客户
     *
     * @author yangwenxin
     * @Date 2019-9-18 15:11
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    /**
     * 删除客户
     *
     * @author yangwenxin
     * @Date 2019-9-18 15:11
     */
    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}
