package org.start.chapter1.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.start.chapter1.model.Customer;
import org.start.chapter1.service.CustomerService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by XHJ on 2018/1/29.
 */
public class CustomerServiceTest {
    private CustomerService customerService;

    public CustomerServiceTest() {
        customerService = new CustomerService();
    }
    @Before
    public void init(){
        //todo 初始化数据库
    }
    @Test
    public void getCustomerListTest() throws Exception {
        List<Customer> customersList = customerService.getCustomerList();
        Assert.assertEquals(2,customersList.size());
        for (Customer customer:customersList) {
            System.out.println(customer.toString());
        }
    }
    @Test
    public void getCustomerTest() throws Exception {
        long id = 1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    @Test
    public void createCustomerTest() throws Exception{
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("name", "customer100");
        fieldMap.put("contact","Jojn");
        fieldMap.put("telephone", "13512345678");
        boolean result = customerService.createCustomer(fieldMap);
        Assert.assertTrue(result);
    }
    @Test
    public void updateCustomerTest() throws Exception {
        long id = 1;
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("contact", "Eric");
        boolean result = customerService.updataCustomer(id, fieldMap);
        Assert.assertTrue(result);
    }
    @Test
    public void deleteCustomerTest() throws Exception {
        long id =1 ;
        boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }



}
