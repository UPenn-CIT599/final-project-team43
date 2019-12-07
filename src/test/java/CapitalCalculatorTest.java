
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * this file is to test 6 cases for four methods in CapitalCalculator
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
  void testcalFV() {
    // the capital with 0 interest should be equal to the initial investment
    assertEquals(c.calFV(3000, 0, 2), 3000);
  }

  @Test
  void testcalMinYieldYearly() {
    // the equilibrium rate should be fixed
    assertEquals((double) Math.round(c.calMinYieldYearly() * 10000) / 10000 , 0.0184);
  }

  @Test
  void testcalCapitalSeries() {
    ArrayList<CapitalSeries> cs = c.calCapitalSeries(3000, 0.05);
    // the first year capital should be equal to the initial investment * (1+interest rate)
    assertEquals(cs.get(0).capital, 3150);
  }
  

  @Test
  void testcalCapitalSeries2() {
    ArrayList<CapitalSeries> cs = c.calCapitalSeries(3000, 0.02);
    // when the interest rate is different, the number will change and is correct
    assertEquals(cs.get(0).capital, 3060);
  }
  
  @Test
  void testcalCapitalSeries3() {
    ArrayList<CapitalSeries> cs = c.calCapitalSeries(5000, 0.02);
    // when the saving amount is different, the number will change and is correct
    assertEquals(cs.get(0).capital, 5100);
  }
  

}
