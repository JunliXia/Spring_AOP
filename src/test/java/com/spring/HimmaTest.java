package com.spring;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.xml.People;
public class HimmaTest extends TestCase {

	ApplicationContext applicationContext;
	
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("Spring-xml.xml");
	}
	
	@Test
	public void testHimma(){
		People himma = (People) applicationContext.getBean("himma");
		himma.doWorking();
	}
	

}
