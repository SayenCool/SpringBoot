package top.sayencool.chapter2springcommon;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.sayencool.chapter2springcommon.profile.DemoBean;
import top.sayencool.chapter2springcommon.profile.ProfileConfig;

public class ProfileTest {

    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.getEnvironment().setActiveProfiles("dev");
        context.getEnvironment().setActiveProfiles("prod");
        // 后置注册Bean配置类
        context.register(ProfileConfig.class);
        // 一定要刷新容器，否则报错
        // java.lang.IllegalStateException: org.springframework.context.annotation.AnnotationConfigApplicationContext@299a06ac has not been refreshed yet
        context.refresh();

        DemoBean bean = context.getBean(DemoBean.class);
        System.out.println(bean.getContent());
        context.close();
    }
}
