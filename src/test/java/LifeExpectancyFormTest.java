
import java.awt.AWTException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Songqi Li
 */
public class LifeExpectancyFormTest {

  private LifeExpectancyForm form;

  @BeforeEach
  public void setUp() {
    this.form = new LifeExpectancyForm();
    this.form.setVisible(true);
  }

  @Test
  public void testGetExpectancy() {
    Assertions.assertEquals(0, this.form.getExpectancy());
  }

  @Test
  public void testSomeMethod() throws AWTException, InterruptedException {
    Assertions.assertTrue(this.form.isVisible());
    this.form.getNext().doClick();
    Assertions.assertFalse(this.form.isVisible());
    Assertions.assertTrue(this.form.getCapitalForm().isVisible());
  }
}
