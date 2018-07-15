package top.sayencool.chapter2springcommon.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;


public class DemoPublisher2 implements ApplicationEventPublisherAware {

    private String msg;

    public DemoPublisher2() {
    }

    public DemoPublisher2(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        applicationEventPublisher.publishEvent(new DemoEvent(this, msg));
    }
}
