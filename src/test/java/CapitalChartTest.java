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
	    assertEquals(25, chart.currentAge );
	    assertEquals(100, chart.expectedLongevity);
	    assertEquals(5000 , chart.targetYearlyRevenue);
	    assertEquals(3000 , chart.targetYearlySaving );
	    assertEquals(65 , chart.expectedRetirementAge);
	  }

}
