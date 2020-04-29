package com.wyf.springcloud.service;

import com.wyf.springcloud.pojo.Product;

import java.util.List;

public interface ProductService {
    /**
     * 查询商品列表
     *
     * @return
     */
    List<Product> selectProductList();
}
