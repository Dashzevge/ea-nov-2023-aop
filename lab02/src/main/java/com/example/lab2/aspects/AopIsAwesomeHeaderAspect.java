package com.example.lab2.aspects;

import com.example.lab2.exceptions.AopIsAwesomeHeaderException;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class AopIsAwesomeHeaderAspect {

    @Before("execution(* com.example.lab2.services.*Controller.*(..)) && args(.., request)")
    public void checkAopIsAwesomeHeader(HttpServletRequest request) {
        String headerValue = request.getHeader("AOP-IS-AWESOME");

        if (headerValue == null || !headerValue.equals("true")) {
            throw new AopIsAwesomeHeaderException("AOP-IS-AWESOME header is missing or invalid.");
        }
    }
}
