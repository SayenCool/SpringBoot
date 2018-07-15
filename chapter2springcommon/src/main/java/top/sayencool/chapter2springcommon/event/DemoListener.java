package top.sayencool.chapter2springcommon.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 监听DemoBean的创建
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("demoListener received msg( " + msg + " ) from demoPublisher");
    }
}
