
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
  int targetYearlyRevenue;
  int targetYearlySaving;

  /**
   * Constructor: five variables of integers
   *
   * @param currentAge
   * @param expectedRetirementAge
   * @param expectedLongevity
   * @param savingYearly
   * @param revenueYearly
   */
  public CapitalCalculator(int currentAge, int expectedRetirementAge, int expectedLongevity,
          int savingYearly, int revenueYearly) {
    this.yearsOfSaving = expectedRetirementAge - currentAge;
    this.yearsOfRetirement = expectedLongevity - expectedRetirementAge;
    this.targetYearlyRevenue = revenueYearly;
    this.targetYearlySaving = savingYearly;
  }

  /**
   * calculate Future Value of SavingYearly
   *
   * @param capitalYearly
   * @param rate
   * @return
   */
  public double calFV(int capitalYearly, double rate, int duration) {
    double FV = capitalYearly * (Math.pow(1 + rate, duration) - 1) / rate;
//	System.out.println(FV);
    return (double) FV;
  }

  /**
   * calculate minimal yield per year by set present value of saving and basic algorithm: iterations
   * with accurateness 0.001
   *
   * @return Minimal Yield Yearly
   */
  public double calMinYieldYearly() {
    //TODO: use for loop to determine the close rate
    double rate = 1;
    double PVRevenue = this.yearsOfRetirement * this.targetYearlyRevenue;
    for (double i = 0.0001; i < rate; i += 0.0001) {
      double PVSaving = calFV(this.targetYearlySaving, i, this.yearsOfSaving);
      if (PVRevenue - PVSaving < 0) {
        // relative error is less than 1%%
        return i;
      }
    }
    return rate;
  }

  /**
   * calculate and return capital series with given saving month and interest rate
   *
   * @param savingMonthly
   * @param monthlyIntRate
   * @return
   */
  public ArrayList<CapitalSeries> calCapitalSeries(int savingYearly, double yearlyIntRate) {
    //TODO: use for loop to create capital time series
    capitalSeries = new ArrayList<CapitalSeries>();
    int year;
    double currentSaving = 0;

    for (int i = 1; i <= this.yearsOfSaving; i++) {
      year = (2019 + i);
      currentSaving += savingYearly * Math.pow(1 + yearlyIntRate, i);
      capitalSeries.add(new CapitalSeries(year + "0105", currentSaving * (1 + yearlyIntRate)));
      System.out.println(currentSaving);
    }
    return capitalSeries;
  }
  
  /**
   * Test
   *
   * @param args
   */
  public static void main(String[] args) {

    CapitalCalculator c = new CapitalCalculator(25, 65, 100, 30000, 48000);
    System.out.println(c.calMinYieldYearly());
    double yearlyIntRate = c.calMinYieldYearly();
    ArrayList<CapitalSeries> capitalSeries = c.calCapitalSeries(30000, yearlyIntRate);
    System.out.println(capitalSeries);
  }

}
