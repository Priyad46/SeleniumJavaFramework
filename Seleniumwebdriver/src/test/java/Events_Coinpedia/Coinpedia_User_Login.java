package Events_Coinpedia;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Coinpedia_User_Login {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Extended timeout

        driver.manage().window().maximize();
        driver.get("https://testevents.coinpedia.org/");

        try {
            // Click Login
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']"))).click();

            // Enter Email
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter Your Email ID']")))
                    .sendKeys("coinpediaapp@gmail.com");

            // Click Submit
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();

            // Wait for OTP Popup title
            WebElement otpTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//h3[contains(text(),'Verify your email')]")));
            System.out.println("OTP Title Displayed? => " + otpTitle.isDisplayed());

            // Wait for 6 OTP input fields to be visible
            wait.until(ExpectedConditions.numberOfElementsToBe(
                    By.xpath("//input[@inputmode='numeric' or @type='number']"), 6));

            List<WebElement> otpFields = driver.findElements(By.xpath("//input[@inputmode='numeric' or @type='number']"));

            String otp = "488488";
            for (int i = 0; i < otp.length(); i++) {
                otpFields.get(i).sendKeys(String.valueOf(otp.charAt(i)));
            }

            // Click Verify
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Verify']"))).click();

        } catch (Exception e) {
            System.err.println("Exception occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
