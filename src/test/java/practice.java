import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;


public class practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.nike.com/");
        WebElement s = driver.findElement(By.xpath("//*[@id='VisualSearchInput']"));
        s.sendKeys("Air Jordan 1 Zoom Comfort 2");
        WebElement n = driver.findElement(By.xpath("//*[@id='VisualSearchProduct-0']/figcaption/h4"));
        n.click();


    }
}
