package Events_Coinpedia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://events.coinpedia.org/");
		
		String meta_title=driver.getTitle();
		if(meta_title.equals("List of upcoming cryptocurrency and Blockchain events"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		/*String meta_des=driver.getTitle();
		if(meta_des.equals("Explore upcoming events in the crypto and blockchain eco-system. Stay tuned with coinpedia events calender, wishlist your favourite Event now!"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		*/
		
		/*boolean logoDisplayedstatus=driver.findElement(By.id("__next")).isDisplayed();
		System.out.println(logoDisplayedstatus);
		*/
		
		driver.findElement(By.linkText("All Events")).click();
		driver.findElement(By.xpath("//*[text()='Ongoing']")).click();
		
		//LOCATIONS FILTER
		driver.findElement(By.xpath("//span[@class='filter_title']")).click();
		//driver.findElement(By.xpath("//*[text()='Use my current location']")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Enter location']")).sendKeys("Hubli");

		//DATE FILTERS
		//driver.findElement(By.xpath("//*[text()='Date']")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Custom Date']")).click();
		//driver.findElement(By.xpath("//*[text()='Today']")).click();
		//driver.findElement(By.xpath("//*[text()='Tomorrow']")).click();
		//driver.findElement(By.xpath("//*[text()='This Week']")).click();
		//driver.findElement(By.xpath("//*[text()='This Month']")).click();

		//PRICE FILTERS
		//driver.findElement(By.xpath("//*[text()='Price']")).click();
		//driver.findElement(By.xpath("//*[text()='Free']")).click();
		//driver.findElement(By.xpath("//*[text()='Paid']")).click();

		//EVENT TYPES
		//driver.findElement(By.xpath("//*[text()='Event Type']")).click();
		//driver.findElement(By.xpath("//*[text()='Seminar']")).click();
		//driver.findElement(By.xpath("//*[text()='Webinar']")).click();
		//driver.findElement(By.xpath("//*[text()='Hybrid']")).click();

		//TAG
		//driver.findElement(By.xpath("//*[text()='Tag']")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Decentralised exchange");
		//driver.findElement(By.cssSelector("span.tick_image")).click();
		
		//RESET FILTER
		//driver.findElement(By.xpath("//*[text()='Reset Filter']")).click();

		//CLICK ONGOING|UPCOMING|ENDED TABS
		//driver.findElement(By.xpath("//*[text()='Upcoming']")).click();
		//driver.findElement(By.xpath("//*[text()='Ended']")).click();
		
		//CLICK 'CREATE EVENT' BUTTON
		//driver.findElement(By.xpath("//*[text()='Create Event']")).click();
		
		//CLICK ORGANIZERS|SPEAKERS TABS
		//driver.findElement(By.linkText("Organizers")).click();
		//driver.findElement(By.linkText("Speakers")).click();
		
		//SEARCH IN SEARCHBOX
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Sigma Asia");

		//OPEN EVENT DETAILS PAGE
		
		//driver.close();
		
		
	}

}
