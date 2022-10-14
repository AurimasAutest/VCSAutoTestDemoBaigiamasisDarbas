package pom.tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.demoqa.CheckboxDemoPage;
import pom.tests.TestBase;

public class CheckboxDemoTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        CheckboxDemoPage.open("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    @Test
    private void testSingleCheckboxDemo() {
        String expectedMessage = "Success - Check box is checked";
        String actualMessage = "";

        CheckboxDemoPage.clickSingleCheckbox();
        actualMessage = CheckboxDemoPage.readMessage();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    private void testMultipleCheckboxStatusWithCheckedAll() {

        String expectedButtonText = "Uncheck All";
        String actualButtonText = "";
        boolean expectedCheckboxStatus = true;
        boolean actualCheckboxStatus = false;

        CheckboxDemoPage.clickButtonCheckAll();

        actualButtonText = CheckboxDemoPage.readValueOfUncheckAllButton();

        Assert.assertEquals(actualButtonText, expectedButtonText);

        actualCheckboxStatus = CheckboxDemoPage.checkStatusesOfSelectedCheckboxes(expectedCheckboxStatus);

//        Assert.assertEquals(actualCheckboxStatus, expectedCheckboxStatus);
        Assert.assertTrue(actualCheckboxStatus);
    }

    @Test
    private void testMultipleCheckboxStatusWithUncheckedAll() {
        String expectedButtonText = "Check All";
        String actualButtonText = "";
        boolean expectedCheckboxStatus = false;
        boolean actualCheckboxStatus = false;

        CheckboxDemoPage.clickButtonCheckAll();
        CheckboxDemoPage.clickButtonCheckAll();

        actualButtonText = CheckboxDemoPage.readValueOfUncheckAllButton();

        Assert.assertEquals(actualButtonText, expectedButtonText);

        actualCheckboxStatus = CheckboxDemoPage.checkStatusesOfSelectedCheckboxes(expectedCheckboxStatus);

//        Assert.assertEquals(!actualCheckboxStatus, expectedCheckboxStatus);
        Assert.assertTrue(actualCheckboxStatus);
    }
}
