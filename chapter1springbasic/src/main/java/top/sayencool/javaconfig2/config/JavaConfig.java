package top.sayencool.javaconfig2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.sayencool.javaconfig2.function.FunctionService;
import top.sayencool.javaconfig2.service.UseFunctionService;

@Configuration
public class JavaConfig {
    @Bean
    public FunctionService functionService() {
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService() {
        // 相当于依赖注入
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());

        return useFunctionService;
    }

    @Bean
    public UseFunctionService useFunctionService(FunctionService functionService) {
        // 另一种方式。传参
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService);
        return useFunctionService;
    }
}
