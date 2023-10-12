package Automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Selenium_first {
	public static void main(String args[]) 
	{
		/*
		 WebDriverManager.firefoxdriver().setup();
		 WebDriverManager.safaridriver().setup();
		 WebDriverManager.chromedriver().setup();
		 */
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();//launch the browser
	
		driver.manage().window().maximize();//maximize the browser
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.manage().window().minimize();
		driver.get("https://www.amazon.in/");
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		System.out.println(url);
		System.out.println(title);
		
		driver.close();
		//driver.quit();
	}

}