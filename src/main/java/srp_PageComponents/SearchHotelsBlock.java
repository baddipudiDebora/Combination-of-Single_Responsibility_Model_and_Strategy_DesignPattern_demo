package srp_PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import srp_AbstractComponenets.AbstractComponents;

public class SearchHotelsBlock extends AbstractComponents {
	 WebDriver _driver;
	
	// locators within the Search Hotels block elements
	// HotelSearchtextbox
		By hotelSearchtextbox = By.id("downshift-1-input");
		
		// checkInDatebutton
		By checkInDatebutton = By.xpath("//div[contains(text(),'Check-in')]");

		// checkInDatetoEnter
		By checkInDatetoEnter = By.xpath("// span[contains(text(),'25')]");
		
		// checkOutDatebutton
		By checkOutDatebutton = By.xpath("//div[contains(text(),'Check-out')]");

		// checkOutDatetoEnter
		By checkOutDatetoEnter = By.xpath("// span[contains(text(),'29')]");

		// numberofGuestButton
		By numberofGuestButton = By.xpath("//input[@value='2 Guests in 1 Room ']");
		
		// minusnumberofGuestButton
		By minusnumberofGuestButton = By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[4]/div/div/div/div[2]/div/span[1]");
		
		// doneButtonNumGuest
		By doneButtonNumGuest = By.xpath("//button[contains(text(),'Done')]");

		// search button
		By searchbutton = By.xpath("//button[contains(text(),'Search Hotels')]");
	
		// constructor
		public SearchHotelsBlock(WebDriver driver, By SearchHotelsBlock) {
			super(driver,SearchHotelsBlock );  // invoking parent class constructor 
		}
	
	// methods to actions of search hotel 
		public void enterHotels(String Hotels) throws InterruptedException {
			findElement(hotelSearchtextbox).sendKeys(Hotels);
			Thread.sleep(2000);
			findElement(hotelSearchtextbox).sendKeys(Keys.ARROW_DOWN);
			findElement(hotelSearchtextbox).sendKeys(Keys.ENTER);
		}

		public void enterCheckInDate() throws InterruptedException {
		findElement(checkInDatebutton).click();
		findElement(checkInDatetoEnter).click();
			Thread.sleep(2000);
		}

		public void enterCheckOutDate() throws InterruptedException {
			
		findElement(checkOutDatebutton).click();
			Thread.sleep(3000);
		findElement(checkOutDatetoEnter).click();
		}

		public void enterNumofGuest() throws InterruptedException {
		findElement(numberofGuestButton).click();
		findElement(minusnumberofGuestButton).click();
		findElement(doneButtonNumGuest).click();

		}

		public void clickOnSearch() {
		findElement(searchbutton).click();
		}

}
