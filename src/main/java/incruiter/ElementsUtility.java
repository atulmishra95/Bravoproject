package incruiter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsUtility {
WebDriver driver;
	
	public ElementsUtility(WebDriver driver) {
		this.driver=driver;
		
	}
	public WebElement getElement(By locator) {
		WebElement element=driver.findElement(locator);
		return element;
		}
	public void dosendkeys(By locator,String value) {
		getElement(locator).sendKeys(value);
		
	}
	public void doclick(By locator) {
		getElement(locator).click();
	}

}
