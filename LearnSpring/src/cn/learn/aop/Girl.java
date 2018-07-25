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
		System.out.println("小女孩走到男孩身边");
	}
	
	@After(value="execution(* cn.learn.aop.Boy.*(..))")
	public void afterGirl(){
		System.out.println("惊不惊喜，意不意外O(∩_∩)O");
	}
	
	@Around(value = "execution(* cn.learn.aop.Boy.*(..))")
	public void aroundGril(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
			System.out.println("轻轻的说");
			proceedingJoinPoint.proceed();
			System.out.println("哈哈，骗你的额");
		
	}
}
