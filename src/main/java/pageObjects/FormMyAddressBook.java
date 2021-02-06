package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.IOException;

public class FormMyAddressBook{
	

public WebDriver driver;
	
// Text fields
 By FirstName=By.name("ctl00$cphContent$txtfirstname");
 By LastName=By.id("ctl00_cphContent_txtlastname");
By CompanyName=By.id("ctl00_cphContent_txtAddrshipcompany");
By StreetAddress= By.id("ctl00_cphContent_txtAddrshipaddr1");
By Apt =By.id("ctl00_cphContent_txtAddrshipaddr2");
By Country =By.id("ctl00_cphContent_ddlcountry");
By City =By.name("ctl00$cphContent$txtAddrshipcity");
By State=By.name("ctl00$cphContent$ddlshipstate");
By PhoneNumber =By.name("ctl00$cphContent$txtAddrshipphone");
By Ext=By.name("ctl00$cphContent$txtAddrshipphoneExt");
By zipcode =By.xpath("/html/body/form/div[5]/div[1]/section/div/div[3]/div/div[2]/div/section/div[2]/div/div[11]/div/input");

// Radio button locators
By CLWSD = By.xpath("/html/body/form/div[5]/div[1]/section/div/div[3]/div/div[2]/div/section/div[2]/div/div[12]/div/ul/li[1]/label");
By CLWOSD= By.xpath("/html/body/form/div[5]/div[1]/section/div/div[3]/div/div[2]/div/section/div[2]/div/div[12]/div/ul/li[2]/label");
By RL = By.xpath("/html/body/form/div[5]/div[1]/section/div/div[3]/div/div[2]/div/section/div[2]/div/div[12]/div/ul/li[3]/label");

//Hit Save changes
By SaveChanges = By.xpath("/html/body/form/div[5]/div[1]/section/div/div[3]/div/div[2]/div/section/div[2]/div/div[13]/input[1]");
By TitleSaveChanges = By.xpath("/html/body/form/div[5]/div[1]/section/div/div[3]/div/div[2]/div/div");

 
 //public SignInPage(WebDriver driver2) {
	// TODO Auto-generated constructor stub
//}
 public FormMyAddressBook(WebDriver driver) { //initializing constructor
	 this.driver = driver;
 }
public WebElement getFirstName()  //clicking on FirstName
 {
	//System.out.println("Hello");
	return driver.findElement(FirstName);
	 //return driver.findElement( By.xpath("/html/body/form/div[5]/div[1]/section/div/div[3]/div/div[2]/div/section/div[2]/div/div[1]/div/input"));
 }
 
 public WebElement getLastName() //Entering Last Name
 {
	 return driver.findElement(LastName);
 }
 
 public WebElement getCompanyName ()          //Entering Company Name
 {
	 return driver.findElement(CompanyName);
 }
 
 public WebElement getStreetAddress()      //Entering street Address
 {
	 return driver.findElement(StreetAddress);
 }
 
 public WebElement getApt()  //Entering apt Number
 {
	 return driver.findElement(Apt);
 }
 
 
 public WebElement getCountry()  //clicking on FirstName
 {
	 return driver.findElement(Country);
 }
 
 public WebElement getCity()  //Entering City
 {
	 return driver.findElement(City);
 }
 
 
 public WebElement getState()  //Entering State
 {
	 return driver.findElement(State);
 }
 
 public WebElement getPhoneNum()  //clicking on FirstName
 {
	 return driver.findElement(PhoneNumber);
 }
 
 public WebElement getExtension()  //clicking on FirstName
 {
	 return driver.findElement(Ext);
 }
 
 
 public WebElement getZipCode()  //clicking on FirstName
 {
	 return driver.findElement(zipcode);
  }
 
 public WebElement getClwsd()//Commercial location with shipping dock
  {
	 return driver.findElement(CLWSD);
 }
 
 public WebElement getClwosd()//Commercial location without shipping dock
 {
	 return driver.findElement(CLWOSD);
 }
 
 
 public WebElement getrl()//Residential Location
 {
	 return driver.findElement(RL);
 }
 
 public WebElement getSC()//Save Changes
 {
	 return driver.findElement(SaveChanges);
 }
 
 public WebElement getTitleSC ()//text after clicking on save changes
 {
	 return driver.findElement(TitleSaveChanges);
 }
 
}
 
 
 
 