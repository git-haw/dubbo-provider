package top.haw358.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by haw on 17-9-13.
 */
public class Provider {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"META-INF/spring/dubbo-demo-provider.xml"});
        context.start();
        System.in.read(); // press any key to exit
    }
}
