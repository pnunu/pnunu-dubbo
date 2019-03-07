package pnunu.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pnunu.dubbo.DemoService;

/**
 * @Author: pnunu
 * @Date: 2019/3/7 19:12
 * @Description:
 */
@RestController
public class DemoConsumerController {
    @Reference
    private DemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return demoService.sayHello(name);
    }
}
