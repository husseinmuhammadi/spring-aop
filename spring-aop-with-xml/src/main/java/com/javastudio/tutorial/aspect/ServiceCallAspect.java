package com.javastudio.tutorial.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceCallAspect {
    private Logger logger = LoggerFactory.getLogger(ServiceCallAspect.class);

    public void beforeProductService() {
        logger.info("before call product service");
    }

    public void afterProductService() {
        logger.info("after call product service");
    }

    public void beforeServiceExecution() {
        logger.info("before calling service");
    }

    public void afterServiceExecution() {
        logger.info("after calling service");
    }
}
