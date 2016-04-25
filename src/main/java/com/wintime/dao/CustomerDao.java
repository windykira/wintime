package com.wintime.dao;

import com.wintime.entity.Customer;

import java.util.List;

/**
 * Created by maxl on 2016/4/18.
 */
public interface CustomerDao {

    /**
     * 根据ID查询
     * @param customerID
     * @return
     */
     Customer getCustomerById(Long customerID);

     List<Customer> getAllCustomers();

     Long saveCustomer(Customer customer);
}
