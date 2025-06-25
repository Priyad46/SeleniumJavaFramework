package WebDriver_Methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Methods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		//1. get(url) - Opens the url on the browser
		driver.get("https://testevents.coinpedia.org/");
		Thread.sleep(5000);
		
		//2. getTitle( ) - returns title of the page
		System.out.println(driver.getTitle());
		
		//3. getCurrentUrl( ) - returns url of the page
		System.out.println(driver.getCurrentUrl());
		
		//4. getPageSource( ) - returns sourcecode of the page (Using view source)
		//System.out.println(driver.getPageSource());
		
		//5. getWindowHandle( ) - returns id of the single browser window
		String WindowID = driver.getWindowHandle();
		System.out.println("Window ID => " + WindowID);     //3EA60454369BF4D812A06AC456260B11
		
		//6. getWindowHandles( ) - returns id of the multiple browser windows
		driver.findElement(By.linkText("View More")).click();
		
		Set<String> WindowIds = driver.getWindowHandles();
		System.out.println(WindowIds);    //[A84455D9BEEED66DD51BB2D473E1FAA8, 2C5A7B9F42EB8232A56064CFE0405243]
	}

}
