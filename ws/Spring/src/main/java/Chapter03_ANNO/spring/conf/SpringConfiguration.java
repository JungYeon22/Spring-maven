package Chapter03_ANNO.spring.conf;

import Chapter03_ANNO.sample01.LoggingAdvice;
import Chapter03_ANNO.sample01.MessageBeanImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class SpringConfiguration {
    @Bean
    public MessageBeanImpl messageBeanImpl(){
        return new MessageBeanImpl();
    }

    @Bean
    public LoggingAdvice loggingAdvice(){
        return new LoggingAdvice();
    }

}
