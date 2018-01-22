package junitdemo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Sampletest {
	@Test
	public void simpletest()
	{
		int a=1;
		int b=2;
		assertTrue(a+b == 3);
	}

}
