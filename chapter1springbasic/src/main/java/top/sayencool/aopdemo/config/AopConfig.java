package top.sayencool.aopdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("top.sayencool.aopdemo")
@EnableAspectJAutoProxy
public class AopConfig {
}
