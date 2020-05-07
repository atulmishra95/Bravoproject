package incruiterLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginForm {

	public static void main(String[] args) throws InterruptedException {
		BrowserActions browsers=new BrowserActions();
		WebDriver driver=browsers.lauchBrowser("chrome");
		browsers.launchUrl("http://sheheryar.yourhirer.com");
		//Thread.sleep(5000);
		
		WebElement login=driver.findElement(By.id("navbarDropdown4"));
		doMoveToElement(driver, login);
		WebElement interviewer= driver.findElement(By.xpath("//span[text()='Interviewer']"));
		doMoveToElement(driver, interviewer);
		/*Actions action=new Actions(driver);
		action.moveToElement(login).build().perform();
		interviewer.click();*/
		doMoveToElement(driver, interviewer);
		interviewer.click();
		Thread.sleep(5000);
		
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("akm.elex0007@gmail.com");
		WebElement password1=driver.findElement(By.xpath("//input[@name='password']"));
		password1.sendKeys("akm_8085");
		WebElement click1=driver.findElement(By.xpath("//input[@type='checkbox']"));
		click1.click();
		WebElement click2=driver.findElement(By.xpath("//button[@class='login100-form-btn']"));
		click2.click();
		WebElement continue1= driver.findElement(By.xpath("//button[@type='button' and @class='swal2-confirm swal2-styled' ]"));
		doMoveToElement(driver,continue1);
		doMoveToElement(driver,continue1);
		continue1.click();
		WebElement uploadphoto=driver.findElement(By.xpath("//div[@id='dZUpload']"));
		doMoveToElement(driver,uploadphoto);
		doMoveToElement(driver,uploadphoto);
		uploadphoto.sendKeys("C:\\Users\\spunky\\Downloads\\atul1.jpeg");
		
	}
	public static void doMoveToElement(WebDriver driver,WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		
	}

}