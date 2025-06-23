package Day21;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;

//import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;

public class Chatgpt {

	WebDriver driver;

    public void setUp() {
        // Set path to ChromeDriver if not in system PATH
        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
    }

    public void testCoinpediaTitle() {
        driver.get("https://app.coinpedia.org");
        String expectedTitle = "Top Crypto Insights & Market Analysis on Coinpedia";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle, "Title did not match!");
    }

    
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }

	}

}
