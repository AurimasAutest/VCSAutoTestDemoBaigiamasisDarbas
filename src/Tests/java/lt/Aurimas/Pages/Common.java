package lt.Aurimas.Pages;

import lt.Aurimas.Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Common {
    public static void setUpDriver() {
        Driver.setDriver();
    }
    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void closeDriver() {
        Driver.close();
    }
    }



