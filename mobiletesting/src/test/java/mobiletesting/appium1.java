package mobiletesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class appium1 {
     AndroidDriver<WebElement> driver;

     @BeforeTest
 	public void bt() throws MalformedURLException
 	{
 		DesiredCapabilities dc = new DesiredCapabilities();
 		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
 		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
 		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
 		dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\Users\\HP\\eclipse-workspace\\mobiletesting\\chromedriver.exe");
 		driver=new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
 	}
    @Test
    public void testcase1() throws InterruptedException {
    	driver.get("https://www.google.com/");
    	driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("orngehrm demo");
    	Actions act= new Actions(driver);
    	act.sendKeys(Keys.ENTER).build().perform();
    	Thread.sleep(3000);
    	driver.findElement(By.partialLinkText("OrangeHRM")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@class=\'orangehrm-todo-list-item\']")).click();
    	Thread.sleep(3000);
    }
}


