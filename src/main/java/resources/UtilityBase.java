package resources;

import java.io.File;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class UtilityBase {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		
		prop = new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\mkalra\\eclipse-workspace\\DollarDaysMaven\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		
	if (browserName.equals("chrome"))
		
		{	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mkalra\\Desktop\\Vandana-Java\\Silenium Drivers\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
			
		}

		
		else if(browserName.equals("firefox"))
		{
			
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\mkalra\\Desktop\\Vandana-Java\\Silenium Drivers\\chromedriver\\chromedriver_win32\\chromedriver.exe");
			//firefox code
			
		}
		
		else if (browserName.equals("IE"))
			
		{
			
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\mkalra\\Desktop\\Vandana-Java\\Silenium Drivers\\chromedriver\\chromedriver_win32\\chromedriver.exe");
			//IE code
		}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
}
	
	public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException
	{
	//Screenshot 
		TakesScreenshot ts = (TakesScreenshot)  driver;
	File source =   ts.getScreenshotAs(OutputType.FILE);
	String destinationFile = System.getProperty("user.dir") +"\\reports\\"+testCaseName+".png";
       FileUtils.copyFile(source,  new File(destinationFile));
       return destinationFile;
}

	//private TakesScreenshot driver() {
		// TODO Auto-generated method stub
		//return null;
	}


	
	


