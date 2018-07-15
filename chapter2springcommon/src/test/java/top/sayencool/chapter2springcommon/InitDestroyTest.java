package top.sayencool.chapter2springcommon;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.sayencool.chapter2springcommon.init_destroy.BeanWayService;
import top.sayencool.chapter2springcommon.init_destroy.JSR250WayService;
import top.sayencool.chapter2springcommon.init_destroy.PrePostConfig;

public class InitDestroyTest {

    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        context.getBean(BeanWayService.class);
        context.getBean(JSR250WayService.class);
        // spring 执行销毁方法
        context.close();
    }
}
