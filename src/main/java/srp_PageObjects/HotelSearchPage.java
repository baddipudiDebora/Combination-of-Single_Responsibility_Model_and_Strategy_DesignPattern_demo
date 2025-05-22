package srp_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import srp_PageComponents.HeaderNavigationBar;
import srp_PageComponents.SearchHotelsBlock;
import srp_PageComponents.footerNavigationBar;


public class HotelSearchPage {
	WebDriver driver;
	// to access navigation bar locators and methods of different section of this particular page
        By headerSectionElement = By.xpath("//header[@class='happy-gi-header gi-special-theme-left header-sticky']");
		By SearchHotelsBlock = By.className("fsTdCE");
		By footerSectionElement = By.xpath("//footer[@class='happy-gi-footer']");
		// to access header bar locators and methods 
	public HeaderNavigationBar getNavigationBar() 
	{
		return new HeaderNavigationBar(driver, headerSectionElement);
	}
	
	// to access footer bar locators and methods 
	public footerNavigationBar getFooterBar() 
	{
		return new footerNavigationBar(driver, footerSectionElement);
	}
	// to access hotels search block locators and methods
	 public SearchHotelsBlock getSearchHotelsBlock() throws InterruptedException {
		 Thread.sleep(3000);
		 System.out.println("hi this is inside getSearchHotelsBlock()");
		 return new SearchHotelsBlock(driver, SearchHotelsBlock);
	 }

	 // constructor 
	 public HotelSearchPage(WebDriver driver) {
	    	// current page class variable is set to driver coming from Test class
	    	this.driver=driver;
	    }

	
	
}
