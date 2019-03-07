package pnunu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: pnunu
 * @Date: 2019/1/1 16:03
 * @Description: provider main
 */
//public class MainProvider {
//    public static void main(String[] args) throws Exception {
//        System.setProperty("java.net.preferIPv4Stack", "true");
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-provider.xml"});
//        context.start();
//        System.out.println("Provider started.");
//        System.in.read(); // press any key to exit
//    }
@SpringBootApplication
public class MainProvider {
    public static void main(String[] args) {
        SpringApplication.run(MainProvider.class, args);
    }
}

