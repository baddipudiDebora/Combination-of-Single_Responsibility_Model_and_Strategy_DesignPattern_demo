package demo.display.Single_Responsibility_DesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.goibibo.pages.HotelSearchPage;
import com.goibibo.pages.HotelsViewPage;
import com.goibibo.pages.PaymentPage;
import com.goibibo.pages.ProceedtoPaymentPage;
import com.goibibo.pages.SingleHotelsViewPage;

import srp_PageObjects.LandingPage;

public class SenarioOneTest  {
	
	
	//Senario 1 --> Search a hotel for one adult and log the hotel's name in TestNG
	@Test(priority = 1)
	public void hotelSearchandView() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		LandingPage lp = new LandingPage(driver);
		
		
		lp.loadLandingPage();
		lp.getNavigationBar().selectHotels();
		 HotelSearchPage hotelBookingPageobj = new HotelSearchPage(driver);
		 try {
			hotelBookingPageobj.enterHotels("Ooty");
			hotelBookingPageobj.enterNumofGuest();
			hotelBookingPageobj.clickOnSearch();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
       
		
	}

}
