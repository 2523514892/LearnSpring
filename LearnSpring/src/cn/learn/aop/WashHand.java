package cn.learn.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class WashHand {
	public void wash1(){
		System.out.println("�Է�ǰ��ϴ�֡���������������");
	}
	
	public void washBowl(){
		System.out.println("�Է���Ҫϴ�롣��������������");
	}
	
	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println("����������ӱ�");
		proceedingJoinPoint.proceed();
		System.out.println("��ʼ��ʰ���");
	}
}
