package pom.pages.demoqa;

import pom.pages.Common;
import pom.pages.Locators;

public class TextBoxPage {

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void enterFullName(String expectedFullName) {
        Common.sendKeysToElement(
                expectedFullName,
                Locators.Demoqa.TextBox.inputFullName
        );
    }

    public static void clickButtonSubmit() {
        Common.clickElement(
                Locators.Demoqa.TextBox.buttonSubmit
        );
    }

    public static String readMessageFullName() {
        return Common.getElementText(
                Locators.Demoqa.TextBox.paragraphName
        );
    }

    public static void enterEmail(String expectedUserEmail) {
        Common.sendKeysToElement(
                expectedUserEmail,
                Locators.Demoqa.TextBox.inputEmail
        );
    }

    public static String readMessageEmail() {
        return Common.getElementText(
                Locators.Demoqa.TextBox.paragraphEmail
        );
    }

    public static void enterCurrentAddress(String expectedCurrentAddress) {
        Common.sendKeysToElement(
                expectedCurrentAddress,
                Locators.Demoqa.TextBox.inputCurrentAddress
        );
    }

    public static String readMessageCurrentAddress() {
        return Common.getElementText(
                Locators.Demoqa.TextBox.paragraphCurrentAddress
        );
    }
}
