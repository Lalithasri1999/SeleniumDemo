package Automate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverAction 
{
	public static void main(String args[]) 
	{
		//step-1:Launch the browser
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		//step 2: Maximize the browser
		driver.manage().window().maximize();
		
		//step 3: Use the Implicit Wait method
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//step 4: Launch the application using URL
		driver.get("https://www.amazon.com/");
		
		//step 5: Identify the address of search text field
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		
		//step 6: MouseOver Action
		WebElement act = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		Actions a = new Actions(driver);
		a.moveToElement(act).perform();
		
		//step 7 : Close current browser
		driver.close();
	}
}
