package ch6aspects2.aspects;

import ch6aspects2.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(1)
public class SecurityAspect {

    private Logger logger = Logger.getLogger(SecurityAspect.class.getName());

    @Around("@annotation(ToValidate)")
    public Object validate(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        Comment comment = (Comment) args[0];
        if (comment.getAuthor().equalsIgnoreCase("Giz")) {
            logger.info("Successfully validated as Giz!");
            Object result = joinPoint.proceed();
            return result;
        } else {
            logger.warning("User is not Giz!! It's : " + comment.getAuthor());
            return "Failed!";
        }
    }

}
