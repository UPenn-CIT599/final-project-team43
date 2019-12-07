
/**
 *
 * @author Songqi(Sally) Li
 */
public class Runner {

  public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new LifeExpectancyForm().setVisible(true);
      }
    });
  }
}
