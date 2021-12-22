package srp_AbstractComponenets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class AbstractComponents {
	WebElement footerSectionElement;
	
   // creating custom methods
	public WebElement findElement(By findElementBy) 
	{	
		return footerSectionElement.findElement(findElementBy);
	}
	
	public AbstractComponents(WebDriver driver, By footerSectionElement) {
		this.footerSectionElement = driver.findElement(footerSectionElement);
		
	}
	
	
}
