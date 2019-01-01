package pnunu.dubbo;

/**
 * @Author: pnunu
 * @Date: 2019/1/1 15:58
 * @Description: dubbo demo impl
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
