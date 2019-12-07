
/**
 * Runner: use this to run the capital calculator with five parameters
 *
 * @author Haotian
 *
 */
public class CapitalCalculatorRunner {

  private int currentAge = 25;
  private int expectedRetirementAge = 65;
  private int expectedLongevity = 84;
  private int savingYearly = 10000;
  private int revenueYearly = 50000;

  /**
   * define how to run capital calculator
   */
  public void chartRunner() {
	  // create an instance variable of calculator
    CapitalCalculator c = new CapitalCalculator(currentAge, expectedRetirementAge, expectedLongevity,
            savingYearly, revenueYearly);
    System.out.println("This is min interest rate " + c.calMinYieldYearly());
    // create an instance variable of chart to display the result
    CapitalChart Jchart = new CapitalChart("Saving Projections", currentAge, expectedRetirementAge, expectedLongevity,
            savingYearly, revenueYearly);
    Jchart.display();

  }

  public static void main(String[] args) {
	  // to run the form
    new CapitalCalculatorRunner().chartRunner();
  }

}
