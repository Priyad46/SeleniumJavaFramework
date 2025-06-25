package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Methods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testevents.coinpedia.org/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		//isDisplayed
		WebElement logo = driver.findElement(By.xpath("//h1[normalize-space()='All Events']"));
		System.out.println("Display status of Logo : " + logo.isDisplayed());
		//OR
		//boolean status = driver.findElement(By.xpath("//div[@id='register-reached']//img[@alt='logo']")).isDisplayed();
		//System.out.println("Display status : " + status);
		
		//isEnabled
		boolean Enablest = driver.findElement(By.xpath("//input[@placeholder='Search']")).isEnabled();
		System.out.println("Display Enable status : " + Enablest);
		
		//isSelected
		// Use for to select radiobuttons
		
	}
}
