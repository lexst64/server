package com.myproject.reverse;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ReverseTest {

	@Test
	public void test() {
		assertEquals("eoJ si gnikrow txen yadirF ", new Reverse().reverseText("Joe is working next Friday"));
	}

}
