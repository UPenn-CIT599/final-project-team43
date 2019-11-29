
/**
 *
 * @author sally
 */
public class TestCalculator {

  private String gender;
  private int age;

  public TestCalculator(String gender, int age) {
    this.gender = gender;
    this.age = age;
  }

  public int calculate() {
    if (gender.equals("Male")) {
      return 1 + age;
    } else {
      return 2 + age;
    }
  }
}
