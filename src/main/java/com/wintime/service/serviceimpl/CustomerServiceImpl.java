package com.wintime.service.serviceimpl;

import com.wintime.dao.CustomerDao;
import com.wintime.entity.Customer;
import com.wintime.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/4/24 0024.
 */
@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerDao customerDao;

    public Customer getCustomerById(Long customerID) {
        return this.customerDao.getCustomerById(customerID);
    }

    public Long saveCustomer(Customer customer)
    {
        return this.customerDao.saveCustomer(customer);
    }


}
