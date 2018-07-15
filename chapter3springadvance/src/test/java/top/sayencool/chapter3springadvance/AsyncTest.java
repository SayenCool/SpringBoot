package top.sayencool.chapter3springadvance;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.sayencool.chapter3springadvance.taskexecutor.AsyncTaskService;
import top.sayencool.chapter3springadvance.taskexecutor.TaskExecutorConfig;

public class AsyncTest {

    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10; i++) {
            // 结果显示，此处调用两个方法不是顺序的
            // 调用方法之后，也不一定按照0 1 2...显示
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyneTaskPlus(i);
        }
        context.close();
    }
}
