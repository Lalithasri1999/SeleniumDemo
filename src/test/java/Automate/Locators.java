package Automate;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		driver.findElement(By.id("login_field")).sendKeys("rev");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("rev");
		Thread.sleep(3000);
		driver.findElement(By.className("btn btn-primary btn-block js-sign-in-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgot password?"));
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Create an"));
		Thread.sleep(3000);
		driver.findElement(By.tagName("h1"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(text(),'Username or email address')]"));
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='commit']"));
		Thread.sleep(3000);
		
		
	}
	

	
}
