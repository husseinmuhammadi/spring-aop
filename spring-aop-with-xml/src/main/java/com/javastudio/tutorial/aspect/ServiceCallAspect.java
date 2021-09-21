package com.javastudio.tutorial.aspect;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceCallAspect {
    private Logger logger = LoggerFactory.getLogger(ServiceCallAspect.class);

    public void beforeServiceExecution(JoinPoint joinPoint) {
        logger.info("before calling service: {}.{}",
                joinPoint.getTarget().getClass().getSimpleName(),
                joinPoint.getSignature().getName());
    }

    public void afterServiceExecution(JoinPoint joinPoint) {
        logger.info("after calling service: {}", joinPoint.getSignature().getName());
    }
}
