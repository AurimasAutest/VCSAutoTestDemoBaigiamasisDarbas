package lt.Aurimas.Pages.Danija;

import lt.Aurimas.Pages.Locators;
import pom.pages.Common;

public class RegistrationPage {
    public static void open(String url) {
        Common.openUrl(url);
    }
    public static void clickLoginIcon() {
        Common.clickElement(Locators.Danija.Registration.inputEmail);

        Common.clickElement(Locators.Danija.Login.inputPassword);

        Common.clickElement(Locators.Danija.Login.buttonLogin);
}
