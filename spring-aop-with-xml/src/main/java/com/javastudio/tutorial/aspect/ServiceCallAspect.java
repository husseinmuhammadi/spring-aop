package com.javastudio.tutorial.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceCallAspect {
    private Logger logger = LoggerFactory.getLogger(ServiceCallAspect.class);

    public void beforeServiceExecution() {
        logger.info("before calling service");
    }

    public void afterServiceExecution() {
        logger.info("after calling service");
    }
}
