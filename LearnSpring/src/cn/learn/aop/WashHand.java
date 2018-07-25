package cn.learn.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class WashHand {
	public void wash1(){
		System.out.println("吃饭前先洗手。。。。。。。。");
	}
	
	public void washBowl(){
		System.out.println("吃饭后要洗碗。。。。。。。。");
	}
	
	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println("大家坐在桌子边");
		proceedingJoinPoint.proceed();
		System.out.println("开始收拾碗筷");
	}
}
