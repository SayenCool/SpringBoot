package top.sayencool.chapter2springcommon;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.sayencool.chapter2springcommon.el.ElConfig;

public class ElTest {

    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig elConfig = context.getBean(ElConfig.class);
        elConfig.printFields();
        context.close();
    }
}
