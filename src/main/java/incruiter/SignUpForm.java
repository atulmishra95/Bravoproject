package incruiter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
public class SignUpForm {
	static By companyname= By.xpath("//input[@name='company_name']");
	static By websiteurl=By.xpath("//input[@name='website']");
	static By mobile= By.xpath("//input[@name='mobile']");
	static By comaddres=By.xpath("//input[@name='company_address']");
	static By postcode= By.xpath("//input[@name='postcode']");
	static By personname=By.xpath("//input[@name='contact_person_name']");
	static By email= By.xpath("//input[@name='email']");
	static By password=By.xpath("//input[@name='password']");
	static By confirmpass=By.xpath("//input[@name='password_confirmation']");
	static By speaiclsector=By.xpath("//input[@value='Aerospace']");
	static By bussiness =By.id("both");
	static By staff=By.xpath("//input[@name='staff']");
	static By office=By.xpath("//input[@name='office']");
	static By placement=By.xpath("//input[@name='placement']");
	static By acceptpolicy=By.xpath("//input[@name='privacy']");
	static By acceptterms=By.xpath("//input[@name='terms']");
	static By registerbutton=By.xpath("//button[@class='login100-form-btn']");
	
		public static void main(String[] args){
		BrowserActions browsers=new BrowserActions();
		WebDriver driver=browsers.lauchBrowser("chrome");
		browsers.launchUrl("http://sheheryar.yourhirer.com/recruiter/signup");
		ElementsUtility signup=new ElementsUtility(driver);
		signup.dosendkeys(companyname, "Recruiter agency");
		signup.dosendkeys(websiteurl, "http://sheheryar.yourhirer.com/recruiter");
		signup.dosendkeys(mobile, "989898989");
		signup.dosendkeys(comaddres, "33/1 BTM,Bangalore");
		Select selcountry= new Select(driver.findElement(By.id("sts")));
		selcountry.selectByVisibleText("Karnataka");
		//Thread.sleep(3000);
		Select selcity= new Select(driver.findElement(By.id("state")));
		selcity.selectByVisibleText("Bangalore");
		signup.dosendkeys(postcode, "560068");
		signup.dosendkeys(personname, "Bravo");
		signup.dosendkeys(email, "test12@gmail.com");
		//Asserts asert1=new Asserts()
		//Assert.assertEquals(test12@gmail.com,test123@gmail.çom)
		
		signup.dosendkeys(password, "123456");
		signup.dosendkeys(confirmpass, "123456");
		signup.doclick(speaiclsector);
		signup.doclick(bussiness);
		signup.dosendkeys(staff, "2");
		signup.dosendkeys(office, "3");
		signup.dosendkeys(placement, "5");
		signup.doclick(acceptpolicy);
		signup.doclick(acceptterms);
		signup.doclick(registerbutton);
	}

}
