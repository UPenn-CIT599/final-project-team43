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
			assertEquals( 59,le.calculateEx("Male",25));
			assertEquals(30,le.calculateEx("Female",60));
		}
}
