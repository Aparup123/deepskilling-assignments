import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	private static Calculator cal; 
	
	@BeforeClass
	public static void initiate() {
		cal=new Calculator();
	}

	@Test
	public void calculationTest() {
		assertEquals(3, cal.add(2, 1));
		assertEquals(8, cal.sub(10, 2));
	}
	
	@Test
	public void assertBooleanTest() {
		assertTrue(4>2);
		assertFalse(2==3);
	}
	
	@Test
	public void assertNullTest() {
		assertNotNull(new Calculator());
		assertNull(null);
	}
	
	@Test
	public void assertExceptionTest() {
		assertThrows(ArithmeticException.class, ()->{
			cal.div(4, 0);
		});
	}
	

}
