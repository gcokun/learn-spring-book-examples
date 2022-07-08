package ch6aspects1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* ch6aspects1.services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        String methodName = joinPoint.getSignature().getName();
        logger.info("Will execute method : " + methodName + " with args : " + Arrays.asList(args));
        Object returnedByMethod = joinPoint.proceed();
        logger.info("Execution returns : " + returnedByMethod.toString());
        return returnedByMethod;
    }
}
