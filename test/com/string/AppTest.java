package com.string;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void testconcat() {
		App app = new App();
		assertEquals("emnakamoun",app.concat("emna", "kamoun"));
		
	}

}
