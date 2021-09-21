package com.javastudio.tutorial;

import com.javastudio.tutorial.bean.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Product product = (Product) context.getBean("product");
        LOGGER.info("product: {}", product.getName());
    }
}
