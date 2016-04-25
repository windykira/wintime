package com.wintime.controller;

import com.wintime.entity.Customer;
import com.wintime.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by maxl on 2016/4/15.
 */
@Controller
@RequestMapping("/Customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping("/ShowCustomer")
    public ModelAndView getCustomerByID(HttpServletRequest request)
    {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("customer");
        return mav;
    }

    @RequestMapping("/SaveCustomer")
    public ModelAndView saveCustomer(HttpServletRequest request)
    {
        ModelAndView mav = new ModelAndView();
        Customer customer = new Customer();
        customer.setName("Jack");
        customer.setPhone("135555");
        customer.setAddress("常州武进");
        this.customerService.getCustomerById(1L);
        mav.setViewName("customer");
        return mav;
    }
}
