package pom.tests.demoqa;

import pom.pages.demoqa.ButtonsPage;
import pom.pages.demoqa.ElementsPage;
import pom.pages.demoqa.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.tests.TestBase;

public class ButtonsTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
//        TODO:PRIDETI urL
        HomePage.open("");
        HomePage.clickToOpenElementPage();
        ElementsPage.clickToOpenButtonsPage();
    }

    @Test
    private void testDoubleClick() {
        String expectedMessage = "You have done a double click";
        String actualMessage;

        ButtonsPage.performDoubleClick();
        actualMessage = ButtonsPage.readMessageOfDoubleClick();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    private void testRightClick() {
        String expectedMessage = "You have done a right click";
        String actualMessage;

        ButtonsPage.performRightClick();
        actualMessage = ButtonsPage.readMessageOfRightClick();

        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
