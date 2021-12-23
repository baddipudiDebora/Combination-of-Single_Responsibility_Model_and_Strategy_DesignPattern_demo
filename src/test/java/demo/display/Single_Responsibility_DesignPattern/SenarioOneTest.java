package demo.display.Single_Responsibility_DesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import srp_PageObjects.HotelSearchPage;
import srp_PageObjects.LandingPage;

public class SenarioOneTest {

	// Scenario 1 --> Search a hotel for one adult and log the hotel's name in TestNG
	@Test
	public void hotelSearchandView() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		LandingPage lp = new LandingPage(driver);

		lp.loadLandingPage();
		// lp.getFooterBar().selectdomesticHotels().click();

		
		  lp.getNavigationBar().selectHotels();
		  // accessing the Page object of Hotels search page
		  HotelSearchPage hotelSearchPage =	  new HotelSearchPage(driver); 
		  try
		  { 
		  // accessing the component class methods under the hotelSearchPage Page object class
		  hotelSearchPage.getSearchHotelsBlock().enterHotels("Ooty");
		  hotelSearchPage.getSearchHotelsBlock().enterNumofGuest(); 
		  hotelSearchPage.getSearchHotelsBlock().clickOnSearch();
		  }
		  catch (InterruptedException e)
		  { // TODO Auto-generated catch block
		  e.printStackTrace();
		  }
		 
		
		

	}
}
