package Events_Coinpedia;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Event_Register_Popup {

       @SuppressWarnings("null") //This is for register popup gender field don't comment it
       public static void main(String[] args) throws InterruptedException {
    	   
           //Thread.sleep(2000);
           WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           
           driver.get("https://testevents.coinpedia.org/");
           
           //click on login button
           driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

           //Enter some data in email id field
           driver.findElement(By.xpath("//input[@placeholder='Enter Your Email ID']")).sendKeys("dabasik973@finfave.com");

           driver.findElement(By.xpath("//button[@type='submit']")).click();

           //Register Popup Code starts from below..

           //Verify in login popup coinpedia logo displayed or not
           boolean logoDisplayedstatus=driver.findElement(By.id("__next")).isDisplayed();
           System.out.println("Coinpedia logo displayed? => " + logoDisplayedstatus);

           //Verify title displayed or not .....

           //Create a WebDriverWait instance (10 seconds)
           WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

           // Wait for the title element to be visible
           WebElement titleElement = wait.until(
        		   ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Create CoinPedia Account')]")));
           // Now check if it’s displayed
           boolean titlestatus = titleElement.isDisplayed();
           System.out.println("Title displayed? => " + titlestatus);
           //OR
           //Verify Title displayed or not
           /*boolean TitleDisplay=driver.findElement(By.xpath("//h3[contains(text(),'Create CoinPedia Account ')]")).isDisplayed();
System.out.println("Title displayed? => " + TitleDisplay);*/
           
           //Verify SubTitle displayed or not
           boolean SubTitleDisplay=driver.findElement(By.xpath("//p[contains(text(),'A Platform to over 1 million + Crypto and Blockchain enthusiasts in the world.')]")).isDisplayed();
           System.out.println("Subtitle displayed? => " + SubTitleDisplay);

           //Verify email id displayed or not
           boolean emailid=driver.findElement(By.xpath("//input[@class='form-control']")).isDisplayed();
           System.out.println("Email id displayed? => " + emailid);

           //Verify @ displayed or not
           boolean at_icon=driver.findElement(By.xpath("//img[@title='Email']")).isDisplayed();
           System.out.println("@ displayed? => " + at_icon);

           //Verify fullname field displayed or not
           boolean fullname=driver.findElement(By.xpath("//label[text()='Full Name']")).isDisplayed();
           System.out.println("Fullname fields displayed? => " + fullname);

           //Verify fullname asterisk mark displayed or not
           boolean FullnameAst=driver.findElement(By.xpath("//span[text()='*']")).isDisplayed();
           System.out.println("Fullname asterisk mark displayed? => " + FullnameAst);

           //Verify Gender field is displayed or not
           boolean Gender=driver.findElement(By.xpath("//span[text()='Male']")).isDisplayed();
           System.out.println("Gender field displayed? => " + Gender);

           //Verify Gender field is clickable or not
           driver.findElement(By.xpath("//img[@alt='dropdown']")).click();

           //Select Gender as Male/Female/Other
           //driver.findElement(By.xpath("//*[text()='Male ']")).click();
           driver.findElement(By.xpath("//*[text()='Female ']")).click();
           //driver.findElement(By.xpath("//*[text()='Other ']")).click();

           //Verify Full name field placeholder
           boolean FullnamePlaceh=driver.findElement(By.xpath("//input[@placeholder='Full Name']")).isDisplayed();
           System.out.println("Fullname field placeholder displayed as Full Name ? => " + FullnamePlaceh);

           //Validate Fullname field
           //driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys(" ");
           //driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("abc"); //min 4 char
           driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("abcd"); //Accept alphabets only
           //driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("1002"); //number should not accept
           //driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("abc test"); //Space acceptable
           //driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys(".,/,./"); //Special characters are not Acceptable

           //Verify Username field displayed or not
           boolean Username=driver.findElement(By.xpath("//label[text()='User Name']")).isDisplayed();
           System.out.println("Username field displayed? => " + Username);

           //Verify Username field placeholder
           boolean UsernamePlaceh=driver.findElement(By.xpath("//input[@placeholder='User Name']")).isDisplayed();
           System.out.println("Username field placeholder displayed as Username ? => " + UsernamePlaceh);

           //Validate Username field
           //driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("abc"); //min 4 char
           driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("abc123"); //Accept alphanumeric values
           //driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("abc 123"); //Space is not Acceptable
           //driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys(",./;];["); //Special characters are not Acceptable

           //Verify Connect Wallet field displayed or not
           boolean Connect_Wallet=driver.findElement(By.xpath("//lable[text()='Connect Wallet']")).isDisplayed();
           System.out.println("Connect_Wallet field displayed? => " + Connect_Wallet);

           //Verify Username field placeholder
           boolean Connect_Wallet_placeh=driver.findElement(By.xpath("//p[text()='Click here to connect Wallet']")).isDisplayed();
           System.out.println("Connect_Wallet_placeh field placeholder displayed as Click here to connect Wallet ? => " + Connect_Wallet_placeh);

           //Click metamask
           //driver.findElement(By.xpath("//div[contains(@class,'connect_wallet_block')]")).click(); //Comment create account button click & do this

           //Verify Mobile number field displayed or not
           boolean Mobile_No=driver.findElement(By.xpath("//label[normalize-space()='Mobile No']")).isDisplayed();
           System.out.println("Mobile_No field displayed? => " + Mobile_No);

           //Verify Country block displayed or not
           boolean Country_dropdown_block=driver.findElement(By.xpath("//span[@class='input-group-text']")).isDisplayed();
           System.out.println("Country_dropdown_block displayed? => " + Country_dropdown_block);

           //Verify Country img displayed
           boolean Country_img=driver.findElement(By.xpath("//img[@title='India']")).isDisplayed();
           System.out.println("Country_img displayed? => " + Country_img);

           //Verify country block clickable or not
           driver.findElement(By.xpath("//span[@class='input-group-text']")).click();

           //Verify country block clickable or not
           //driver.findElement(By.xpath("button[type='button']img[class='lightmode_image']")).click(); //Dont uncomment it , it will give error to you

           //SELECT AREA CODE POPUP

           //Verify Select area code title
           boolean Select_area_code_title=driver.findElement(By.xpath("//h4[normalize-space()='Select area code']")).isDisplayed();
           System.out.println("Select_area_code_title displayed? => " + Select_area_code_title);

           //Verify searchbox displayed
           boolean searchbox=driver.findElement(By.xpath("//div[@class='input-group search_filter']")).isDisplayed();
           System.out.println("searchbox displayed? => " + searchbox);

           //Verify in searchbox search icon displayed
           boolean Search_icon=driver.findElement(By.xpath("//img[@src='/assets/img/search_large.svg']")).isDisplayed();
            System.out.println("Search_icon displayed? => " + Search_icon);

           //Verify searchbox is clickable or not
           boolean Searchbox_click=driver.findElement(By.xpath("//input[@placeholder='Search']")).isDisplayed();
            System.out.println("Searchbox_clickable ? => " + Searchbox_click);

           //Search data in searchbox
           driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("india");

           //Click on search data
           driver.findElement(By.xpath("//div[@class='country_list_modal custom-country-list-modal']//div[1]//div[2]//div[2]//ul[1]//li[2]")).click();

           //Verify mobile no placeholder displayed or not
           boolean Mobile_No_placeh=driver.findElement(By.xpath("//input[contains(@placeholder,'Type your Mobile Number')]")).isDisplayed();
           System.out.println("Mobile_No_placeh displayed? => " + Mobile_No_placeh);

           //Verify mobile no conditions
           //driver.findElement(By.xpath("//input[contains(@placeholder,'Type your Mobile Number')]")).sendKeys("695"); //min 5 char
           //driver.findElement(By.xpath("//input[contains(@placeholder,'Type your Mobile Number')]")).sendKeys("695 981"); //Space acceptable
           driver.findElement(By.xpath("//input[contains(@placeholder,'Type your Mobile Number')]")).sendKeys("695(025)"); //Paranthesis acceptable
           //driver.findElement(By.xpath("//input[contains(@placeholder,'Type your Mobile Number')]")).sendKeys("695-2535"); //Hyphen acceptable

           //Verify Referral ID field displayed or not
           boolean Referral_ID=driver.findElement(By.xpath("//label[normalize-space()='Referral ID']")).isDisplayed();
           System.out.println("Referral_ID field displayed? => " + Referral_ID);

           //Verify Referral_ID placeholder field placeholder
           boolean Referral_ID_placeh=driver.findElement(By.xpath("//input[@placeholder='Any invitee Id ?']")).isDisplayed();
           System.out.println("Referral_ID_placeh displayed as Any invitee Id ? => " + Referral_ID_placeh);

           //Verify by entering the referral id
           driver.findElement(By.xpath("//input[@placeholder='Any invitee Id ?']")).sendKeys("xyz"); //Enter any referral id

           //Verify Create Account button displayed or not
           boolean Create_Account=driver.findElement(By.xpath("//button[normalize-space()='Create Account']")).isDisplayed();
           System.out.println("Create_Account button displayed => " + Create_Account);

           //Click on "Create Account" button
           //driver.findElement(By.xpath("//button[@name='register']")).click();
           
           //Verify in the end sub-content displayed or not
           boolean Sub_Content=driver.findElement(By.xpath("//p[contains(text(),'By creating account with us, you clarify you have ')]")).isDisplayed();
           System.out.println("Sub_Content displayed as By creating account with us, you clarify you have read and accepted the => " + Sub_Content);

           //Verify privacy & Policy links are clickable
           driver.findElement(By.xpath("//span[normalize-space()='Privacy policy']")).click();

           //Verify Terms & Conditions links are clickable
           driver.findElement(By.xpath("//span[normalize-space()='Terms & Conditions']")).click();
           
}

}