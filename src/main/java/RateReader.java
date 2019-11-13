/**
 *
 * @author vy
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class RateReader {

	ArrayList<Rate> rates = new ArrayList<>();
	ArrayList<String> columns = new ArrayList<>();

	public RateReader(String filename) {
		try {
			Scanner in = new Scanner(new FileReader(filename));
			
			while (in.hasNextLine()) {
				//Read column headers
				if (columns.size() == 0) {
					String nextLine = in.nextLine();
					for (String str : nextLine.split(",")) {
						columns.add(str);
					}
				} else { // Read flight data
					Rate r = parseRate(in.nextLine());
					rates.add(r);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
	}
	
	/**
	 * Parses a row into a Flight object
	 * @param row
	 * @return
	 */
	public Rate parseRate(String row) { 
		boolean isName = false;
		String newRow = "";
		
		for (char c : row.toCharArray()) {
			if (c == '"') {
				isName = !isName;
			} else if (c == ',' && !isName) {
				newRow += ";;";
			} else {
				newRow += c;
			}
		}
		
		// Split into an array
		String[] newRowArr = newRow.split(";;");
		
		int Age = newRowArr[0].length() == 0 ? -1000 : Integer.parseInt(newRowArr[1]);
		double Qx = newRowArr[1].length() == 0 ? -1000 : Double.parseDouble(newRowArr[2]);
		
		Rate r = new Rate(newRowArr[0], Age, Qx);
		
		return r;
	}
	
	/**
	 * get the rates for male
	 */
	public ArrayList<Rate> getMaleRates() {
		ArrayList<Rate> maleRates = new ArrayList<Rate>();
		for (Rate temp : this.rates) {
			if (temp.getGender().equals("Male")) {
				maleRates.add(temp);
			}
		}
		return maleRates;
	}
	
	/**
	 * get the rates for female
	 */
	public ArrayList<Rate> getFemaleRates() {
		ArrayList<Rate> femaleRates = new ArrayList<Rate>();
		for (Rate temp : this.rates) {
			if (temp.getGender().equals("Female")) {
				femaleRates.add(temp);
			}
		}
		return femaleRates;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RateReader test = new RateReader("rate_sample.csv");
		System.out.println(test.getFemaleRates());
		System.out.println(test.getMaleRates());
	}

}
