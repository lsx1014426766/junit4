package com.immoc.util;


import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.hamcrest.core.AllOf;
import org.junit.Ignore;
import org.junit.Test;
//import org.hamcrest.core.*;
/**
 * @Test注解的参数使用
 * @author lsx
 *
 */
public class AnnotationTest {

	@Test(expected=ArithmeticException.class)
	public void testDivide() {
		assertEquals(6, new Caculate().divide(3,0));
	}
	@Test(timeout=1)
	public void testWhile(){
		int i=0;
		while(i<10){
			System.out.println(i++);
		}
	}
	//@Ignore("..")忽略这个 此时后抛出异常：超时
	@Test(timeout=1000)
	public void testReadFile(){
		try{
			Thread.sleep(2000);
			System.out.println(111);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
		
	}


