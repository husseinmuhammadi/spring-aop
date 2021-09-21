package com.javastudio.tutorial.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Pointcut("execution(* com.javastudio.tutorial.service.*ServiceImpl+.*(..))") // point-cut expression
    public void serviceCallAspect() { // pointcut name
    }

    @Before("serviceCallAspect()")
    public void afterServiceExecution() {
        logger.info("before calling service");
    }

    @After("serviceCallAspect()")
    public void beforeServiceExecution() {
        logger.info("before calling service");
    }
}
