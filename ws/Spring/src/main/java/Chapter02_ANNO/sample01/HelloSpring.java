package Chapter02_ANNO.sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Chapter02_ANNO/applicationContext.xml");
		MessageBean messageBean = applicationContext.getBean("messageBeanImpl", MessageBean.class);
		
		messageBean.sayHello();
		messageBean.sayHello("딸기", 10000);
		messageBean.sayHello("망고", 7000, 2);

	}

}
