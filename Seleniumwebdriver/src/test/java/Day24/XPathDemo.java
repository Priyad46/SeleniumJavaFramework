package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;      //ctrl+shift+o
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://events.coinpedia.org/");
		driver.manage().window().maximize();
		
		//xpath with single attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("test");
		
		//xpath with multiple attribute      
		//driver.findElement(By.xpath("//input[@placeholder='Search'][@xpath='1']")).sendKeys("exam");      //For multiple attribute write manually
		
		//xpath with 'and' 'or' operators
		//driver.findElement(By.xpath("//input[@placeholder='Search' and @xpath='1']")).sendKeys("exam");   //In "and" operator both the attributes should be true
		//driver.findElement(By.xpath("//input[@placeholder='Search' or @xpath='1']")).sendKeys("exam");   //In "and" operator any one attribute should be true

		//xpath with inner text
		
		//driver.findElement(By.xpath("//img[text()='watchlist']")).click();
		
		//boolean displaystatus=driver.findElement(By.xpath("//span[text()='Ongoing']")).isDisplayed();
		//System.out.println(displaystatus);
		
		//String value=driver.findElement(By.xpath("//h6[text()='Ongoing']")).getText();
		//System.out.println(value);
		
		//xpath with Contains() method
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Tshirts");
		
		//xpath with starts-with method
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Shirts");
		
		
		
	}

}
