package top.sayencool.aopdemo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import top.sayencool.aopdemo.annotation.Action;

import java.lang.reflect.Method;

@Aspect
@Component
public class LogAspect {

    // 常规做法：executiion方法规则式拦截
    //    @Pointcut("execution(* top.sayencool.aopdemo.service.DemeAnnotationService(..))")
    @Pointcut("@annotation(top.sayencool.aopdemo.annotation.Action)")
    public void annotationPointCut() {
    }

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action annotation = method.getAnnotation(Action.class);
        System.out.println("注解式：" + annotation.name());
    }

    @Before("execution(* top.sayencool.aopdemo.service.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截：" + method.getName());
    }
}
