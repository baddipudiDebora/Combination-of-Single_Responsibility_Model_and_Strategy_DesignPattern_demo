package srp_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import srp_AbstractComponenets.Constants;
import srp_PageComponents.HeaderNavigationBar;
import srp_PageComponents.footerNavigationBar;

public class LandingPage {
    WebDriver driver;
    // to access navigation bar locators and methods of different section of this particular page
    By footerSectionElement = By.xpath("//footer[@class='happy-gi-footer']");
    By headerSectionElement = By.xpath("//header[@data-id='dweb-header-root']");
    By landingPagePopUp = By.xpath("//span[@role='presentation']");

    public HeaderNavigationBar getNavigationBar() {
        return new HeaderNavigationBar(driver, headerSectionElement);
    }

    // to access footer bar locators and methods
    public footerNavigationBar getFooterBar() {
        return new footerNavigationBar(driver, footerSectionElement);
    }

    public void loadLandingPage() {
        System.out.println("inside landing page class");
        driver.get(Constants.testsiteurl);
        driver.manage().window().maximize();
    }

    public LandingPage(WebDriver driver) {
        // current page class, class variable is set to driver coming from Test class
        this.driver = driver;
    }

    public void closePopUp(){
        driver.findElement(landingPagePopUp).click();
    }

}
