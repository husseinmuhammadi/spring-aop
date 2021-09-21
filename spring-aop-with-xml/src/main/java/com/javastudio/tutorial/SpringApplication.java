package com.javastudio.tutorial;

import com.javastudio.tutorial.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    private static final Logger logger = LoggerFactory.getLogger(SpringApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        logger.info("Spring context has been loaded!");

        ProductService productService = (ProductService) context.getBean("productService");
        productService.findAll();
    }
}
