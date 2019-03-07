package pnunu.dubbo;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @Author: pnunu
 * @Date: 2019/1/1 15:58
 * @Description: dubbo demo impl
 */
@Service
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello, " + name + "from spring boot";
    }
}
