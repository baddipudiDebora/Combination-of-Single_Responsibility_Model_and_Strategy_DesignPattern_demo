package srp_PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import srp_AbstractComponenets.AbstractComponents;

public class SearchHotelsBlock extends AbstractComponents {
	 WebDriver _driver;
	
	// locators within the Search Hotels block elements

	   By hotelSearchBlock = By.className("fsTdCE");

	// HotelSearchtextbox
		By hotelSearchtextbox = By.xpath("//input[contains(@id,'downshift-')]");
		
		// checkInDatebutton
		By checkInDatebutton = By.id("search-widget-checkin-input");

		// checkInDatetoEnter
		By checkInDatetoEnter = By.xpath("// span[contains(text(),'25')]");
		
		// checkOutDatebutton
		By checkOutDatebutton = By.xpath("(//input[@placeholder='Travel Dates'])[2]");

		// checkOutDatetoEnter
		By checkOutDatetoEnter = By.xpath("// span[contains(text(),'29')]");

		// numberofGuestButton
		By numberofGuestButton = By.xpath("(//input[@class='SearchWidgetUIstyles__SearchInputStyle-sc-1x37qbj-6 kNWLrS'])[3]");
		
		// minusnumberofGuestButton
		By minusnumberofGuestButton = By.xpath("//span[@data-testid='button-room-add']");
		
		// doneButtonNumGuest
		By doneButtonNumGuest = By.xpath("//button[contains(text(),'Done')]");

		// search button
		By searchbutton = By.xpath("//button[contains(text(),'Update Search')]");
	
		// constructor
		public SearchHotelsBlock(WebDriver driver, By SearchHotelsBlock) {
			super(driver,SearchHotelsBlock );  // invoking parent class constructor
		}
	
	   // methods to actions of search hotel
		public void enterHotels(String Hotels) throws InterruptedException {
			System.out.println("Hi i am searching inside hotel block "+hotelSearchBlock.toString());
			findElement(hotelSearchtextbox).click();
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
