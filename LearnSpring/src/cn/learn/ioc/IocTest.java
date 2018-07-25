package cn.learn.ioc;

import org.springframework.stereotype.Component;

@Component(value="iocTest")   //<bean id="iocTest" class="">
public class IocTest {
	private String name;
	public void IocTest(){
		System.out.println("123123....");
	}
}
