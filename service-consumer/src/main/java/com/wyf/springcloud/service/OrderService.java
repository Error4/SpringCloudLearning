package com.wyf.springcloud.service;

import com.wyf.springcloud.pojo.Order;

public interface OrderService {
    Order selectOrderById(Integer id);

}
