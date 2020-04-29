package com.wyf.springcloud.impl;

import com.wyf.springcloud.pojo.Product;
import com.wyf.springcloud.service.ProductService;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceHystrix implements ProductService {

    @Override
    public Product selectProductById(Integer id) {
        return new Product(id, "不存在", 1, 0D);
    }
}
