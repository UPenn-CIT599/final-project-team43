
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * this file is to test 9 cases for four methods in CapitalCalculator
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
  void testcalFV1() {
    // the capital with 0% interest should be equal to the initial investment
    assertEquals(3000, c.calFV(3000, 0, 2));
  }
  
  @Test
  void testcalFV2() {
    // the capital with 1% interest should be initial investment * (1 + interest rate) + 1
    assertEquals( 6030, (double) Math.round(c.calFV(3000, 0.01, 2) * 10000) / 10000
    								);
  }
  
  @Test
  void testcalFV3() {
    // the capital with 100% interest should be the initial investment * 3
    assertEquals( 9000, c.calFV(3000, 1, 2));
  }
  
  @Test
  void testcalFV4() {
    // the capital with 5% interest with long time should be correct
    assertEquals( 7830075.4708, 
    		(double) Math.round(c.calFV(3000, 0.05, 100) * 10000) / 10000);
  }

  @Test
  void testcalMinYieldYearly() {
    // the equilibrium rate should be fixed
    assertEquals( 0.0184, (double) Math.round(c.calMinYieldYearly() * 10000) / 10000 );
  }

  @Test
  void testcalCapitalSeries() {
    ArrayList<CapitalSeries> cs = c.calCapitalSeries(3000, 0.05);
    // the first year capital should be equal to the initial investment * (1+interest rate)
    assertEquals( 3150, cs.get(0).capital);
  }
  

  @Test
  void testcalCapitalSeries2() {
    ArrayList<CapitalSeries> cs = c.calCapitalSeries(3000, 0.02);
    // when the interest rate is different, the number will change and is correct
    assertEquals( 3060,cs.get(0).capital);
  }
  
  @Test
  void testcalCapitalSeries3() {
    ArrayList<CapitalSeries> cs = c.calCapitalSeries(5000, 0.02);
    // when the saving amount is different, the number will change and is correct
    assertEquals( 5100, cs.get(0).capital);
  }
  
  @Test
  void testcalCapitalSeries4() {
    ArrayList<CapitalSeries> cs = c.calCapitalSeries(5000, 0.02);
    // when the saving amount is different, the number will change and is correct
    assertEquals( 32171.4169,
    		(double) Math.round(cs.get(5).capital * 10000) / 10000);
  }
  

}
