package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
//		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml"); // 이것도 가능
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		MessageBean messageBean = (MessageBean) applicationContext.getBean("messageBean");	// 부모 = 자식
		messageBean.sayHello("Spring");
		System.out.println();
		
		MessageBean messageBean2 = (MessageBean) applicationContext.getBean("messageBean");	// 부모 = 자식
		messageBean2.sayHello("Spring");
		System.out.println();
		
		MessageBean messageBean3 = (MessageBean) applicationContext.getBean("messageBean");	// 부모 = 자식
		messageBean3.sayHello("Spring");
		System.out.println();
		
	}

}
