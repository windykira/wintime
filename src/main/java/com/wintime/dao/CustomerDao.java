package com.wintime.dao;

import com.wintime.entity.Customer;

import java.util.List;

/**
 * Created by maxl on 2016/4/18.
 */
public interface CustomerDao {

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    public Customer getCustomerById(int id);

    public List<Customer> getAllCustomers();

    public Integer saveCustomer(Customer customer);
}
