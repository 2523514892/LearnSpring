package cn.learn.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class Girl {
	
	@Before(value = "execution(* cn.learn.aop.Boy.*(..))")
	public void beforeGirl(){
		System.out.println("СŮ���ߵ��к����");
	}
	
	@After(value="execution(* cn.learn.aop.Boy.*(..))")
	public void afterGirl(){
		System.out.println("������ϲ���ⲻ����O(��_��)O");
	}
	
	@Around(value = "execution(* cn.learn.aop.Boy.*(..))")
	public void aroundGril(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
			System.out.println("�����˵");
			proceedingJoinPoint.proceed();
			System.out.println("������ƭ��Ķ�");
		
	}
}
