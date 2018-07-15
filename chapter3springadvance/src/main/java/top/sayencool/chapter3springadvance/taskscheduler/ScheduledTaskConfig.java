package top.sayencool.chapter3springadvance.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("top.sayencool.chapter3springadvance.taskscheduler")
@EnableScheduling
public class ScheduledTaskConfig {
}
