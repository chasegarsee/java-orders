package com.chasegarsee.orders.controller;

import com.chasegarsee.orders.model.Customer;
import com.chasegarsee.orders.repos.AgentRepository;
import com.chasegarsee.orders.repos.CustomerRepository;
import com.chasegarsee.orders.repos.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = {}, produces = MediaType.APPLICATION_JSON_VALUE)
public class CustomerController
{

    @Autowired
    CustomerRepository custrepos;

    @Autowired
    AgentRepository agentrepos;

    @Autowired
    OrderRepository orderrepos;

    @GetMapping("/city/{city}")
    public List<Customer> findByCity(@PathVariable String city)
    {
        return custrepos.findByCity(city);
    }


    @GetMapping("/customer/order")
    public List<Object[]> findAllOrder()
    {
        return custrepos.findAllOrder();
    }

    @GetMapping("/name/{custname}")
    public  List<Object[]> findOrderForCustomer(@PathVariable String custname) {
        return custrepos.findAllOrderForCustomer(custname.toLowerCase());
    }

    @GetMapping("/order/{custcode}")
    public  List<Object[]> findOrderbYCustomerId(@PathVariable Long custcode) {
        return custrepos.findAllOrderByCustomerId(custcode);
    }

}
