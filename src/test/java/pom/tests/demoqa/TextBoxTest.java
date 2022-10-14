package pom.tests.demoqa;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.demoqa.TextBoxPage;
import pom.tests.TestBase;

public class TextBoxTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        TextBoxPage.open("https://demoqa.com/text-box");
    }

    @Test
    private void testInputFullName() {
        String expectedFullName = "Aurimas Morkunas";
        String actualFullName = null;

        TextBoxPage.enterFullName(expectedFullName); // Common.sendKeys ....
        TextBoxPage.clickButtonSubmit();
        actualFullName = TextBoxPage.readMessageFullName();

        Assert.assertTrue(
                actualFullName.contains(expectedFullName),
                String.format(
                        "Actual [%s]; Expected [%s]",
                        actualFullName,
                        expectedFullName
                )
        );
    }

    @Test
    private void testInputEmail() {
        String expectedUserEmail = "aurimas.a.morkunas@gmail.com";
        String actualUserEmail = null;

        TextBoxPage.enterEmail(expectedUserEmail);
        TextBoxPage.clickButtonSubmit();
        actualUserEmail = TextBoxPage.readMessageEmail();

        Assert.assertTrue(
                actualUserEmail.contains(expectedUserEmail),
                String.format(
                        "Actual [%s]; Expected [%s]",
                        actualUserEmail,
                        expectedUserEmail
                )
        );
    }

    @Test
    private void testInputCurrentAddress() {
        String expectedCurrentAddress = "Vilniaus str.";
        String actualCurrentAddress = null;

        TextBoxPage.enterCurrentAddress(expectedCurrentAddress);
        TextBoxPage.clickButtonSubmit();
        actualCurrentAddress = TextBoxPage.readMessageCurrentAddress();

        Assert.assertTrue(
                actualCurrentAddress.contains(expectedCurrentAddress),
                String.format(
                        "Actual [%s]; Expected [%s]",
                        actualCurrentAddress,
                        expectedCurrentAddress
                )
        );
    }
}
