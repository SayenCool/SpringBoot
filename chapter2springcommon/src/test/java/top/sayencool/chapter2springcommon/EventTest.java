package top.sayencool.chapter2springcommon;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.sayencool.chapter2springcommon.event.DemoPublisher;
import top.sayencool.chapter2springcommon.event.DemoPublisher2;
import top.sayencool.chapter2springcommon.event.EventConfig;

public class EventTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("Hello application event!");
        context.close();
    }

    /*@Test
    public void test2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher2 publisher2 = context.getBean(DemoPublisher2.class);
        publisher2.setMsg("demo2: Hello application event!");
        publisher2.setApplicationEventPublisher();
        context.close();
    }*/
}
