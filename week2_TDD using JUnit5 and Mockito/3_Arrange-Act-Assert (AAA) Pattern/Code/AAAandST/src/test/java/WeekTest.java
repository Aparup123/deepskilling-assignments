import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WeekTest {
	WeekInterface week;

	// Arrange 
	// Setup
	@Before
	public void setup() {
		week=new Week();
	}
	
	// Testing the week.getDayName() method.
	@Test
	public void getDayNameTest() {
		// Arrange
		String expected="Monday";
		
		// Act
		String actual=week.getDayName(1);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	// Testing the week.isValidDayTest() method.
	@Test
	public void isValidDayTest() {
		// Arrange 
		boolean expected=false;
		
		// Act
		boolean result=week.isValidDay(10);
		
		// Assert
		assertTrue(expected==result);
		
	}
	
	// Teardown method
	@After
	public void teardown() {
		week.clean();
	}
	

}
