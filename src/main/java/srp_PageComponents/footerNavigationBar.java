package srp_PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import srp_AbstractComponenets.AbstractComponents;

public class footerNavigationBar extends AbstractComponents {
	 WebDriver _driver;
	
	// locators of footer elements

	By domesticHotels = By.xpath("//a[contains(text(),'Domestic Hotels')]");
	
		
	// methods to handle footer elements
	
	// methods to handle header elements
		public void selectdomesticHotels() {
			findElement(domesticHotels).click();
		//	_driver.findElement(domesticHotels).click();
		}
		
		public footerNavigationBar(WebDriver driver, By footerSectionElement) {
			super(driver,footerSectionElement );  // invoking parent class constructor 
		}
	

}
