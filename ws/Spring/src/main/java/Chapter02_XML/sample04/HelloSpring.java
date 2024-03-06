package Chapter02_XML.sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class HelloSpring {
    public static void main(String[] args) {
        //HelloSpring helloSpring = new HelloSpring();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Chapter02_XML/applicationContext.xml");
        HelloSpring helloSpring = applicationContext.getBean("helloSpring", HelloSpring.class);
        helloSpring.menu(applicationContext);
        System.out.println("프로그램을 종료합니다.");
    }

    private void menu(ApplicationContext applicationContext) {
        SungJuk sungJuk = null;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("*****************");
            System.out.println("1. 입력");
            System.out.println("2. 출력");
            System.out.println("3. 수정");
            System.out.println("4. 삭제");
            System.out.println("5. 끝");
            System.out.println("*****************");
            System.out.print("번호 : ");
            int num = scanner.nextInt();
            if(num == 5) break;
            switch(num){
                case 1: sungJuk = applicationContext.getBean("sungJukInput", SungJuk.class);
                    break;
                case 2: sungJuk = applicationContext.getBean("sungJukOutput", SungJuk.class);
                    break;
                case 3: sungJuk = applicationContext.getBean("sungJukUpdate", SungJuk.class);
                    break;
                case 4: sungJuk = applicationContext.getBean("sungJukDelete", SungJuk.class);
                    break;
            }
            sungJuk.execute();

        }
    }
}
