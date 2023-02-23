package mobiletesting;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.testng.annotations.AfterTest;



public class BanjaraRide extends Cabability {
		ExtentReports extent;
		ExtentTest logger;
		
		
			AndroidDriver<AndroidElement> driver;
			@BeforeTest
			  public void Before() {
			  extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/Ride.html",true);// try to save the html file on test-output
			  extent.loadConfig(new File(System.getProperty("user.dir")+"src/test/java/extent-config.xml"));// try to load config. on src/test/java		
		}
		
	  @Test   //Login
	  public void Login() throws MalformedURLException, InterruptedException {
		  driver=Ride();
		  logger=extent.startTest("Bangara Ride");//this indicates that logger will have a influence on the test
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[@text='ENGLISH']")).click();
		  logger.log(LogStatus.PASS, "Language Selected");
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/imageView_arrow")).click();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[@text='Search...']")).sendKeys("Ind");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@text='India (IN)']")).click();
		  
		
		  logger.log(LogStatus.PASS, "Country Seleted");
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[@text='Enter your mobile number']")).sendKeys("8976543245");
		  logger.log(LogStatus.PASS, "Mobile Number Accepted");
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/imgNext")).click();
		  logger.log(LogStatus.PASS, "Navigate To HomePage");
		  
		  
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  driver.findElements(MobileBy.id("com.forbinary.banjararide:id/edtInputProfile")).get(0).sendKeys("pooja");
		  logger.log(LogStatus.PASS, "Name Entered ");
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElements(MobileBy.id("com.forbinary.banjararide:id/edtInputProfile")).get(1).sendKeys("poojadayalan@gmail.com");
		  logger.log(LogStatus.PASS, "EmailId Entered");
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElements(MobileBy.id("com.forbinary.banjararide:id/edtInputProfile")).get(2).sendKeys("pudupettai village");
		  logger.log(LogStatus.PASS, "Address Entered");
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElements(MobileBy.id("com.forbinary.banjararide:id/edtInputProfile")).get(3).sendKeys("");
		  logger.log(LogStatus.PASS, "AadharNumber Entered");
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElements(MobileBy.id("com.forbinary.banjararide:id/edtInputProfile")).get(4).sendKeys("8976453678");
		  logger.log(LogStatus.PASS, "MobileNumber Entered");
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[@text='SUBMIT']")).click();
		  logger.log(LogStatus.PASS,"Submit Successfully");
	  }
	  
	  private AndroidDriver<AndroidElement> Ride() {
		// TODO Auto-generated method stub
		return null;
	}

	{ 
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[@text='BOOK NOW']")).click();
		  logger.log(LogStatus.PASS, "Book Now Is Selected");
		
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[@text='Hire Bike']")).click();
		  logger.log(LogStatus.PASS, "HireBike IS Selected");
		 
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[@text='CB Hornet 160R']")).click();
		  logger.log(LogStatus.PASS, "Bike Is Selected");
		
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[@text='Book Now']")).click();
		  logger.log(LogStatus.PASS, "Book Now Is Selected");
		 
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/llDateContainer")).click();
		  logger.log(LogStatus.PASS, "Calendar Is Selected");
		 
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElement(MobileBy.AccessibilityId("Next month")).click();
		  logger.log(LogStatus.PASS, "Change To Next Month Is Done");
		 
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[@text='1']")).click();
		  logger.log(LogStatus.PASS, "FEB 1 Is Selected");
		  //And Click OK
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[@text='OK']")).click();
		  logger.log(LogStatus.PASS, "Click OK ");  
		  //Navigate To HomePage
		 
		  driver.navigate().back();
		 
		  driver.navigate().back();
		  
		  driver.navigate().back(); 
		  logger.log(LogStatus.PASS, "Go Back To HomePage");
		  
	  
		  //Open left Top Menu
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  driver.findElement(MobileBy.AccessibilityId("Open")).click();
		  logger.log(LogStatus.PASS, "Side Menu Will Open"); 
		  //Click Bookings
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[@text='Bookings']")).click();
		  logger.log(LogStatus.PASS, "Bookings Selected");
		  //Click The Search Icon
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/search_button")).click();
		  logger.log(LogStatus.PASS, "SearchIcon Selected");
		 
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[@text='Search']")).sendKeys("Activa");
		  logger.log(LogStatus.PASS, "Activa Scooter Is Displayed");  
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElement(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‎‏‏‎‎‏‏‎‎‏‏‏‎‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‏‎‏‎‎‏‎‎‎‎‏‎‎‎‏‏‎‏‏‏‏‎‎‎‎‎‎‎‎‎‎‏‎‎‏‎Clear query‎‏‎‎‏‎\"]")).click();
		  
		  driver.findElement(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‎‏‏‎‎‏‏‎‎‏‏‏‎‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‏‎‏‎‎‏‎‎‎‎‏‎‎‎‏‏‎‏‏‏‏‎‎‎‎‎‎‎‎‎‎‏‎‎‏‎Clear query‎‏‎‎‏‎\"]")).click();
		  logger.log(LogStatus.PASS, "Pressed 'X' Successfully");
		 
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElement(MobileBy.xpath("//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎\"]")).click();
		  logger.log(LogStatus.PASS, "Go Back To Home Page");
	  
		
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Call Us\"))").click();
		  logger.log(LogStatus.PASS, "Clicking Call Us");
		  
		 
		  driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		 
		  driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
	  }
	

		@AfterTest
		 public void End() throws InterruptedException {
			 
		 
		  extent.endTest(logger);// end the logger functions
		  extent.flush();//it will flush the all logger data on html report
		  extent.close();// it will give end to the reports
		  Thread.sleep(5000);
		  driver.closeApp();
		}
		}
		
		 		


	  
	

 

