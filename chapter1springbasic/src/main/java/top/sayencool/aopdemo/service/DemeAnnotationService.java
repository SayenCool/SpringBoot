package top.sayencool.aopdemo.service;

import org.springframework.stereotype.Service;
import top.sayencool.aopdemo.annotation.Action;

@Service
public class DemeAnnotationService {
    @Action(name = "注解式拦截 add()")
    public void add() {
        System.out.println("DemeAnnotationService add");
    }
}
