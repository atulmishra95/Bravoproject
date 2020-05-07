package incruiterLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import incruiter.ElementsUtility;

public class Login1 {
	static By username = By.xpath("//input[@name='email']");
	static By password = By.xpath("//input[@type='password']");
	static By interviewer = By.xpath("//span[text()='Interviewer']");
	static By login1 = By.id("navbarDropdown4");
	static By checkbox1 = By.xpath("//input[@name='remember']");
	static By log1 = By.xpath("//button[@class='login100-form-btn']");
	// static By continue1 = By.xpath("//button[@type='button' and
	// @class='swal2-confirm swal2-styled' ]");
	//static By updphoto = By.xpath("//div[@id='dZUpload']");
	static By name = By.xpath("//*[@id='input-username']");
	static By compname = By.xpath("//*[@name='company_name']");
	static By mobile = By.xpath("//*[@name='mobile']");
	static By postcode = By.xpath("//*[@name='postcode']");
	static By desig = By.xpath("//*[@name='designation']");
	static By quali = By.xpath("//*[@name='qualification']");
	static By certificate = By.xpath("//*[@name='certificate']");
	static By photoid = By.xpath("//*[@name='photo_id']");
	static By resume = By.xpath("//*[@name='resume']");
	static By expertise = By.xpath("//*[@name='area_of_expertise']");
	// static By
	// keywords=By.xpath("//div[@class='bootstrap-tagsinput']//input[@type='text']");
	static By submit = By.xpath("//*[@type='submit']");
	static By cont1 = By.xpath("//*[@class='swal2-confirm swal2-styled']");

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.silentOutput", "true");
		BrowserActions browsers = new BrowserActions();
		WebDriver driver = browsers.lauchBrowser("chrome");
		browsers.launchUrl("http://sheheryar.yourhirer.com");
		ElementsUtility login = new ElementsUtility(driver);
		// Thread.sleep(5000);
		login.doclick(login1);
		login.doclick(interviewer);
		Thread.sleep(5000);
		login.dosendkeys(username, "akm.elex0007@gmail.com");
		login.dosendkeys(password, "akm_8085");
		login.doclick(checkbox1);
		login.doclick(log1);
		// login.doclick(continue1);
		// login.doclick(updphoto);
		//login.dosendkeys(updphoto, "C:\\Users\\spunky\\Downloads\\atul1.jpeg");
		login.dosendkeys(name, "Atul");
		login.dosendkeys(compname, "ECIL");
		login.dosendkeys(mobile, "8085737837");
		Select selcountry = new Select(driver.findElement(By.id("sts")));
		selcountry.selectByVisibleText("Bihar");
		Select selcity = new Select(driver.findElement(By.id("state")));
		selcity.selectByVisibleText("Patna");
		login.dosendkeys(postcode, "845401");
		Select domain = new Select(driver.findElement(By.id("domain")));
		domain.selectByVisibleText("Legal");
		Select exp = new Select(driver.findElement(By.id("experience")));
		exp.selectByVisibleText("5");
		login.dosendkeys(desig, "QA");
		login.dosendkeys(quali, "BE");
		login.dosendkeys(certificate, "C:\\Users\\spunky\\Downloads\\Degree.pdf");
		login.dosendkeys(photoid, "C:\\Users\\spunky\\Downloads\\atul.jpeg");
		login.dosendkeys(resume, "C:\\Users\\spunky\\Downloads\\Resume.pdf");
		login.dosendkeys(expertise, "Qualifed Automation test engeineer");
		// login.dosendkeys(keywords, "java,selenium,Rest");
		login.doclick(submit);
		login.doclick(cont1);
	}
}