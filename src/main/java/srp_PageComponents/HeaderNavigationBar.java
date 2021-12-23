package srp_PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import srp_AbstractComponenets.AbstractComponents;

public class HeaderNavigationBar extends AbstractComponents{
      WebDriver _driver;
	
	// locators of header elements
	
    By hotelsLink = By.xpath("//a[contains(text(),'Hotels')]");	
	
	// methods to handle header elements
	public void selectHotels() {
		findElement(hotelsLink).click();
	}
	
	
	public HeaderNavigationBar(WebDriver driver, By headerSectionElement) {
		super(driver,headerSectionElement );  // invoking parent class constructor 
	}
	

}

