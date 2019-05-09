package example;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class ScreenshootGoogle {

 @Test
 public void TestJavaS1()
{
	 System.setProperty("webdriver.gecko.driver", "D:\\dev\\soft\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	 DesiredCapabilities caps = new DesiredCapabilities();
	    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	    caps.setCapability(CapabilityType.HAS_NATIVE_EVENTS, false);
	    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
// Open Firefox
	    FirefoxDriver driver=new FirefoxDriver();

// Maximize the window
driver.manage().window().maximize();

// Pass the url
driver.get("http://www.google.com");
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//driver.executeScript("Qos.isEnabled = false;");
// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
// Take screenshot and store as a file format
File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
try {
 // now copy the  screenshot to desired location using copyFile //method
FileUtils.copyFile(src, new File("C:/selenium/error.png"));
}

catch (IOException e)
 {
  System.out.println(e.getMessage());

 }}
 }