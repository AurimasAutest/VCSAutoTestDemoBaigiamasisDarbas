package pom.tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.seleniumEasy.AlertBoxDemoPage;
import pom.tests.TestBase;

public class AlertBoxDemoTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        AlertBoxDemoPage.open("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
    }

    @Test
    private void testToCloseAlertBox() {

        AlertBoxDemoPage.clickButtonToOpenAlertBox();
        AlertBoxDemoPage.sleep(1500);
        AlertBoxDemoPage.clickToCloseAlertBox();
        AlertBoxDemoPage.sleep(1500);
    }

    @Test
    private void testToAcceptConfirmBox() {
        String expectedMessage = "OK";
        String actualMessage;

        AlertBoxDemoPage.clickButtonToOpenConfirmBox();
        AlertBoxDemoPage.clickAcceptConfirmBox();
        actualMessage = AlertBoxDemoPage.readMessageFromConfirmBox();

        Assert.assertTrue(actualMessage.contains(expectedMessage));
        AlertBoxDemoPage.sleep(2000);
    }

    @Test
    private void testToCancelConfirmBox() {
        String expectedMessage = "Cancel";
        String actualMessage;

        AlertBoxDemoPage.clickButtonToOpenConfirmBox();
        AlertBoxDemoPage.clickCancelConfirmBox();
        actualMessage = AlertBoxDemoPage.readMessageFromConfirmBox();

        Assert.assertTrue(actualMessage.contains(expectedMessage));
        AlertBoxDemoPage.sleep(2000);
    }

    @Test
    private void testSendKeysToAlertBox() {
        String expectedMessage = "Aurimas";
        String actualMessage;

        AlertBoxDemoPage.clickButtonToOpenAlertBoxToAddText();
        AlertBoxDemoPage.sendMessageToAlertBox(expectedMessage);
        AlertBoxDemoPage.clickToAcceptAlertBox();
        actualMessage = AlertBoxDemoPage.readMessageFromAlertBox();

        Assert.assertTrue(actualMessage.contains(expectedMessage));
        AlertBoxDemoPage.sleep(2000);
    }
}

//button[@class='btn btn-default']
//button[@onclick='myConfirmFunction()']
//*[@id="confirm-demo"]


//public static By buttonDisplayAlertBox = By.xpath("//button[@class='btn btn-default']");
//public static By buttonDisplayConfirmBox = By.xpath("//button[@onclick='myConfirmFunction()']");

//public static Alert getAlert(){
//        return Driver.getDriver().switchTo().alert();
//    }
//
//    public static void acceptAlert() {
//        getAlert().accept();
//    }

// public static By paragraphConfirmBox = By.xpath("//*[@id='confirm-demo']");
// git rm -r -f --cached .idea