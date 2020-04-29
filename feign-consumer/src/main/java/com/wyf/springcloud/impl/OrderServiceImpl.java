package com.wyf.springcloud.impl;

import com.wyf.springcloud.pojo.Order;
import com.wyf.springcloud.service.OrderService;
import com.wyf.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private ProductService productService;

    /**
     * 根据主键查询订单
     *
     * @param id
     * @return
     */
    @Override
    public Order selectOrderById(Integer id) {
        return new Order(id, "001", "中国",
                productService.selectProductList());
//        return new Order(id, "001", "中国",
//                Arrays.asList(productService.selectProductById(1)));
    }
}
