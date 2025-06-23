package Events_Coinpedia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Events_LoginPopup {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testevents.coinpedia.org/");
		
		//click on login button
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//Verify cancel mark is clickable
		//driver.findElement(By.xpath("//img[@title='pop-cancel']")).click();
		
		/*boolean isPopupClosed = driver.findElements(By.cssSelector(".popup")).isEmpty();
        if (isPopupClosed) {
            System.out.println("Popup was closed successfully.");
        } else {
            System.out.println("Popup still visible!");
        }
        */
        
        
		//Verify in login popup coinpedia logo displayed or not
		boolean logoDisplayedstatus=driver.findElement(By.id("__next")).isDisplayed();
		System.out.println(logoDisplayedstatus);
		
		//Verify subtitle displayed or not
		/*boolean subitledisplaystatus=driver.findElement(By.xpath("//h4[text()='Create and Manage Your Events On Coinpedia.']")).isDisplayed();
		System.out.println(subitledisplaystatus);*/
		
		//Verify email field displayed or not
		boolean emaildisplay=driver.findElement(By.xpath("//label[text()='Email']")).isDisplayed();
		System.out.println(emaildisplay);

		//Verify for email asterisk mark displayed or not
		boolean emailastdisplay=driver.findElement(By.xpath("//label[text()='Email']")).isDisplayed();
		System.out.println(emailastdisplay);
		
		//Verify email placeholder
		boolean emailplaceholder=driver.findElement(By.xpath("//input[@placeholder='Enter Your Email ID']")).isDisplayed();		
		System.out.println(emailplaceholder);
        
		//Enter some data in email id field
		//driver.findElement(By.xpath("//input[@placeholder='Enter Your Email ID']")).sendKeys(" ");
		//driver.findElement(By.xpath("//input[@placeholder='Enter Your Email ID']")).sendKeys("test");
		//driver.findElement(By.xpath("//input[@placeholder='Enter Your Email ID']")).sendKeys("testgmail.com");
		//driver.findElement(By.xpath("//input[@placeholder='Enter Your Email ID']")).sendKeys("test gmail.com");
		//driver.findElement(By.xpath("//input[@placeholder='Enter Your Email ID']")).sendKeys("birimom900@adrewire.com");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();

		//Verify keep me loggedin text
		/*boolean keepmeloggedin=driver.findElement(By.xpath("//span[text()='Keep me logged in']")).isDisplayed();
		System.out.println(keepmeloggedin);
		*/

		//Verify keep me loggedin toggle clickable
		/*driver.findElement(By.xpath("//span[@class='slider']")).click();
				//OR
		Boolean toggleenable= driver.findElement(By.xpath("//span[@class='slider']")).isEnabled( );
		System.out.println(toggleenable);
		*/
		
		//Verify Explore button displayed or not
		boolean Explorebtn=driver.findElement(By.xpath("//label[text()='Email']")).isDisplayed();
		System.out.println(Explorebtn);
		
		//Verify Explore button clickable or not
		//driver.findElement(By.xpath("//button[@type='submit']")).click();

		//Verify OR text visible or not
		boolean ortextdisplay=driver.findElement(By.xpath("//span[text()='OR']")).isDisplayed();
		System.out.println(ortextdisplay);
		
		//Verify Login with Google displayed or not
		/*boolean LoginwithGoogle=driver.findElement(By.xpath("//img[@title='Google']")).isDisplayed();		
		System.out.println(LoginwithGoogle);
		*/
		
		//driver.findElement(By.linkText("Google")).click();

		//driver.findElement(By.xpath("//div[@class='auth_modal']")).click();
		//driver.findElement(By.cssSelector("img.Google")).click();

		//Verify Login with Metamask displayed or not
		//boolean LoginwithMetamask=driver.findElement(By.xpath("//img[@title='Metamask']")).isDisplayed();		
		//System.out.println(LoginwithMetamask);
		
		//Verify Login with Apple displayed or not
		//boolean LoginwithApple=driver.findElement(By.xpath("//img[@title='Apple']")).isDisplayed();		
		//System.out.println(LoginwithApple);
	}

}
