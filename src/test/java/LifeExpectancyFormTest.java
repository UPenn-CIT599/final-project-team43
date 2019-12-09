
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author sally
 */
public class LifeExpectancyFormTest {

  public LifeExpectancyFormTest() {
  }

  @Before
  public void setUp() {
  }

  @Test
  public void testGetExpectancy() {

    LifeExpectancyForm lifeExpectancyForm = new LifeExpectancyForm();
    assertEquals(0, lifeExpectancyForm.getExpectancy());
  }

}
