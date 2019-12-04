
/**
 * @author Ngoc (Vy) Le
 *
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RateReaderTest {

	@Test
	void testRateReader() {
		RateReader test = new RateReader("rate.csv");
	}
	
	@Test
	void testgetMaleRates() {
		RateReader test = new RateReader("rate.csv");
		System.out.println(test.getMaleRates());
	}

	@Test
	void testgetFemaleRates() {
		RateReader test = new RateReader("rate.csv");
		System.out.println(test.getMaleRates());
	}
}
