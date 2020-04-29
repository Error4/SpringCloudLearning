package com.wyf.springcloud.controller;

import com.wyf.springcloud.pojo.Product;
import com.wyf.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    /**
     * 新增商品
     *
     * @param product
     * @return
     */
    @PostMapping("/save")
    public Map<Object, Object> createProduct(Product product) {
        return productService.createProduct(product);
    }

}
