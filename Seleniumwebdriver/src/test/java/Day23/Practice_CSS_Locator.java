package Day23;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Practice_CSS_Locator {

	public static void main(String[] args) {
		
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://events.coinpedia.org/");
		
		//tag id
		//driver.findElement(By.cssSelector("input#id")).sendKeys("test");
		
		//tag class
		//driver.findElement(By.cssSelector("input.form-control")).sendKeys("event");
		
		//class attribute
		//driver.findElement(By.cssSelector("input[placeholder=\"Search\"]")).sendKeys("ex");
		
		//tag class attribute   => tag.classname[attribute='value']
		driver.findElement(By.cssSelector("input.form-control[placeholder=\"Search\"]")).sendKeys("jax");
		
		
	}

}
