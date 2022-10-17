package lt.Aurimas.Pages.Danija;

import lt.Aurimas.Pages.Common;

public class RegistrationPage {
    public static void setUp(){

        Common.setUp();
    }
    public static void open(String url) {

        Common.openUrl(url);
    }
    public static void close() {

        Common.close();
    }

    public static void clickLoginIcon(String expectedText) {
        Common.click(expectedText);

    }

    public static void clickButtonRegistration() {
        Common.click();

    }
}
