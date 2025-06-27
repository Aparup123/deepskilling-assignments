import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculationTest {
	@Test
	public void addTest() {
		Calculation calculation =new Calculation();
		assertEquals(2, calculation.add(1, 1));
	}
}
