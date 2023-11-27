package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;


public class LoginTest extends BaseClass {


	@Test
	public void LoginFailiureTest() {
		
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("abc@xyz.com","Anc@1234");
		
		WebElement errorMessage = driver.findElement(By.className("error_msg"));
		System.out.println("The error message is " + errorMessage.getText());
		
		String actMsg = errorMessage.getText();
		String expMsg = "The email or password you have entered is invalid.";
		Assert.assertEquals(actMsg,expMsg);
		
		
	}
	
	@Test
	public void LoginSuccessTest() {
		
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("real@abc.com","RealPwd@1234");
		

		
	}	

}
