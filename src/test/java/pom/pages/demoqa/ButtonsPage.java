package pom.pages.demoqa;

import pom.pages.Common;
import pom.pages.Locators;

public class ButtonsPage {

    public static void sleep(int millis) {
        Common.sleep(millis);
    }

    public static void performDoubleClick() {
        Common.doubleClickByActions(
                Locators.Demoqa.Buttons.buttonDoubleClick
        );
    }

    public static String readMessageOfDoubleClick() {
        return Common.getElementText(
                Locators.Demoqa.Buttons.paragraphDoubleClick
        );
    }

    public static void performRightClick() {
        Common.rightClickByActions(Locators.Demoqa.Buttons.buttonRightClick);
    }

    public static String readMessageOfRightClick() {
        return Common.getElementText(Locators.Demoqa.Buttons.paragraphRightClick);
    }
}
