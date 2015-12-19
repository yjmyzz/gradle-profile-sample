package profile.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.SpringVersion;

/**
 * Created by yangjunming on 12/19/15.
 * author: yangjunming@huijiame.com
 */
public class ProfileMain {

    public static void main(String[] args) {
        System.out.println("jdk version:\t" + System.getProperty("java.version"));// jdk version
        System.out.println("spring version:\t" + SpringVersion.getVersion()); //spring version


        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");

        System.out.println(ctx.getBean(DemoObject.class));
    }
}
