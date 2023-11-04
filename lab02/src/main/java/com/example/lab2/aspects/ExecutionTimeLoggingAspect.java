package com.example.lab2.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.lab2.repositories.ActivityLogRepository;
import com.example.lab2.entities.ActivityLog;
import com.example.lab2.annotations.ExecutionTime;

@Aspect
@Component
public class ExecutionTimeLoggingAspect {

    @Autowired
    private ActivityLogRepository activityLogRepository;

    @Before("@annotation(com.example.lab2.annotations.ExecutionTime)")
    public void logExecutionTime(JoinPoint joinPoint) {
        long startTime = System.currentTimeMillis();
        // Proceed with the method execution
        // ...
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        String methodName = joinPoint.getSignature().toShortString();
        ActivityLog activityLog = new ActivityLog();
        activityLog.setOperation(methodName);
        activityLog.setDuration(duration);
        activityLogRepository.save(activityLog);
    }
}