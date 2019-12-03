
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * this file is to test 3 cases in CapitalCalculator
 *
 * @author Haotian Zhang
 *
 */
class CapitalCalculatorTest {

  CapitalCalculator c;

  /**
   * set up initial class
   *
   * @throws Exception
   */
  @BeforeEach
  void setUp() throws Exception {
    c = new CapitalCalculator(25, 65, 100, 3000, 5000);
  }

  @Test
  void testcalPV() {
    // the capital with 0 interest should be equal to the initial investment
    assertEquals(c.calFV(3000, 0, 2), 3000);
  }

  @Test
  void testcalMinYieldYearly() {
    // the equilibrium rate should be fixed
    assertEquals(c.calMinYieldYearly(), 0.05);
  }

  @Test
  void testcalCapitalSeries() {
    c.calCapitalSeries(3000, 0.05);
    // the first capital should be equal to the initial investment

  }

}
