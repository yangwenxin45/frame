package net.yangwenxin.frame.service;

import lombok.extern.slf4j.Slf4j;
import net.yangwenxin.frame.annotation.Service;
import net.yangwenxin.frame.annotation.Transaction;
import net.yangwenxin.frame.helper.DatabaseHelper;
import net.yangwenxin.frame.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * 提供客户数据服务
 *
 * @author yangwenxin
 * @Date 2019-9-18 15:07
 */
@Slf4j
@Service
public class CustomerService {

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
    @Transaction
    public boolean createCustomer(Map<String, Object> fieldMap) {
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    /**
     * 更新客户
     *
     * @author yangwenxin
     * @Date 2019-9-18 15:11
     */
    @Transaction
    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    /**
     * 删除客户
     *
     * @author yangwenxin
     * @Date 2019-9-18 15:11
     */
    @Transaction
    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}
