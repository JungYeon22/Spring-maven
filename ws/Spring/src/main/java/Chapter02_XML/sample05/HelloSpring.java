package Chapter02_XML.sample05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
    public static void main(String[] args) {
        System.out.println("*******Life cycle******");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Chapter02_XML/applicationContext.xml");
        MessageBean messageBean = applicationContext.getBean("messageBeanImpl2", MessageBean.class);
        messageBean.helloCall();

    }
}
