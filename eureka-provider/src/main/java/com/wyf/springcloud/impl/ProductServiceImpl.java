package com.wyf.springcloud.impl;

import com.wyf.springcloud.pojo.Product;
import com.wyf.springcloud.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> selectProductList() {
        return Arrays.asList(
                new Product(1, "华为手机", 2, 5888D),
                new Product(2, "联想笔记本", 1, 6888D)
        );
    }
    /**
     * 根据主键查询商品
     *
     * @param id
     * @return
     */
    @Override
    public Product selectProductById(Integer id) {
        return new Product(id, "冰箱", 1, 1000D);
    }
    /**
     * 新增商品
     * @param product
     * @return
     */
    @Override
    public Map<Object, Object> createProduct(Product product) {
        System.out.println(product);
        return new HashMap<Object, Object>() {{
            put("code", 200);
            put("message", "新增成功");
        }};
    }

}
