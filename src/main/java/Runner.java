
/**
 *This class is the start of the program.
 * The program will calculate the minimum interest rate for a working
 * Canadian (18-64 age) to achieve target retirement savings plan at retirement age.
 *
 * @author Songqi(Sally) Li
 */
public class Runner {

  public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
      new LifeExpectancyForm().setVisible(true);
    });
  }
}
