package Home_Work;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WrapperMethod {
	
	WebDriver driver;

	public void Logininfo(String url) 
			
	{
	String chromepath = "C:\\Tools\\Selenium\\chromedriver\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", chromepath);
	driver = new ChromeDriver();
	driver.manage().window().maximize();	
	driver.get(url);
	}
	
	
	public void Xpathinfo(String var, String var2) 
	{
		driver.findElement(By.xpath(var)).sendKeys(var2);
		
		}
		
	public void Buttoninfo(String clickvar)
	
	{
		driver.findElement(By.xpath(clickvar)).click();
	}	
		
	public void Screenshot(String path) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File((path)));
		
		
	}
	
public void Dropdown(String locator, String val)
	
	{
		
	 Select drop=new Select(driver.findElement((By.xpath(locator))));
	drop.selectByValue(val);
	}	



}
