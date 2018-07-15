package top.sayencool.chapter3springadvance;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.sayencool.chapter3springadvance.taskscheduler.ScheduledTaskConfig;
import top.sayencool.chapter3springadvance.taskscheduler.ScheduledTaskService;

public class ScheduledTaskTest {

    /**
     * 只运行一次，不能用test？
     */
    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduledTaskConfig.class);
        ScheduledTaskService taskService = context.getBean(ScheduledTaskService.class);
        taskService.fixTimeExecutor();
        taskService.reportCurrentTime();
    }
}
