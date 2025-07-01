package Day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepCommand {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testevents.coinpedia.org/");
		
		Thread.sleep(3000);
		
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("xyz");

	}

}
