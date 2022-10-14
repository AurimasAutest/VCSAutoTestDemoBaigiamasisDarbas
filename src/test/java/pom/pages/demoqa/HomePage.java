package pom.pages.demoqa;

import pom.pages.Common;
import pom.pages.Locators;

public class HomePage {

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickToOpenElementPage() {
//        Common.clickElement(Locators.Demoqa.Home.menuElement);
        Common.clickElementByAction(Locators.Demoqa.Home.menuElement);
    }
}

//https://demoqa.com/

//*[text()='Elements']

//span[text()='Buttons']

//button[@id='doubleClickBtn']

//button[@id='rightClickBtn']
