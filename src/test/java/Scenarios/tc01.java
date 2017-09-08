package Scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class tc01 {
	private static WebDriver driver = null;
	@Test
    public void test() {
		System.out.println("ok");
    	System.setProperty("webdriver.gecko.driver","E:\\Download\\Appium\\geckodriver\\least_vr\\geckodriver.exe");
        // Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
 
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        //Launch the facebook
        driver.get("http://kientructrinhgia.vn/tinh-gia/");
        System.out.println("ok");
 
        driver.findElement(By.xpath(".//input[@id='dientichdat']")).sendKeys("enter");
        System.out.println(" Login Successfully.");
 
      driver.quit();
	    //
            }
       
}
