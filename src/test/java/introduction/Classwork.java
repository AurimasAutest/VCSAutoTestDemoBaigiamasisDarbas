package introduction;

import pom.pages.Locators;

public class Classwork {

    public static void open(String url) {
        pom.pages.Common.openUrl(url);
    }

    public static void enterFullName(String expectedFullName) {
        pom.pages.Common.sendKeysToElement(
                expectedFullName,
                Locators.Demoqa.TextBox.inputFullName
        );
    }

    public static void clickButtonSubmit() {
        pom.pages.Common.clickElement(
                Locators.Demoqa.TextBox.buttonSubmit
        );
    }

    public static String readMessageFullName() {
        return pom.pages.Common.getElementText(
                Locators.Demoqa.TextBox.paragraphName
        );
    }

    public static void enterEmail(String expectedUserEmail) {
        pom.pages.Common.sendKeysToElement(
                expectedUserEmail,
                Locators.Demoqa.TextBox.inputEmail
        );
    }

    public static String readMessageEmail() {
        return pom.pages.Common.getElementText(
                Locators.Demoqa.TextBox.paragraphEmail
        );
    }

    public static void enterCurrentAddress(String expectedCurrentAddress) {
        pom.pages.Common.sendKeysToElement(
                expectedCurrentAddress,
                Locators.Demoqa.TextBox.inputCurrentAddress
        );
    }

    public static String readMessageCurrentAddress() {
        return pom.pages.Common.getElementText(
                Locators.Demoqa.TextBox.paragraphCurrentAddress
        );
    }
}


