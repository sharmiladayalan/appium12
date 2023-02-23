package mobiletesting;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class nativeapplication {
	 AndroidDriver<WebElement> driver;
  @Test(enabled=true)
  public void f() throws InterruptedException {
	  System.out.println("native application passed");
	  System.out.println("First Native Automation");
	  driver.findElements(MobileBy.id("android:id/text1")).get(1).click();
	  driver.findElements(MobileBy.id("android:id/text1")).get(0).click();
	  driver.findElement(MobileBy.id("com.example.android.apis:id/ball")).click();
	  Thread.sleep(2000);
	  driver.navigate().back();
	  Thread.sleep(2000);
	  driver.navigate().back();
	  driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Reversing\")")).click();
	  driver.findElements(MobileBy.id("android:id/text1")).get(9).click();
	  driver.findElements(MobileBy.id("android:id/text1")).get(2).click();
	  //driver.findElements(MobileBy.id("android:id/checkbox")).click();
  }
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	  DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.example.android.apis");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.example.android.apis.ApiDemos");
 		driver=new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),dc);

		
  }

  @AfterTest
  public void afterTest() {
  }

}
