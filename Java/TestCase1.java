package javasql.ust;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestCase1 {

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(2, 2);
		assertEquals(5, Connection1.calculate(2,3));
		
	}
	@Test(expected = NullPointerException.class)

	public void test1() {
		String s=null;
		assertEquals("ABC",s.toUpperCase());
	}
	@After
	public void after() {
		System.out.println("in after");
	}
	
	@Before
	public void before() {
		System.out.println("in before");
	}
	
	@AfterClass
	public static void Afterclass() {
		System.out.println("in afterclass");
	}
	
	@BeforeClass
	public static void Beforeclass() {
		System.out.println("in before class");
	}
	

}
