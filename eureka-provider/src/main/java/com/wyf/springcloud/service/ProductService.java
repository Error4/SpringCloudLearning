package com.wyf.springcloud.service;

import com.wyf.springcloud.pojo.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {
    /**
     * 查询商品列表
     *
     * @return
     */
    List<Product> selectProductList();
    /**
     * 根据主键查询商品
     *
     * @param id
     * @return
     */
    Product selectProductById(Integer id);
    /**
     * 新增商品
     *
     * @param product
     * @return
     */
    Map<Object, Object> createProduct(Product product);

}
