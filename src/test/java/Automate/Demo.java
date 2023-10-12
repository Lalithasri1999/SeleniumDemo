package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	@Test
	public static void main(String args[]) {
		WebDriver driver=WebDriverManager.edgedriver().create();
		driver.get("https://www.google.com/");
		driver.findElement(By.id(""));
	}
}
