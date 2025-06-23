package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_xpath {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://events.coinpedia.org/");
		driver.manage().window().maximize();
		
		//xpath with single attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("vchsdgc");
		
		//xpath with multiple attributes
		//driver.findElement(By.xpath("//input[@placeholder='Search'] [@type='text']")).sendKeys("cbdshv");
		
		//xpath with 'and' 'or' operators
		//driver.findElement(By.xpath("//input[@placeholder='Search'and @type='text']")).sendKeys("cbdshv");
		//driver.findElement(By.xpath("//input[@placeholder='Search'or @type='text']")).sendKeys("cbdshv");
		
		//xpath with innertext
		//driver.findElement(By.xpath("//*[text()='Ongoing']")).click();

		//xpath with contains method
		driver.findElement(By.xpath("//*[contains(@"))
		
	}

}
