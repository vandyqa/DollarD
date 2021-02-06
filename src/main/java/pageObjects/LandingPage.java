package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
public WebDriver driver; //giving x path for drop down signin and click on sign
 By dropdownsignin =	By.xpath("//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[1]/a/i");
 By signin = By.xpath("//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[1]/ul/li[2]/a");

  
 public LandingPage(WebDriver driver) {
	 this.driver = driver;
 }                                                   //initializing the driver
 
 public WebElement getLogin()
 {
	 return driver.findElement(dropdownsignin);
 }
 
 public WebElement signinclick()
 {
	 return driver.findElement(signin);
 }


	

	
}
