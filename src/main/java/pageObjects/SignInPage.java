package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
	
	public WebDriver driver;
 By email =	By.name("username");
 By password = By.name("password");
 By hitsignin = By.className("btn");
 
 public SignInPage() {
	 this.driver = driver;
 }
 
 //public SignInPage(WebDriver driver2) {
	// TODO Auto-generated constructor stub
//}

 public SignInPage(WebDriver driver) { //initializing constructor
	 this.driver = driver;
 }
public WebElement getemail()  //clicking on email
 {
	 return driver.findElement(email);
 }
 
 public WebElement getpassword()  //clicking on password
 {
	 return driver.findElement(password);
 }
 
 public WebElement hitsigninbutton()
 {
	 return driver.findElement(hitsignin);
 }
 
}