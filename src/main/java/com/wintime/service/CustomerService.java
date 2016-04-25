package com.wintime.service;

import com.wintime.entity.Customer;

/**
 * Created by Administrator on 2016/4/24 0024.
 */
public interface CustomerService {

    Customer getCustomerById(Long customerID);

    Long saveCustomer(Customer customer);
}
