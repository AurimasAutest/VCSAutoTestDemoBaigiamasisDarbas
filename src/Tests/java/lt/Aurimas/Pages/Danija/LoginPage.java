package lt.Aurimas.Pages.Danija;

import lt.Aurimas.Pages.Locators;
import pom.pages.Common;

public class LoginPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickLoginIcon() {
        Common.clickElement(Locators.Danija.Login.inputEmail);

        Common.clickElement(Locators.Danija.Login.inputPassword);

        Common.clickElement(Locators.Danija.Login.buttonLogin);
    }

    public static void close() {
    }
}
