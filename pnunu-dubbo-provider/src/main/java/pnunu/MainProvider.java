package pnunu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: pnunu
 * @Date: 2019/1/1 16:03
 * @Description: provider main
 */
public class MainProvider {
    public static void main(String[] args) throws Exception {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-provider.xml"});
        context.start();
        System.out.println("Provider started.");
        System.in.read(); // press any key to exit
    }
}
