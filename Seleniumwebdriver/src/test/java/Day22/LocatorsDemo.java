package Day22;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsDemo {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://events.coinpedia.org/");
		driver.manage().window().maximize();
		
		//name
		//driver.findElement(By.name("form-control")).sendKeys("Test");
		
		//id
		//boolean logoDisplayedstatus=driver.findElement(By.id("__next")).isDisplayed();
		//System.out.println(logoDisplayedstatus);
		
		//linkText & partialLinkText
		//driver.findElement(By.linkText("Speakers")).click();
		//driver.findElement(By.partialLinkText("Speak")).click();

		//className
		//List<WebElement> headerLinks=driver.findElements(By.className("nav-link dropdown-toggle hide_mobile_view current_menu"));
		//System.out.println("Total number of header links : " +headerLinks.size());
		
		//tagName
		//List<WebElement> links=driver.findElements(By.tagName("a"));
		//System.out.println("Total number of Links " + links.size());
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("Total number of Images " + images.size());
	}
}
