package top.sayencool.chapter2springcommon.init_destroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * jsr250注解方式配置bean的初始化和销毁
 */
public class JSR250WayService {

    @PostConstruct
    public void init() {
        System.out.println("jsr250-init");
    }

    public JSR250WayService() {
        System.out.println("JSR250WayService-constructor");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("jsr250-destroy");
    }
}
