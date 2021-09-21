package com.javastudio.tutorial;

import com.javastudio.tutorial.api.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBasedSpringApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(AnnotationBasedSpringApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        LOGGER.info("Spring context started!");

        ProductService productService = context.getBean(ProductService.class);
        productService.findAll();
    }
}
