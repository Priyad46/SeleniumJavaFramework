package Day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //implicit
		
		driver.manage().window().maximize();
		
		driver.get("https://testevents.coinpedia.org/");
				
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("xyz");

	}

}
