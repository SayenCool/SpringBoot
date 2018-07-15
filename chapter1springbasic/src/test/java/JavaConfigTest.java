import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.sayencool.javaconfig1.config.JavaConfig;
import top.sayencool.javaconfig1.service.UseFunctionService;

public class JavaConfigTest {
    @Test
    public void config1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        // 两种方式皆可

        // 方式1：要求必须起名@Service("useFunctionService")
//        UseFunctionService useFunctionService = (UseFunctionService) context.getBean("useFunctionService");

        // 方式2：直接根据类找
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.sayHello("JavaConfig 1"));
    }

    @Test
    public void config2(){
        // JavaConfig根据返回值类型也可以找到
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(top.sayencool.javaconfig2.config.JavaConfig.class);
        top.sayencool.javaconfig2.service.UseFunctionService useFunctionService = context.getBean(top.sayencool.javaconfig2.service.UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("JavaConfig 2"));
    }
}
