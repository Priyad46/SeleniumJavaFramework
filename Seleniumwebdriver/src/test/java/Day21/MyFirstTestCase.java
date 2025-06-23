package Day21;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

/*
Test cases
1. Launch browser (chrome)
2. Open url https://app.coinpedia.org 
3. Validate title should be "Top Crypto Insights &amp; Market Analysis on Coinpedia"
4. Close Browser
*/


public class MyFirstTestCase {

	public static void main(String[] args) {

		//1. Launch browser (chrome)
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		//WebDriver driver1=new EdgeDriver();
		//WebDriver driver=new FirefoxDriver();
		
		//2. Open url https://app.coinpedia.org 
		driver.get("https://app.coinpedia.org");
		
		//3. Validate title should be "Top Crypto Insights &amp; Market Analysis on Coinpedia"
		String act_title=driver.getTitle();
		
		if(act_title.equals("Top Crypto Insights & Market Analysis on Coinpedia"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("test Failed");
		}
			
		//4. Close Browser
		driver.close();
		driver.quit();
		
	}
}
