package com.wyf.springcloud.service;

import com.wyf.springcloud.impl.ProductServiceHystrix;
import com.wyf.springcloud.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "eureka-provider",fallback = ProductServiceHystrix.class)
public interface ProductService {
    /**
     * 根据主键查询商品
     *
     * @param id
     * @return
     */
    @GetMapping("/product/{id}")
    Product selectProductById(@PathVariable("id") Integer id);
}
