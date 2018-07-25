package cn.learn.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.learn.aop.EatIce;
import cn.learn.xmlAnno.BookService;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("bean.xml");
		
		//��ȡxml��ʽ
		/*UserService service = (UserService) context.getBean("userService");
		service.add();
		Person person = (Person) context.getBean("person");
		person.perSon();*/
		//ʹ��ע�ⷽʽ
		/*IocTest it = (IocTest) context.getBean("iocTest");
		it.IocTest();*/
		
		/*AspectUser ad = (AspectUser) context.getBean("aspectUser");
		ad.add();
		
		BookService bk = (BookService) context.getBean("bookService");
		bk.service();*/
		
		EatIce eat = (EatIce) context.getBean("eat");
		eat.eat();
	}

}
