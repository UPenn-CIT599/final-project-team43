
public class Rate {
	
	private String Gender;
	private int Age;
	private double Qx;
	
	public Rate(String Gender, int Age, double Qx) {
		this.Gender = Gender;
		this.Age = Age;
		this.Qx = Qx;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return Gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		Gender = gender;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return Age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		Age = age;
	}


	/**
	 * @return the qx
	 */
	public double getQx() {
		return Qx;
	}

	/**
	 * @param qx the qx to set
	 */
	public void setQx(double qx) {
		Qx = qx;
	}
	
	@Override
	public String toString() {
		return "Gender\t" + Gender + 
			   "\tAge\t" + Age + 
			   "\tQx\t" + Qx;

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
