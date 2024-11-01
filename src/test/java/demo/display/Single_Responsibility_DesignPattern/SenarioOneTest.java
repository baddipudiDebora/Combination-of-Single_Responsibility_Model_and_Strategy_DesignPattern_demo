package demo.display.Single_Responsibility_DesignPattern;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
        //Create chrome driver object
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();

        LandingPage lp = new LandingPage(driver);

        lp.loadLandingPage();
        Thread.sleep(3000);
        lp.closePopUp();
        lp.getFooterBar().selectdomesticHotels().click();


        lp.getNavigationBar().selectHotels();

        // accessing the Page object of Hotels search page
        HotelSearchPage hotelSearchPage = new HotelSearchPage(driver);
        try {
            // accessing the component class methods under the hotelSearchPage Page object class
            hotelSearchPage.getSearchHotelsBlock().enterHotels("Chennai");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(4000));
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'icClose')]")));

            driver.findElement(By.xpath("//span[contains(@class,'icClose')]")).click();
         //   hotelSearchPage.getSearchHotelsBlock().enterNumofGuest();
            hotelSearchPage.getSearchHotelsBlock().clickOnSearch();
        } catch (InterruptedException e) { // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}
