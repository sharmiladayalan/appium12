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

public class calculator {
	 AndroidDriver<WebElement> driver;
  @Test
  public void f() {
	  System.out.println("native application passed");
	  driver.findElements(MobileBy.id("com.android.calculator2:id/digit_4"));
	  driver.findElements(MobileBy.id("com.android.calculator2:id/digit_5"));
	  driver.findElement(MobileBy.AccessibilityId("plus")).click();
	  driver.findElements(MobileBy.id("com.android.calculator2:id/digit_6"));
	  driver.findElements(MobileBy.id("com.android.calculator2:id/digit_6"));
	  driver.findElement(MobileBy.AccessibilityId("equals")).click();
	  driver.findElements(MobileBy.id("com.android.calculator2:id/"));
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
