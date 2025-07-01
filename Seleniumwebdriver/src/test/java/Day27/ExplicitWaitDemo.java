package Day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
			
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10)); //declaration
		
		driver.manage().window().maximize();
		
		driver.get("https://testevents.coinpedia.org/");
		
		WebElement txtusername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']")));
		txtusername.sendKeys("xyz");
        //driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("xyz");  => No needs to use this if you used expected condition

		WebElement CreateAcc = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Create Account']")));
		CreateAcc.click();
		
	}

}
