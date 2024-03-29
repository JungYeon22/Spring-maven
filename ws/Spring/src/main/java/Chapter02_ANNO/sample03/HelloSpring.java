package Chapter02_ANNO.sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Chapter02_ANNO/applicationContext.xml");
		SungJuk sungJuk = applicationContext.getBean("sungJukImpl", SungJuk.class);
		sungJuk.calcTot();
		sungJuk.calcAvg();
		sungJuk.display();
		System.out.println();
		
		sungJuk.modify();
		sungJuk.calcTot();
		sungJuk.calcAvg();
		sungJuk.display();
		

	}

}
