package firsttestngpackage;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  private boolean ture;
@Test(priority=3)
  public void c_test() {
	  Assert.fail();
	  
  }
  @Test(priority=0)
  public void a_test() {
	  AssertJUnit.assertTrue(ture);
  }
  @Test(priority=7)
  public void b_test() {
	  throw new SkipException("skipping b_test...");
  }
  
}
