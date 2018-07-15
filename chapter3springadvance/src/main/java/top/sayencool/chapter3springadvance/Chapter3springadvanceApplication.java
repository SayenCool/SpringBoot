package top.sayencool.chapter3springadvance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.sayencool.chapter3springadvance.taskscheduler.ScheduledTaskConfig;
import top.sayencool.chapter3springadvance.taskscheduler.ScheduledTaskService;

@SpringBootApplication
public class Chapter3springadvanceApplication {

	public static void main(String[] args) {
//		SpringApplication.run(Chapter3springadvanceApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduledTaskConfig.class);
        ScheduledTaskService taskService = context.getBean(ScheduledTaskService.class);
        taskService.fixTimeExecutor();
        taskService.reportCurrentTime();
	}
}
