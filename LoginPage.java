package PageRepository;

import org.openqa.selenium.By;

import BusinessFuction.BaseClass;

public class LoginPage extends BaseClass {
	
	//static WebDriver driver=null;
	
	static By Email=By.name("LEmail");
	static By password=By.name("LPwd");
	static By loginbtn=By.id("LBtn");
	
	static public void enterUserName() {

		driver.findElement(Email).sendKeys("admin123@gmail.com");
	  

	}
	
	static public void enterpPassword() {
		  driver.findElement(password).sendKeys("Laukik@12");
	}
	
	static public void clickonLoginButn() {
		driver.findElement(loginbtn).click();
	}
	}
