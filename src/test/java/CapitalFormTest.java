/*
 * Copyright 2019 sally.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author sally
 */
public class CapitalFormTest {

  private CapitalForm capitalForm = new CapitalForm(0, 0);

  @Before
  public void setUp() {
  }

  @Test
  public void testSomeMethod() throws AWTException {
    Robot bot = new Robot();
    bot.mouseMove(this.capitalForm.getJLabel1().getX(), this.capitalForm.getJLabel1().getY());
    bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//add time between press and release or the input event system may
//not think it is a click
    try {
      Thread.sleep(250);
    } catch (InterruptedException e) {
    }
    bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
  }

}
