package pom.pages.seleniumEasy;

import pom.pages.Common;
import pom.pages.Locators;

public class SelectDropdownDemoPage {

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickDayFromDropdown(String value) {
        Common.selectOptionByValue(
                Locators.SeleniumEasy.SelectDropdownDemo.selectDayOfWeek,
                value
        );
    }

    public static String readMessageOfListDropdown() {
        return Common.getElementText(
                Locators.SeleniumEasy.SelectDropdownDemo.paragraphDayOfWeek
        );
    }
}
