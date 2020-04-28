package com.wyf.springcloud.impl;

import com.wyf.springcloud.pojo.Product;
import com.wyf.springcloud.service.ProductService;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> selectProductList() {
        return Arrays.asList(
                new Product(1, "华为手机", 2, 5888D),
                new Product(2, "联想笔记本", 1, 6888D)
        );
    }

}
