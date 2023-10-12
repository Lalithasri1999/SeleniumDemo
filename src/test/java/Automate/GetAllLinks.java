package Automate;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class GetAllLinks {
 
 public static void main(String[] args)throws InterruptedException{
 WebDriverManager.edgedriver().setup();
 WebDriver driver = new EdgeDriver();
 
 //Launching sample website
 driver.get("https://www.microsoftedge.com");
 driver.manage().window().maximize();
 
 //Get list of web-elements with tagName  - a
 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
 
 //Traversing through the list and printing its text along with link address
 for(WebElement link:allLinks){
 System.out.println(link.getText() );
 }
 
 } 
 
}