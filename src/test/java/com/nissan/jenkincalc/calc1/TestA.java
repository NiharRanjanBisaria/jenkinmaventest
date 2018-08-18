package com.nissan.jenkincalc.calc1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestA {

	@Test
	public void test() {
	A a= new A();
	assertEquals(10,a.add(5, 5));
	
	
	}

}
