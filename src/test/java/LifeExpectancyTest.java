/**
 * @author Ngoc (Vy) Le
 *
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LifeExpectancyTest {

		@Test
		void testLifeExpectancy() {
			LifeExpectancy le = new LifeExpectancy("rate.csv");
		}
		
		@Test
		void testCalculateEx() {
			LifeExpectancy le = new LifeExpectancy("rate.csv");
			assertEquals(le.calculateEx("Male",25), 59);
			assertEquals(le.calculateEx("Female",60), 30);
		}
}
