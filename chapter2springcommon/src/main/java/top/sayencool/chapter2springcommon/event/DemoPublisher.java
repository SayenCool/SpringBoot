package top.sayencool.chapter2springcommon.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext applicationContext;

    public void publish(String msg) {
        // source = this
        applicationContext.publishEvent(new DemoEvent(this, msg));
    }
}
