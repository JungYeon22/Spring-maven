package Chapter03_XML.sample01;

import java.lang.annotation.Target;

// 공통 관심사항
public class LoggingAdvice {
    public void beforeTrace(){
        System.out.println("before trace");
    }

    public void AfterTrace(){
        System.out.println("after trace");
    }

}
