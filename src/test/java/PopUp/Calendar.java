package PopUp;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar {

	public  void Trip(){
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);

	    driver.get("https://www.yatra.com/");
	    driver.findElement(By.xpath("//label[@for='BE_flight_origin_date']")).click();
	    driver.findElement(By.id("16/10/2023")).click();
	    driver.close();


	}
}
