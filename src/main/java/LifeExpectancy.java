/**
 *
 * @author vy
 */

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;

public class LifeExpectancy {

	private String fileName;
	private RateReader r;
	
	public LifeExpectancy(String fileName) {
		this.fileName = fileName;
		this.r = new RateReader(fileName);
	}
	
	/**
	 * Calculate the life expectancy i.e. remaining number of years left based on gender and their current age
	 * @param gender
	 * @param CurrentAge
	 * @return life expectancy with 1 decimal
	 */
	public double calculateEx(String gender, int currentAge) {
		double ex = 0.0;
		
		ArrayList<Rate> rates;
		if (gender.equals("Female")) {
			rates = r.getFemaleRates();
		} else {
			rates = r.getMaleRates();
		}
		
		for (int i = 0; i < rates.size(); i++) {
			Rate rt = rates.get(i);
			if (rt.getAge() >= currentAge) {
				ex = ex + this.calculateSurivorProb(currentAge, rates, rt.getAge());
			}
		}
		
		DecimalFormat f = new DecimalFormat("##.0");
		String formate = f.format(ex);
		double finalValue = 0.0;
		try {
			finalValue = (Double)f.parse(formate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return finalValue-0.5;
	}
	
	/**
	 * Calculate the probability of surviving from current age to future age
	 * @param current age
	 * @param list of mortality rates for all ages
	 * @param future age
	 * @return probability of survivor
	 */
	public double calculateSurivorProb(int currentAge, ArrayList<Rate> rates, int futureAge) {
		double result = 1.0;
		for (int i = 0; i < rates.size(); i++) {
			Rate rt = rates.get(i);
			if (rt.getAge() >= currentAge) {
				if (rt.getAge() < futureAge) {
					result = result * (1-rt.getQx());
				}
			}
		}
		return result;
	}
	
}
