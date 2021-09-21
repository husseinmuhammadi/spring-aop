package com.javastudio.tutorial.service;

import com.javastudio.tutorial.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;

public class ProductService {
    private Logger logger = LoggerFactory.getLogger(ProductService.class);

    public List<Product> findAll() {
        logger.info("productService->findAll");
        return Collections.emptyList();
    }
}
