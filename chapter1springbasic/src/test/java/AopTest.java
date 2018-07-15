import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.sayencool.aopdemo.config.AopConfig;
import top.sayencool.aopdemo.service.DemeAnnotationService;
import top.sayencool.aopdemo.service.DemoMethodService;

public class AopTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemeAnnotationService annotationService = context.getBean(DemeAnnotationService.class);
        DemoMethodService contextService = context.getBean(DemoMethodService.class);
        annotationService.add();
        System.out.println("-------------------");
        contextService.add();
    }
}
