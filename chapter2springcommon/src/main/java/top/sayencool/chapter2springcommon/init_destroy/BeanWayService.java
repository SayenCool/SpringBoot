package top.sayencool.chapter2springcommon.init_destroy;

/**
 * java配置方式：注解参数配置初始化和销毁
 */
public class BeanWayService {

    public void init(){
        System.out.println("@Bean-init");
    }

    public BeanWayService(){
        System.out.println("BeanWayService-constructor");
    }

    public void destroy(){
        System.out.println("@Bean-destroy");
    }
}
