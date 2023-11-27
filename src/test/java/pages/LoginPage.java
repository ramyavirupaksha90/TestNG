package pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	public void LoginFunction(String UserNameVal,String PwdVal) {
		
		// click on the login link
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();

		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(UserNameVal);

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(PwdVal);

		WebElement rememberMe = driver.findElement(By.id("remember-me"));
		rememberMe.click();

		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		LoginBtn.click();
	}


}
