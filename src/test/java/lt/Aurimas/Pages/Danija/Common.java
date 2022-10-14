package lt.Aurimas.Pages.Danija;

import lt.Aurimas.Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Common {
    public static void waitForElement(By locator, String loginEmail, String password) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedCondition.attributeContains(locator, loginEmail, password));
    }
}
