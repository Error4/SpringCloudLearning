package com.wyf.springcloud.controller;

import com.wyf.springcloud.pojo.Product;
import com.wyf.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    /**
     * 查询商品列表
     * @return
     */
    @GetMapping("/list")
    public List<Product> selectProductList() {
        return productService.selectProductList();
    }
    /**
     * 根据主键查询商品
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Product selectProductById(@PathVariable("id") Integer id) {
        return productService.selectProductById(id);
    }

    /**
     * 新增商品
     *
     * @param product
     * @return
     */
    @PostMapping("/save")
    public Map<Object, Object> createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

}
