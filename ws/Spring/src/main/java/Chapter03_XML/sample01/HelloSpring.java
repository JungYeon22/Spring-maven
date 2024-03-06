package Chapter03_XML.sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Chapter03_XML/acQuickStart.xml");
		MessageBean messageBean = applicationContext.getBean("messageBeanImpl", MessageBean.class);

		//Before
		System.out.println("====== Before ======");
		System.out.println();
		messageBean.showPrintBefore();
		System.out.println();
		messageBean.viewPrintBefore();
		System.out.println();
		messageBean.display();

		System.out.println();
		//After
		System.out.println("====== After ======");
		System.out.println();
		messageBean.showPrintAfter();
		System.out.println();
		messageBean.viewPrintAfter();
		System.out.println();
		messageBean.display();

	}

}
