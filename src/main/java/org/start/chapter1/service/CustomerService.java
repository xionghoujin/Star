package org.start.chapter1.service;

import org.start.chapter1.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * Created by XHJ on 2018/1/28.
 */
public class CustomerService {
    /**
     * 获取用户列表
     * @param keyword
     * @return
     */
    public List<Customer> getCustomerList(String keyword) {
        //todo
        return null;
    }

    /**
     * 获取用户
     * @param id
     * @return
     */
    public Customer getCustomer(long id) {
        //todo
        return null;
    }

    /**
     * 创建用户
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        //todo
        return false;
    }

    /**
     * 更新用户
     * @param id
     * @param fieldMap
     * @return
     */
    public boolean updataCustomer(long id, Map<String, Object> fieldMap) {
        return false;
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id) {
        //todo
        return false;
    }
}
