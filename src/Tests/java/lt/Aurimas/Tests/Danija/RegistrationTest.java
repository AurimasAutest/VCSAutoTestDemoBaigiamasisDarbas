package lt.Aurimas.Tests.Danija;

import lt.Aurimas.Pages.Danija.RegistrationPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.tests.TestBase;

public class RegistrationTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        RegistrationPage.open("https://danija.lt/prisijungimas?email=aurimas.a.morkunas%40gmail.com");
    }

    @Test
    public void registerWithPositiveInfo()
        String expectedText = "NewRegistration";
        String actualText = "";



//        RegistrationPage.inputName("Aurimas");
//        RegistrationPage.inputLastName("Morkunas");
//        RegistrationPage.clickButtonRegistration();

}
