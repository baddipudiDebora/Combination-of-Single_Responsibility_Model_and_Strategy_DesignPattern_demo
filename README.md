# Single_Responsibility_Principle_DesignPattern_Demo
## need of Single Responsibililty Model 
> Every Page class has its duty to redirect to its page componenets, each page components (header , footer, filters .... ) have single responsibility
> SRP helps develop a write code that are decoupled when each class has its own job, which we have seen and encapsulate responsibilities to other classes.
> So if there are any changes in the future on Header navigation bar on the header, so if there would be any changes on header tab, so that will impact only the methods present in this class.
> header navigation component class. So if you want to perform any regression, you can perform around these methods only. This is completely separate class.

## Structure of the Design
### AbstractComponenets Page where we can create our own custom methods like findElement();
### Page Object Class
### SectionComponents class like HeaderNavigation Bar, FooterComponent , filtersComponenet
### Test Class

## Flow of Execution
> From the Test class, where we create object of PageClass like LandingPage. 
> then using the object of PageClass we access the component class which is extends AbstractComponents and use our custom method findElement to limit the scope within that component.
### example
> in the ** Test Class ** we create Object of the each needed pageClass and pass a driver object 
>  HotelSearchPage hotelSearchPage =	  new HotelSearchPage(driver); 
>	 // accessing the component class methods under the hotelSearchPage Page object class. 
> // *** hotelSearchPage.getSearchHotelsBlock() *** returns the webelement of the compnent using the Page Class. while *** .enterHotels("Ooty"); *** is from the Component class. 
>  hotelSearchPage.getSearchHotelsBlock().enterHotels("Ooty");

> in the ** Page Class **
>   // locator particular section of the page , like filters section, Header , footer .....
> 	By SearchHotelsBlock = By.xpath("//div[@class='SearchBlockUIstyles__AutoSuggestInnerWrap-sc-fity7j-1 emHEpq']");
>  	// to access hotels search block locators and methods. This method returns the driver passed from the TestClass and the WebElement of the Component
>	 public SearchHotelsBlock getSearchHotelsBlock()
>	 {
>		 return new SearchHotelsBlock(driver, SearchHotelsBlock);
>	 }

> in the ** component class ** which extends form the AbstractComponents class
>// locators within the Search Hotels block elements
>// HotelSearchtextbox
>		By hotelSearchtextbox = By.id("downshift-1-input");
>   public void enterHotels(String Hotels)
>   { // as the component class extends from the AbstractComponents  class we can use our custome findElement whose scope os limited to that component instead of driver.findElement whose scope is the complete page.
>			findElement(hotelSearchtextbox).sendKeys(Hotels)
>     }

> in the ** AbstractComponents class **
>	WebElement SectionElement;
>   // creating custom methods
>	public WebElement findElement(By findElementBy) 
>	{	
>		return SectionElement.findElement(findElementBy);
>	}
>	
>	public AbstractComponents(WebDriver driver, By footerSectionElement) {
>		this.SectionElement = driver.findElement(footerSectionElement);
>	}
	

		




