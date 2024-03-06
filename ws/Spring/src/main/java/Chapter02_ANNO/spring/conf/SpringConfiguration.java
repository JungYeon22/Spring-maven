package Chapter02_ANNO.spring.conf;

import Chapter02_ANNO.sample01.MessageBeanImpl;
import Chapter02_ANNO.sample02.CalcAdd;
import Chapter02_ANNO.sample02.CalcMul;
import Chapter02_ANNO.sample04.HelloSpring;
import Chapter02_ANNO.sample04.SungJukDTO2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


@Configuration
public class SpringConfiguration {
	
	//빈 생성
//	@Bean
//	public MessageBeanImpl messageBeanImpl(){
//		return new MessageBeanImpl("사과");
//	}
	
	@Bean(name="messageBeanImpl")
	public MessageBeanImpl getMessageBeanImpl(){
		return new MessageBeanImpl("사과");
	}
	
	/*
	 * sample02
	 */
	@Bean
	public CalcAdd calcAdd() {
		return new CalcAdd(25,26);
	}
	
	@Bean(name="calcMul")
	public CalcMul getCalcMul() {
		return new CalcMul();
	}

	/*
	sample04
	 */
	@Bean
	public List<SungJukDTO2> arrayList(){
		return new ArrayList<SungJukDTO2>();
	}

}
/*
 * @Bean => 메소드에서 return 되는 값을 스프링의 빈으로 생성한다.
 * 		 => 메소드명을 설정할 때에는 반드시 빈의 id명으로 해야한다.
 * 		 => 메소드명을 설정할 때에는 자바처럼 getter를 사용하려면 @Bean(name 속성)을 사용한다.
 */
