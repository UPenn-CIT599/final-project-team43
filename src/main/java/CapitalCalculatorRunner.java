package main.java;


public class CapitalCalculatorRunner {
	int currentAge = 25;
	int expectedRetirementAge = 65;
	int expectedLongevity = 100;
	int savingYearly = 30000;
	int revenueYearly = 48000;

	public static void main(String[] args) {
	    CapitalCalculator c = new CapitalCalculator(25, 65, 100,
	            30000, 48000);
	    System.out.println("This is min interest rate " + c.calMinYieldYearly());
	    CapitalChart Jchart = new CapitalChart("Capital Series",25, 65, 100,
	            30000, 48000);
//	    CapitalChart Jchart = new CapitalChart(currentAge, expectedRetirementAge, expectedLongevity,
//	            savingYearly, revenueYearly);
	    Jchart.display();

	}

}
