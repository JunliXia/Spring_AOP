package com.spring.xml;

import org.aspectj.lang.ProceedingJoinPoint;

public class Supervisor {
	public void startWork(){
		System.out.println("开始干活");
	}

	public void endWork(){
		System.out.println("下班");
	}
	
	public void mistake(){
		System.out.println("扣工资");
	}
	
	public void aroundWorking(ProceedingJoinPoint point){
		try {
			System.out.println("开始干活");
			
			point.proceed();
			
		}catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("扣工资");
		}finally{
			System.out.println("下班");
		}
	}
	
}
