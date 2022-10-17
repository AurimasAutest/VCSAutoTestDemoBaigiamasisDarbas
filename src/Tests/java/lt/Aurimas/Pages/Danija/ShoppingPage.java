package lt.Aurimas.Pages.Danija;

import lt.Aurimas.Pages.Locators;
import pom.pages.Common;

public class ShoppingPage {
    public static void open(String url) {
        Common.openUrl(url);
    }
    public static void clickLoginIcon() {
        Common.clickElement(Locators.Danija.Login.krepselis);

        Common.clickElement(Locators.Danija.Login.beRegistracijos);

        Common.clickElement(Locators.Danija.Login.apmokejimas);
}
