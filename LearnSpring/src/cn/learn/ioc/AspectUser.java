package cn.learn.ioc;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("aspectUser")
public class AspectUser {
	//使用注解注入属性
	//@Autowired
	@Resource(name="dao1")
	private AspectDao dao1;
	public void add(){
		System.out.println("user........");
		dao1.AspectDao();
	}
}
