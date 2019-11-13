
import java.util.ArrayList;

/**
 * calculate the equilibrium rate
 *
 * @author Haotian Zhang
 *
 */
public class CapitalCalculator {
  //HashMap<Timestamp, Integer> CapitalSeries = new HashMap<Timestamp, Integer>();

  ArrayList<CapitalSeries> capitalSeries;
  int yearsOfSaving;
  int yearsOfRetirement;
  int targetMonthlyRevenue;
  int targetMonthlySaving;

  /**
   * Constructor: five variables of integers
   *
   * @param currentAge
   * @param expectedRetirementAge
   * @param expectedLongevity
   * @param savingMonthly
   * @param revenueMonthly
   */
  public CapitalCalculator(int currentAge, int expectedRetirementAge, int expectedLongevity,
          int savingMonthly, int revenueMonthly) {
    this.yearsOfSaving = expectedRetirementAge - currentAge;
    this.yearsOfRetirement = expectedLongevity - expectedRetirementAge;
    this.targetMonthlyRevenue = revenueMonthly;
    this.targetMonthlySaving = savingMonthly;
  }

  /**
   * calculate Present Value of RevenueMonthly and SavingMonthly
   *
   * @param capitalMonthly
   * @param rate
   * @return
   */
  public double calPV(int capitalMonthly, double rate) {
    //TODO: calculate Present Value of RevenueMonthly and SavingMonthly
    return (double) capitalMonthly / (1 + rate);
  }

  /**
   * calculate minimal yield per year by set present value of saving and
   *
   * @return Minimal Yield Yearly
   */
  public double calMinYieldYearly() {
    //TODO: use for loop to determine the close rate
    double rate = 0.05;
    double PVRevenue = calPV(this.targetMonthlyRevenue, rate);
    double PVSaving = calPV(this.targetMonthlySaving, rate);
    return rate;
  }

  /**
   * calculate and return capital series with given saving month and interest rate
   *
   * @param savingMonthly
   * @param monthlyIntRate
   * @return
   */
  public ArrayList<CapitalSeries> calCapitalSeries(int savingMonthly, double monthlyIntRate) {
    //TODO: use for loop to create capital time series
    capitalSeries = new ArrayList<CapitalSeries>();
    capitalSeries.add(new CapitalSeries("20170105", savingMonthly));
    return capitalSeries;
  }

  /**
   * Test
   *
   * @param args
   */
  public static void main(String[] args) {
    CapitalCalculator c = new CapitalCalculator(25, 65, 100, 3000, 5000);
    c.calMinYieldYearly();
    ArrayList<CapitalSeries> capitalSeries = c.calCapitalSeries(3000, 5000);
  }

}
