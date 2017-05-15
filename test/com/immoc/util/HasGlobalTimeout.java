package com.immoc.util;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

public class HasGlobalTimeout {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

/*	@Rule
	public final TestRule timeout = Timeout.builder()
			.withTimeout(10, TimeUnit.SECONDS).withLookingForStuckThread(true)
			.build();*/
	//陷入无限死循环
	@Test
	public void testInfiniteLoop() {
		for (;;) {
		}
	}

}
