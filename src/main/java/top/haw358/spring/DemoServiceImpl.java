package top.haw358.spring;

import top.haw358.service.DemoService;

/**
 * Created by haw on 17-9-13.
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String s) {
        return "Hello "+ s;
    }
}
