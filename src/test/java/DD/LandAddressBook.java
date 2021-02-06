package DD;

    	import org.testng.annotations.DataProvider;

		import org.testng.annotations.Test;
		import resources.UtilityBase;
		import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import java.io.IOException;
import pageObjects.FormMyAddressBook;
import pageObjects.LandingPage;
		import pageObjects.SignInPage;
		import pageObjects.MyAddressBook;
		import org.testng.annotations.AfterTest;
		import org.testng.annotations.BeforeTest;
		


		public class LandAddressBook extends  UtilityBase {
		
			public   static Logger log = LogManager.getLogger(UtilityBase.class.getName());   
			
			public WebDriver driver;

		@BeforeTest

		public void initialize() throws IOException{

		driver=	initializeDriver();
//			driver.navigate().to("http://www.dollardays.com");
			driver.get(prop.getProperty("url"));
		}

			@Test(dataProvider ="getData" ,priority =1)
					
		public void basePageNavigation(String Username,String Password, String text) throws IOException         //one method is inheritance
						{
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
										
					LandingPage lp= new LandingPage(driver);   
					//another method is creating object to that class and invoke methods of it
					 
					lp.getLogin() . click();  //driver.findElement(By.xpath - click on signin drop down
					lp.signinclick().click(); //driver.findElement(By.xpath - click on sign in again
					log.info("successful login");
					
				//methods calling from sign in page		
				SignInPage sp = new SignInPage(driver);    //creating an object with the class already created which is SignInPage and initializing driver with it
				sp.getemail().sendKeys(Username); //sending values in email field
				sp.getpassword().sendKeys(Password);  //sending values in password field
					//System.out.println(text);
		       sp.hitsigninbutton().click();  // clicking signin button
		       
						}
		      
			@Test (priority=2)
			public void myaddressbookdropdown() throws IOException 
		       {
		       //methods calling from My address Book page
		       MyAddressBook mab=new MyAddressBook(driver);
				mab.AddressBookdropdown().click();
				mab.AddressBookselect().click();
				//mab.AddressBookclick().click();
				mab.AddressBookaddaddress().click();
			
						}
			
			
			// Form begins for myAddress book
			@Test(dataProvider ="getdata1" ,priority=3)
			public void FormMyAddressBook(String Firstname,String LastName, String companyName, String StreetAdd, String Apt, String Country, String city, String State, String Phonenum,String Ext, String Zipcode) throws IOException         //one method is inheritance
		
			{
			//	String enableRadioButton ="enabled";
			//	String disableRadioButton ="disable";

			     //methods calling from FormMyAddressBookpage
			       FormMyAddressBook fmab=new FormMyAddressBook(driver);
			       fmab.getFirstName().sendKeys(Firstname);
			       fmab.getLastName().sendKeys(LastName);
			       fmab.getCompanyName().sendKeys(companyName);
			       fmab.getStreetAddress().sendKeys(StreetAdd);
			       fmab.getApt().sendKeys(Apt);
			       fmab.getCountry().sendKeys(Country);
			       fmab.getCity().sendKeys(city);
			       fmab.getState().sendKeys(State);
			       fmab.getPhoneNum().sendKeys(Phonenum);
			       fmab.getExtension().sendKeys(Ext);
			       fmab.getZipCode().sendKeys(Zipcode);
			       
		// methods calling for radio buttons from FormMyAddressBook
			     //  fmab.getClwsd().click();
			       //System.out.println("The output of the Isselected is " +driver.findElement(By.xpath( "/html/body/div[3]/div[1]/div[3]/div/table/tbody/tr[5]/td/label[1]/span")).isSelected());
			   	
			       //System.out.println("The output of the Isenabled is " +driver.findElement(By.xpath( "/html/body/div[3]/div[1]/div[3]/div/table/tbody/tr[5]/td/label[1]/span")).isEnabled());
			      // System.out.println("The output of the isdisplayed is " +driver.findElement(By.xpath( "/html/body/div[3]/div[1]/div[3]/div/table/tbody/tr[5]/td/label[1]/span")).isDisplayed());
			      // System.out.println("The output of the Isselected is "  +fmab.getClwsd().isSelected());
			      //   System.out.println("The output of the Isenabled is " +fmab.getClwsd().isEnabled());
			   //    System.out.println("The output of the isdisplayed is " +fmab.getClwsd().isDisplayed());
			       
			  //    fmab.getClwsd().enableRadioButton.click();
			      //enableRadioButton.click();
			//  fmab.getClwsd()=Webdriver1.findElement(By.xpath("/html/body/form/div[5]/div[1]/section/div/div[3]/div/div[2]/div/section/div[2]/div/div[12]/div/ul/li[1]/label\"));"
			  		fmab.getClwsd().click();
			  		fmab.getClwosd().click();
			  		fmab.getrl().click();
			  		
			  		//Hit Save Changes
			  		fmab.getSC().click();
			  		
			  		
			  		
	  	         
			}
			  		@Test(priority =4)
			  		public void ValidateSaveChanges() throws IOException
			  		{
			  			
			  			
			  		/*	 FormMyAddressBook fmab=new FormMyAddressBook(driver);
			  			 try {
			  			
			  		//compare the text from the browser with actual value...Error
			  		Assert.assertEquals(fmab.getTitleSC().getText(), "Address book form has been created");
			  		//fmab.getTitleSC().getText(), "Address book page has been created"); //Validate title for save changes
			  			 }catch(AssertionError ae) {
			  		log.error("Address is not saved");*/
			  			
			  			FormMyAddressBook fmab=new FormMyAddressBook(driver);
			  			   			
			  		//compare the text from the browser with actual value...Error
			  		Assert.assertEquals(fmab.getTitleSC().getText(), "Address book form has been created");
			  		//fmab.getTitleSC().getText(), "Address book page has been created"); //Validate title for save changes
			  				  		log.error("Address is not saved");
			  			
			  		}  		
			  		
			  		@Test(dataProvider ="getdata2negative" ,priority=5)
  				  	public void NFormMyAddressBook(String Firstname,String LastName, String companyName, String StreetAdd, String Apt, String Country, String city, String State, String Phonenum,String Ext, String Zipcode) throws IOException {        //one method is inheritance
  					
  					//	{
  						//	String enableRadioButton ="enabled";
  						//	String disableRadioButton ="disable";

  						     //methods calling from FormMyAddressBookpage
  						     FormMyAddressBook fmab=new FormMyAddressBook(driver);
  						       fmab.getFirstName().sendKeys(Firstname);
  						       fmab.getLastName().sendKeys(LastName);
  						       fmab.getCompanyName().sendKeys(companyName);
  						       fmab.getStreetAddress().sendKeys(StreetAdd);
  						       fmab.getApt().sendKeys(Apt);
  						       fmab.getCountry().sendKeys(Country);
  						       fmab.getCity().sendKeys(city);
  						       fmab.getState().sendKeys(State);
  						       fmab.getPhoneNum().sendKeys(Phonenum);
  						       fmab.getExtension().sendKeys(Ext);
  						       fmab.getZipCode().sendKeys(Zipcode);
  				  		
		}		
			  			
			  				  		
			  			
			  		
									
					@DataProvider
					public Object[][] getData( )   //Writing test data for test cases for signin
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
					
					
					@DataProvider
					
					public Object[][]  getdata1()  //Writing test data for test cases for the form of My Address Book
					{
						// Row stands for how many different data types test should run
						//column stands for how many values per each test
						//Array size is 5 - 0,1,2,3,4
						//Object[][] data = new Object[2][3]; //This is the array size which is 2 in this case but values are 0,1 and we are passing three values/parameters
						
						Object[][] data = new Object[1][11]; 
						
						//0th row
					     data[0][0]="Dummy";
					     data[0][1]="Arora";
					     data[0][2] ="Test Company";
					     data[0][3] ="Bandera St";
					     data[0][4] ="111";
					     data[0][5] ="United States";
					     data[0][6] ="Austin";
					    data[0][7] ="Texas";
					    data[0][8] ="512-578-9877";
					    data[0][9] ="123";
					   	data[0][10] ="78681";
				    		
					    		
					    		
					     //1st row
					 /*   data[1][0]="123abc";
						 data[1][1]="1qwert2";
					 data[1][2]="Some Error";*/
						 
						 return data;
					  
									
				}
					
					
					
		@DataProvider
					
					public Object[][]  getdata2negative()  //Writing test data for test cases for the form of My Address Book
					{
						
						Object[][] data = new Object[1][11]; 
						
						//0th row
					     data[0][0]="Dummy";
					     data[0][1]="Arora";
					     data[0][2] ="Test Company";
					     data[0][3] ="Bandera St";
					     data[0][4] ="111";
					     data[0][5] ="United States";
					     data[0][6] ="Austin";
					    data[0][7] ="Texas";
					    data[0][8] ="abcdefgh";
					    data[0][9] ="123";
					   	data[0][10] ="78681";
				    		
					    		
					    		
					     //1st row
					 /*   data[1][0]="123abc";
						 data[1][1]="1qwert2";
					 data[1][2]="Some Error";*/
						 
						 return data;
					  
									
				}
					
					
				
					
				//	@AfterTest
			//		public void teardown()
				//	{
			//			driver.close();
		//			}
		
		
		
		
		
		}
		



