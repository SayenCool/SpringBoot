package top.sayencool.chapter3springadvance;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.sayencool.chapter3springadvance.aware.AwareConfig;
import top.sayencool.chapter3springadvance.aware.AwareService;

public class AwareTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = context.getBean(AwareService.class);
        awareService.printResult();

        context.close();
    }
}
