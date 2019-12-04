/**
 * @author Ngoc (Vy) Le
 *
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LifeExpectancyTest {

		@Test
		void testLifeExpectancy() {
			LifeExpectancy le = new LifeExpectancy("rate_sample.csv");
		}
		
		@Test
		void testCalculateEx() {
			LifeExpectancy le = new LifeExpectancy("rate.csv");
			assertEquals(le.calculateEx("Male",0), 84);
			assertEquals(le.calculateEx("Female",0), 89);
		}
}
