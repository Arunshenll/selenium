package firsttestngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.*;


public class FirstTestNGFile {
	 public String baseUrl = "http://demo.guru99.com/test/newtours/";
  @Test
  public void verifyHomepageTitle() {
	  System.out.println("launching firefox browser"); 

		WebDriver driver = new ChromeDriver();
		
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.close();
  }
}
