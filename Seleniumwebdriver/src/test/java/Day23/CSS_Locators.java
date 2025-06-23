package Day23;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSS_Locators {

	public static void main(String[] args) {

		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://events.coinpedia.org/");
		
		// 1. tag id => tag#id
		//driver.findElement(By.cssSelector("input#id")).sendKeys("T-shirts");
		//or
		//driver.findElement(By.cssSelector("#id")).sendKeys("T-shirts");
		
		// 2. tag class => tag.class
		//driver.findElement(By.cssSelector("input.form-control")).sendKeys("event");
		//or
		//driver.findElement(By.cssSelector(".form-control")).sendKeys("event");

		// 3. class attribute => tag[attribute='value']
		//driver.findElement(By.cssSelector("input[placeholder=\"Search\"]")).sendKeys("test");   //using backward slash
		//or
		//driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("test");   //using single quotation
		//or
		//driver.findElement(By.cssSelector("[placeholder='Search']")).sendKeys("test");   //removing tag name

		// 4. tag class attribute ⇒ tag.classname[attribute=”value”]
		driver.findElement(By.cssSelector("input.form-control[placeholder='Search']")).sendKeys("eve");
		//or
		//driver.findElement(By.cssSelector(".form-control[placeholder='Search']")).sendKeys("eve"); //removed tagname
	}
}
