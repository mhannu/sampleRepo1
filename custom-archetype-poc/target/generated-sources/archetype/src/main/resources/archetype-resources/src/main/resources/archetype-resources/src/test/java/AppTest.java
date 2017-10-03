#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${symbol_dollar}package;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**@author Manoja Sahu
 * Unit test for simple App.
 */
@RunWith(JUnitPlatform.class)
public class AppTest {
  
  private static final Logger log = Logger.getLogger(AppTest.class);

  @Test
  public void TestDoIt() {
    log.info("Testing doIt()...");
   }
}
