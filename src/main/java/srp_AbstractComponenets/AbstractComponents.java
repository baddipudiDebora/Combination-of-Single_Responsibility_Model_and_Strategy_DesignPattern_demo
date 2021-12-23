package srp_AbstractComponenets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class AbstractComponents {
	WebElement SectionElement;
	
   // creating custom methods
	public WebElement findElement(By findElementBy) 
	{	
		return SectionElement.findElement(findElementBy);
	}
	
	public AbstractComponents(WebDriver driver, By footerSectionElement) {
		this.SectionElement = driver.findElement(footerSectionElement);
		
	}
	
	
}
