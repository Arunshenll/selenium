package firsttestngpackage;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;


public class Testsimple {
  @Test
  public void testAdd() {
	  String str = "TestNG is working fine";
      Assert.assertEquals("TestNG is working fine", str);
	
	
}

	
}


	

