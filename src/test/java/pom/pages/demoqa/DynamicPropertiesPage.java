package pom.pages.demoqa;

import pom.pages.Common;
import pom.pages.Locators;

public class DynamicPropertiesPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickButtonEnabledAfterSomeTime() {
//        Common.waitForElementToBeClickable(Locators.Demoqa.DynamicProperties.buttonEnableAfter);
//        Common.clickElement(Locators.Demoqa.DynamicProperties.buttonEnableAfter);
    }

    public static void clickButtonAfterColorChange() {
        String attributeName = "class";
        String attributeValue = "text-danger";

//        Common.waitForElementWithChangeColorAfter(
//                Locators.Demoqa.DynamicProperties.buttonColorChange,
//                attributeName,
//                attributeValue
//        );
//        Common.clickElement(Locators.Demoqa.DynamicProperties.buttonColorChange);
    }

    public static void clickButtonAfterVisibleChange() {
//        Common.waitForElementWithVisibilityChange(Locators.Demoqa.DynamicProperties.buttonVisibleAfter);
//        Common.clickElement(Locators.Demoqa.DynamicProperties.buttonVisibleAfter);
    }
}
