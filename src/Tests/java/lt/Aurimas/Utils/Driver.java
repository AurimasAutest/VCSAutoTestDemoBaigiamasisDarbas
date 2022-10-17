package lt.Aurimas.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;


public class Driver {
    WebDriver driver;
    @BeforeMethod
    private void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://danija.lt/prisijungimas?login=1");
        driver.get("https://danija.lt/prisijungimas?email=aurimas.a.morkunas%40gmail.com");
        driver.get("https://danija.lt/greitas-uzsakymas");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @AfterMethod
    private void close() {
        driver.quit();
    }
}
