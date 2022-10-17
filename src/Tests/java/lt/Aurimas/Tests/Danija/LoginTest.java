package lt.Aurimas.Tests.Danija;

import lt.Aurimas.Pages.Danija.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.tests.TestBase;

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

        LoginPage.clickLoginIcon(loginEmail);
        LoginPage.clickLoginIcon(password);
    }
}
