package cn.learn.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		
		Boy boy = (Boy) context.getBean("boy");
		boy.boy();
	}

}
