package Day22;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeLocators {

	public static void main(String[] args) {

		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://events.coinpedia.org/");
		
		//name
		//driver.findElement(By.name("form-control")).sendKeys("Test");
		
		//id
		//boolean imageDisplayedstatus=driver.findElement(By.id("__next")).isDisplayed();
		//System.out.println(imageDisplayedstatus);
		
		//linkText & partialLinkText
		//driver.findElement(By.linkText("Speakers")).click();
		//driver.findElement(By.partialLinkText("Organ")).click();
		
		//className
		//List<WebElement> headerLinks=driver.findElements(By.className("collapse navbar-collapse main_menu_header mob_background"));
		//System.out.println("Total number of headerlinks are" + headerLinks.size();
		
		//tagName
		//List<WebElement> links=driver.findElements(By.tagName("a"));
		//System.out.println("Total number of link " + links.size());
		
		List<WebElement> totalImages=driver.findElements(By.tagName("img"));
		System.out.println("Total number of images are " + totalImages.size());

		
	}

}
