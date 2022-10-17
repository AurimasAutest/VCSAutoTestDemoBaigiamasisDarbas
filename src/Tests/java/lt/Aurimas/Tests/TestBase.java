package lt.Aurimas.Tests;

import lt.Aurimas.Pages.Common;
import lt.Aurimas.Pages.Danija.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    @BeforeMethod
     public void setUp(){
        Common.setUp();
        }

    @AfterMethod
    private void tearDown(){
        LoginPage.close();

    }
}
