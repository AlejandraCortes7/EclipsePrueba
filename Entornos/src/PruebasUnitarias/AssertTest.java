package PruebasUnitarias;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import junit.framework.Assert;

public class AssertTest {
//para double usar el delta
//stringmesageimprimen mensajes
	@Test
	public void test() {
		
		assertFalse(3<4);
	}
	@Test
	public void test2() {
		
		assertTrue(3<4);
	}

	@Test
	public void test3() {
		
		Date date1 = new Date();
		Date date2 = new Date();
		
		assertSame(date1, date1);
		assertEquals(date1,date2);
		
	}
}
