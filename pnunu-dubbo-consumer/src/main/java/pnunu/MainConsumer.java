package pnunu;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pnunu.dubbo.DemoService;

/**
 * @Author: pnunu
 * @Description:
 * @Date: 2019/1/1 16:55
 */
public class MainConsumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("pnunu"); // 执行远程方法
        System.out.println(hello); // 显示调用结果
    }
}
