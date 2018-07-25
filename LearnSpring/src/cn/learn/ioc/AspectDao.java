package cn.learn.ioc;

import org.springframework.stereotype.Component;

@Component(value="dao1")
public class AspectDao {
	public void AspectDao(){
		System.out.println("dao>>>>>>");
	}
}
