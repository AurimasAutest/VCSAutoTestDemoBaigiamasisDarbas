package introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumDemo {

    @Test
    public void testDemoWeDriver() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.vilniuscoding.lt/");

    }
    @Test
    public void testClickKontaktai() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.vilniuscoding.lt/");

        WebElement linkKontaktai = driver.findElement(By.id("menu-item-3969"));
        linkKontaktai.click();

        try {
            Thread.sleep(5000);

            driver.manage().window().maximize();
            Thread.sleep(5000);

        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();

    }