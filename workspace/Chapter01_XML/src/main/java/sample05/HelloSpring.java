package sample05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		SungJuk sungJuk;
		sungJuk = applicationContext.getBean("sungJukImpl", SungJuk.class);
		sungJuk.calc();
		sungJuk.display();

	}

}
