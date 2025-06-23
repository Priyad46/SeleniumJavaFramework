package Day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Practicefirstautomation {

	public static void main(String[] args) 
	{
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://events.coinpedia.org");
		
		String act_title=driver.getTitle();
		
		if (act_title.equals("List of upcoming cryptocurrency and Blockchain events"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		driver.quit();
	}
}
