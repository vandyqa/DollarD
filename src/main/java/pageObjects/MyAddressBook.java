package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class MyAddressBook {
	
public WebDriver driver;
		
 By addressbook = By.xpath("/html/body/form/header/div/div/div/div[3]/div/ul/li[1]/a/img"); //x path for drop down
 //By addressbookclick = By.className("dropdown-item");
 
By addressbookclick = By.xpath("/html/body/form/header/div/div/div/div[3]/div/ul/li[1]/ul/li[7]/a"); // x path for address book
By addressbookaddaddress= By.xpath("/html/body/form/div[5]/div[1]/section/div/div[3]/div/div[2]/div/section/div[1]/div/a/div/h5");// x path for add a new ship to address
 
	 public MyAddressBook(WebDriver driver) 
		{
		this.driver=driver;
		}
	 
	 		 public WebElement AddressBookdropdown()
 {
	 
		return driver.findElement(addressbook);
		 
 }
		 
		 public  WebElement  AddressBookselect() throws IOException
		 {
			 /*Select dropdown=new Select(driver.findElement(By.className("dropdown-item")));
				dropdown.selectByVisibleText("srikanth s.");
				//Thread.sleep(5000);
				dropdown.selectByIndex(6);
				dropdown.selectByValue("Address Book");
				//return driver.findElement(addressbook);*/
			 
				 return driver.findElement(addressbookclick); // click on Address Book from the drop down
		 }
		 
		public WebElement AddressBookaddaddress()
		 {
							return driver.findElement(addressbookaddaddress);
				 
		 }
	 
	 
	
}
