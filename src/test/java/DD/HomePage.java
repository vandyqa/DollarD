package DD;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jdk.internal.org.jline.utils.Log;
import resources.UtilityBase;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.FormMyAddressBook;
import pageObjects.LandingPage;
import pageObjects.SignInPage;
import pageObjects.MyAddressBook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class HomePage extends  UtilityBase {
	
	public   static Logger log = LogManager.getLogger(UtilityBase.class.getName());         //logger path

@BeforeTest

public void initialize() throws IOException{

driver=	initializeDriver();
//	driver.navigate().to("http://www.dollardays.com");
log.info("Driver is initialized");                                                       //log info about the driver

}

	@Test(dataProvider ="getData")
public void basePageNavigation(String Username,String Password, String text) throws IOException         //one method is inheritance
				{
		    driver.get(prop.getProperty("url"));
			LandingPage lp= new LandingPage(driver);   
			//another method is creating object to that class and invoke methods of it
			log.info("Website is opened");                            //log info webiste is launched 
			
			
			lp.getLogin() . click();  //driver.findElement(By.xpath - click on signin drop down
			lp.signinclick().click(); //driver.findElement(By.xpath - click on sign in again
			
			log.info("Clicked on sign");     
			
		//methods calling from sign in page		
		SignInPage sp = new SignInPage(driver);    //creating an object with the class already created which is SignInPage and initializing driver with it
		sp.getemail().sendKeys(Username); //sending values in email field
		sp.getpassword().sendKeys(Password);  //sending values in password field
			//System.out.println(text);
		
		log.info("Entered the credentials to sign in");     //credentials to sign in
      
		sp.hitsigninbutton().click();  // clicking signin button
		
		log.info("Clicked on sign in button");     
       
     //methods calling from My address Book page
       MyAddressBook mab=new MyAddressBook(driver);
		mab.AddressBookdropdown().click();
		mab.AddressBookselect().click();
		//mab.AddressBookclick().click();
		mab.AddressBookaddaddress().click();
		log.info("Clicked on Address book ");     
		
		 
				}	
	
			
					
			@DataProvider
			public Object[][] getData( )   //Writing test data for test cases
			{
				// Row stands for how many different data types test should run
				//column stands for how many values per each test
				//Array size is 5 - 0,1,2,3,4
				//Object[][] data = new Object[2][3]; //This is the array size which is 2 in this case but values are 0,1 and we are passing three values/parameters
				
				Object[][] data = new Object[1][3]; 
				
				//0th row
			     data[0][0]="srikanthtesting100@gmail.com";
			     data[0][1]="password123";
			     data[0][2] ="User successfully logged in";
			     
			    
			     //1st row
			 /*   data[1][0]="123abc";
				 data[1][1]="1qwert2";
			 data[1][2]="Some Error";*/
				 
				 return data;
			  
							
		}
			 		
			      		
					
				@AfterTest
			public void teardown()
		{
			driver.close();
		}
	
	
}