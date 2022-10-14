package pom.pages.tv3Pages;

public class HomePages {

    public static void open(String url) {
        pom.pages.Common.openUrl(url);
    }

    public static void acceptPrivacyConfirmation() {
//        pom.pages.Common.waitForElementWithVisibilityChange(pom.pages.Locators.Tv3.Home.formPrivacyConfirmation);
//        pom.pages.Common.clickElement(pom.pages.Locators.Tv3.Home.buttonConfirm);
    }
}