package demo.display.Single_Responsibility_DesignPattern;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import srp_PageObjects.HotelSearchPage;
import srp_PageObjects.LandingPage;

import java.time.Duration;

public class SenarioOneTest {

    // Scenario 1 --> Search a hotel for one adult and log the hotel's name in TestNG
    @Test
    public void hotelSearchandView() throws InterruptedException {
       System.out.println("Hi inside Scenario1");
        
       ChromeOptions options = new ChromeOptions();
       options.addArguments("--user-data-dir=/tmp/chrome-user-data");
       options.addArguments("--headless");  // Optional: Run in headless mode
      options.addArguments("--disable-gpu");  // Optional: Disable GPU acceleration

       // Initialize ChromeDriver with these options
       WebDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(4000));
        WebDriverManager.chromedriver().setup();

        LandingPage lp = new LandingPage(driver);

        lp.loadLandingPage();
		  Thread.sleep(8000); 
	     System.out.println("waiting to close popup");
	    lp.closePopUp();
		  lp.getFooterBar().selectdomesticHotels().click();


		  lp.getNavigationBar().selectHotels();
        try {
        	System.out.println("Pass");
        }
        catch (Exception e) {
			System.out.println("Fail");
		}


		  // accessing the Page object of Hotels search page
		HotelSearchPage hotelSearchPage = new HotelSearchPage(driver);
		Thread.sleep(8000);
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[2]/span/span")).click();
		 try
		 {
          Thread.sleep(4000);
	//	  driver.findElement(By.id("downshift-1-input")).click();
			 // accessing the component class methods under the hotelSearchPage Page object class
		  hotelSearchPage.getSearchHotelsBlock().enterHotels("Goa");
          hotelSearchPage.getSearchHotelsBlock().enterCheckInDate();
			 hotelSearchPage.getSearchHotelsBlock().enterCheckOutDate();
//
//		  WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
//		  "//span[contains(@class,'icClose')]")));
//
 //		 driver.findElement(By.xpath("//span[contains(@class,'icClose')]")).click();
		  hotelSearchPage.getSearchHotelsBlock().enterNumofGuest();
		  hotelSearchPage.getSearchHotelsBlock().clickOnSearch();

		 }

		 catch (InterruptedException e) { // TODO Auto-generated catch block
		  e.printStackTrace(); }


		driver.quit();
    }
}
