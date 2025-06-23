package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_Demo2 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://events.coinpedia.org/");
		driver.manage().window().maximize();
		
		/*Manual relative xpath syntax
		// tagname[@attribute=’value’] 
        //or
        //*[@attribute=’value’] 
         */
		
		//xpath with single attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("xyz");
		
		//xpath with multiple attributes
		//driver.findElement(By.xpath("//input[@placeholder='Search'][@type='Search']")).sendKeys("xyz");

		//xpath with 'and' 'or' operators
		//driver.findElement(By.xpath("//input[@placeholder='Search' and @type='Search']")).sendKeys("ncvdfv");
		//driver.findElement(By.xpath("//input[@placeholder='Search' or @type='Search']")).sendKeys("ncvdfv");

		//xpath with text() - innertext (We r not using any attributes in this) 
		//driver.findElement(By.xpath("//*[text()='Ongoing']")).click();
		/*boolean displayStatus=driver.findElement(By.xpath("//*[text()='All Events']")).isDisplayed();
		System.out.println(displayStatus);
		
		String value=driver.findElement(By.xpath("//*[text()='All Events']")).getText();
		System.out.println(value);
		*/
		
		//xpath with contains method
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("cyshc");
		
		//xpath with starts-with method
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("cyshc");

		//Chained xpath    (If you have no attributes & no innertext then use this methods)
		boolean imgStatus=driver.findElement(By.xpath("//div[@id=’event_card_img’]/a/img")).isDisplayed();
		System.out.println(imgStatus);
		
	}

}
