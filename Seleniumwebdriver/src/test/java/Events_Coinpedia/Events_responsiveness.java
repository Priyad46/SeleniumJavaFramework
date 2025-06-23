package Events_Coinpedia;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Events_responsiveness {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://testevents.coinpedia.org/");
		//driver.manage().window().maximize();
		
		//Desktop Responsive pixels
        /*driver.manage().window().setSize(new Dimension(1024, 1366)); // Set responsive screen size
        driver.manage().window().setSize(new Dimension(1080, 810));
        driver.manage().window().setSize(new Dimension(1280, 800));
        driver.manage().window().setSize(new Dimension(1366, 636));
        driver.manage().window().setSize(new Dimension(1440, 900));
        driver.manage().window().setSize(new Dimension(1536, 864));
        driver.manage().window().setSize(new Dimension(1600, 900));
        driver.manage().window().setSize(new Dimension(1680, 1050));
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.manage().window().setSize(new Dimension(2560, 1440));
        
		//Mobile Responsive pixels
        driver.manage().window().setSize(new Dimension(360, 640));
        driver.manage().window().setSize(new Dimension(360, 800));
        driver.manage().window().setSize(new Dimension(375, 667));
        driver.manage().window().setSize(new Dimension(384, 640));
        driver.manage().window().setSize(new Dimension(390, 844));
        driver.manage().window().setSize(new Dimension(400, 640));
        driver.manage().window().setSize(new Dimension(400, 640));
        driver.manage().window().setSize(new Dimension(411, 731));
        driver.manage().window().setSize(new Dimension(412, 690));
        driver.manage().window().setSize(new Dimension(414, 736));
        driver.manage().window().setSize(new Dimension(428, 926));
        driver.manage().window().setSize(new Dimension(480, 896));
        driver.manage().window().setSize(new Dimension(540, 720));
        
		//Tablet Responsive pixels
        driver.manage().window().setSize(new Dimension(600, 1024));
        driver.manage().window().setSize(new Dimension(601, 926));
        driver.manage().window().setSize(new Dimension(604, 966));
        driver.manage().window().setSize(new Dimension(720, 1280));
        driver.manage().window().setSize(new Dimension(768, 1024));
        driver.manage().window().setSize(new Dimension(800, 1280));
        driver.manage().window().setSize(new Dimension(810, 1080));
        driver.manage().window().setSize(new Dimension(834, 1112));
        driver.manage().window().setSize(new Dimension(991, 720));
	}
}*/
		//OR
		
		// Responsive screen sizes (Desktop, Mobile, Tablet)
        Dimension[] screenSizes = {
            // Desktop sizes
            new Dimension(1024, 1366),
            new Dimension(1280, 800),
            new Dimension(1366, 768),
            new Dimension(1440, 900),
            new Dimension(1536, 864),
            new Dimension(1600, 900),
            new Dimension(1680, 1050),
            new Dimension(1920, 1080),

            // Mobile sizes
            new Dimension(360, 640),
            new Dimension(375, 667),
            new Dimension(390, 844),
            new Dimension(412, 690),
            new Dimension(428, 926),

            // Tablet sizes
            new Dimension(600, 1024),
            new Dimension(768, 1024),
            new Dimension(800, 1280),
            new Dimension(834, 1112),
            new Dimension(991, 720)
        };

        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (Dimension size : screenSizes) {
            System.out.println("Testing resolution: " + size.width + "x" + size.height);
            driver.manage().window().setSize(size);
            sleep(2000); // Wait for layout to adjust

            // Get total scrollable height
            long scrollHeight = (long) js.executeScript("return document.body.scrollHeight");
            long clientHeight = (long) js.executeScript("return window.innerHeight");
            long scrollPosition = 0;

            // Scroll in steps (e.g., 300px at a time)
            while (scrollPosition + clientHeight < scrollHeight) {
                js.executeScript("window.scrollBy(0, 300);");
                scrollPosition = (long) js.executeScript("return window.scrollY");
                sleep(500); // Wait between scrolls
            }

            // Wait at the bottom
            sleep(2000);

            // Scroll back to top
            js.executeScript("window.scrollTo(0, 0);");
            sleep(2000);
        }

        driver.quit();
    }

    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

