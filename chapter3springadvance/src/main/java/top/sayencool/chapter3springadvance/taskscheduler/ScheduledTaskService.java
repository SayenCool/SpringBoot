package top.sayencool.chapter3springadvance.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 有些子表达式能包含一些范围或列表
 * 例如：子表达式（天（星期））可以为 “MON-FRI”，“MON，WED，FRI”，“MON-WED,SAT”
 * “*”字符代表所有可能的值
 * 因此，“*”在子表达式（月）里表示每个月的含义，“*”在子表达式（天（星期））表示星期的每一天
 * “/”字符用来指定数值的增量
 * 例如：在子表达式（分钟）里的“0/15”表示从第0分钟开始，每15分钟
 * 在子表达式（分钟）里的“3/20”表示从第3分钟开始，每20分钟（它和“3，23，43”）的含义一样
 * “？”字符仅被用于天（月）和天（星期）两个子表达式，表示不指定值
 * 2个子表达式其中之一被指定了值以后，为了避免冲突，需要将另一个子表达式的值设为“？”
 * L” 字符仅被用于天（月）和天（星期）两个子表达式，它是单词“last”的缩写
 * 但是它在两个子表达式里的含义是不同的。
 * 在天（月）子表达式中，“L”表示一个月的最后一天
 * 在天（星期）自表达式中，“L”表示一个星期的最后一天，也就是SAT
 * 如果在“L”前有具体的内容，它就具有其他的含义了
 * 例如：“6L”表示这个月的倒数第６天，“ＦＲＩＬ”表示这个月的最一个星期五
 * 注意：在使用“L”参数时，不要指定列表或范围，因为这会导致问题
 * <p>
 * |字段  | 允许值  | 允许的特殊字符
 * |秒	 |	0-59	| 	, - * /
 * |分	 |	0-59	| 	, - * /
 * |小时 |	 0-23	| 	, - * /
 * |日期 |	 1-31	| 	, - * ? / L W C
 * |月份 |	 1-12 或者 JAN-DEC	| 	, - * /
 * |星期 |	 1-7 或者 SUN-SAT	| 	, - * ? / L C #
 * |年（可选）	| 	留空, 1970-2099	 |	, - * /
 * <p>
 * <p>
 * 结果：
 * 每隔5秒执行一次：16:14:41
 * 每隔5秒执行一次：16:14:46
 * 每隔5秒执行一次：16:14:51
 * 每隔5秒执行一次：16:14:56
 * 在指定时间 16:15:00执行
 * 每隔5秒执行一次：16:15:01
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每隔5秒执行一次：" + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 15 16 ? * *")
    public void fixTimeExecutor() {
        System.out.println("在指定时间 " + dateFormat.format(new Date()) + "执行");
    }
}