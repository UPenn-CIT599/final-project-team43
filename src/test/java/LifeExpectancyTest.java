package main.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LifeExpectancyTest {

		@Test
		void testLifeExpectancy() {
			LifeExpectancy le = new LifeExpectancy("rate_sample.csv");
		}
		
		@Test
		void testCalculateEx() {
			LifeExpectancy le = new LifeExpectancy("rate_sample.csv");
			System.out.println(le.calculateEx("Male",0));
		}

}
