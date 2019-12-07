
/**
 * Runner: use this to run the interface
 *
 * @author Haotian, Sally
 *
 */
public class CapitalCalculatorRunner {

  private int currentAge = 25;
  private int expectedRetirementAge = 65;
  private int expectedLongevity = 84;
  private int savingYearly = 10000;
  private int revenueYearly = 100000;

  public void chartRunner() {
    CapitalCalculator c = new CapitalCalculator(currentAge, expectedRetirementAge, expectedLongevity,
            savingYearly, revenueYearly);
    System.out.println("This is min interest rate " + c.calMinYieldYearly());
    CapitalChart Jchart = new CapitalChart("Capital Chart", currentAge, expectedRetirementAge, expectedLongevity,
            savingYearly, revenueYearly);
    Jchart.display();

  }

  public static void main(String[] args) {
    //TODO: run the form
    new CapitalCalculatorRunner().chartRunner();

  }

}
