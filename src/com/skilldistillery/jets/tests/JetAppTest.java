package com.skilldistillery.jets.tests;

import static org.junit.Assert.*;

import org.junit.*;

import com.skilldistillery.jets.Jet;
import com.skilldistillery.jets.JetsApplication;

public class JetAppTest {
	
	private JetsApplication ja;

	
	@Before
	public void setUp(){
		ja = new JetsApplication();

	}
	
	@After
	public void tearDown() {
		ja = null;
	}

	@Test
	public void test_getSpeedInMach_returns_zero() {
		assertEquals(0, ja.getSpeedInMach());
	}

}
