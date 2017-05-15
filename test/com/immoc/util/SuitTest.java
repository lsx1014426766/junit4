package com.immoc.util;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	TaskTest1.class,TaskTest2.class,TaskTest3.class
})
public class SuitTest {
	/*
	 * 这里必须保证为空类,只是测试套件的入口类   run application此入口
	 * 更改测试运行器Suite.class
	 * 测试套件可包含测试套件
	 * 组织测试类一起运行
	 * 将要测试的类作为数组传入Suite.SuiteClasses({ })
	 * */
}
