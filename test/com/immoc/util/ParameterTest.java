package com.immoc.util;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterTest {
	/*
	 * 1更改默认测试运行器为@RunWith(Parameterized.class)
	 * 2声明变量来存放预期值和结果集
	 * 3声明一个返回值为Collection的公共静态方法，并使用@Parameter进行修饰
	 * 4为测试类声明一个带有参数的公共构造函数，并在其中为之声明变量赋值
	 * */
  int expected=0;
  int input1=0;
  int input2=0;
  
  @Parameters
  public static Collection<Object[]> t(){
	  //数组转化为集合
	  return Arrays.asList(  new Object[][]{
			  {3,1,2},{4,2,2}
	  });
			
  }

public ParameterTest(int expected, int input1, int input2) {
	super();
	this.expected = expected;
	this.input1 = input1;
	this.input2 = input2;
}
@Test
public void testAdd(){
	assertEquals(expected,new Caculate().add(input1, input2));
}
  
}
