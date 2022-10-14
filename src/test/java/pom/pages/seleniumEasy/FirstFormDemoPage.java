package pom.pages.seleniumEasy;

import pom.pages.Common;
import pom.pages.Locators;

public class FirstFormDemoPage {

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void sleep(int millis) {
        Common.sleep(millis);
    }

    public static void enterFullName(String expectedFullName) {
        Common.sendKeysToElement(
                expectedFullName,
                Locators.SeleniumEasy.FirstFormDemo.inputFullName
        );
    }

    public static void clickButtonShowMessage() {
        Common.clickElement(
                Locators.SeleniumEasy.FirstFormDemo.buttonShowMessage
        );
    }

    public static String readMessage() {
        return Common.getElementText(
                Locators.SeleniumEasy.FirstFormDemo.spanDisplay
        );
    }

    public static void enterValueA(String value) {
        Common.sendKeysToElement(
                value,
                Locators.SeleniumEasy.FirstFormDemo.inputValueA
        );
    }

    public static void enterValueB(String value) {
        Common.sendKeysToElement(
                value,
                Locators.SeleniumEasy.FirstFormDemo.inputValueB
        );
    }

    public static void clickButtonGetTotal() {
        Common.clickElement(
                Locators.SeleniumEasy.FirstFormDemo.buttonGetTotal
        );
    }

    public static String readSumTotal() {
        return Common.getElementText(
                Locators.SeleniumEasy.FirstFormDemo.paragraphSumTotal
        );
    }
}