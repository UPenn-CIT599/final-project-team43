import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * this file is to test parameters for constructor in CapitalChart
 *
 * @author Haotian Zhang
 *
*/
class CapitalChartTest {
	static CapitalChart chart;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		chart = new CapitalChart("Saving illustrations",25, 65, 100, 3000, 5000);
	}

	 @Test
	  void testParametersCorrect() {
	    // test whether parameters were passed correctly
	    assertEquals(chart.currentAge , 25);
	    assertEquals(chart.expectedLongevity , 100);
	    assertEquals(chart.targetYearlyRevenue , 5000);
	    assertEquals(chart.targetYearlySaving , 3000);
	    assertEquals(chart.expectedRetirementAge , 65);
	  }

}
