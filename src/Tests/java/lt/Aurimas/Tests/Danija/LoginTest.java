package lt.Aurimas.Tests.Danija;

import lt.Aurimas.Pages.Danija.LoginPage;
import lt.Aurimas.Tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp(){
        super.setUp();
        LoginPage.open("https://danija.lt/prisijungimas?login=1");
    }

    @Test
    private void testLoginPositive(){
        String loginEmail = "aurimas.a.morkunas@gmail.com";
        String password = "Like123+";

        LoginPage.clickElement(loginEmail);
        LoginPage.clickElement(password);

        Assert.assertEquals(loginEmail, password);
    }
//    WebElement inputUserEmail =
//            driver.findElement(By.xpath("//*[@id='userEmail']"));
//        inputUserEmail.sendKeys(expectedUserEmail);
//
//    WebElement buttonSubmit = driver.findElement(By.xpath("//*[@id='submit']"));
//        buttonSubmit.click();
//
//    WebElement textUserEmail = driver.findElement(By.xpath("//*[@id='email']"));
//    actualUserEmail = textUserEmail.getText();
}
