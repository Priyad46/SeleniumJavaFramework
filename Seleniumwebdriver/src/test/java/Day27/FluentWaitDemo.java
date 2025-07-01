package Day27;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		//Fluent wait declaration
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(10)) // Maximum wait time
			.pollingEvery(Duration.ofSeconds(2)) // Interval between condition checks
			.ignoring(NoSuchElementException.class); // Exceptions to ignore
		
		driver.manage().window().maximize();
		
		driver.get("https://testevents.coinpedia.org/");
		
        //driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("xyz");  //=> No needs to use this if you used expected condition
		
		WebElement search = mywait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.xpath("//input[@placeholder='Search']"));
		     }
		   });
		search.sendKeys("xyz");

	}

}
