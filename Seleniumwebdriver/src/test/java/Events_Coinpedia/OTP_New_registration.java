package Events_Coinpedia;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OTP_New_registration {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.manage().window().maximize();
        driver.get("https://testevents.coinpedia.org/");

        // Click Login
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']"))).click();

        // Enter Email
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter Your Email ID']")))
                .sendKeys("wedittas69874@ihnpo.com");

        // Click Submit
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Wait for Register Popup to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Create CoinPedia Account')]")));

        // Select Gender
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='dropdown']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Female ']"))).click();

        // Fill Full Name
        driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("wedittas");

        // Fill Username
        driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("wedittas");

        // Select Country Code
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='input-group-text']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']"))).sendKeys("india");

        // Wait and select country code from list
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(., 'India')]"))).click();

        // Enter mobile number
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[contains(@placeholder,'Type your Mobile Number')]"))).sendKeys("954125");

        // Click Create Account
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='register']"))).click();

        // OTP Popup - Wait and Verify Title
        WebElement otpTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h3[contains(text(),'Verify your email')]")));
        System.out.println("OTP Title Displayed? => " + otpTitle.isDisplayed());

        // Enter OTP - simulate entering just "1"
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='number']"))).sendKeys("121452");

        // You can continue OTP validation or further testing here...
        // Close the browser
        //driver.quit();
    }
}
