package main.java;

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
   * @param savingMonthly
   * @param revenueMonthly
   */
  public CapitalCalculator(int currentAge, int expectedRetirementAge, int expectedLongevity,
          int savingYearly, int revenueYearly) {
    this.yearsOfSaving = expectedRetirementAge - currentAge;
    this.yearsOfRetirement = expectedLongevity - expectedRetirementAge;
    this.targetYearlyRevenue = revenueYearly;
    this.targetYearlySaving = savingYearly;
  }

  /**
   * calculate Present Value of RevenueYearly and SavingYearly
   *
   * @param capitalYearly
   * @param rate
   * @return
   */
  public double calPV(int capitalYearly, double rate, int yearBeforeStart, int duration) {
	double PV = capitalYearly * (1-Math.pow(1+rate,-duration)/rate);
    return (double) PV / Math.pow(1+rate,yearBeforeStart);
  }

  /**
   * calculate minimal yield per year by set present value of saving and
   * basic algorithm: iterations with accurateness 0.001
   *
   * @return Minimal Yield Yearly
   */
  public double calMinYieldYearly() {
    //TODO: use for loop to determine the close rate
    double rate = 0.5;
    for(double i=0; i<rate; i+=0.001) {
    	double PVRevenue = calPV(this.targetYearlyRevenue, i, 0, this.yearsOfSaving);
        double PVSaving = calPV(this.targetYearlySaving, i, this.yearsOfSaving, this.yearsOfRetirement);
        if((PVRevenue - PVSaving)/PVRevenue < 0.0001) {
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
    capitalSeries.add(new CapitalSeries("20170105", savingYearly));
    return capitalSeries;
  }

  /**
   * Test
   *
   * @param args
   */
  public static void main(String[] args) {
    CapitalCalculator c = new CapitalCalculator(25, 65, 100, 5000, 5000);
    System.out.println(c.calMinYieldYearly());
    ArrayList<CapitalSeries> capitalSeries = c.calCapitalSeries(3000, 5000);
  }

}
