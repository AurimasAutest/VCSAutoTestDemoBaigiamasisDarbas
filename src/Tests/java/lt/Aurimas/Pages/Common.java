package lt.Aurimas.Pages;

import lt.Aurimas.Utils.Driver;

public class Common {
    public static void setUp() {
        Driver.setDriver();
    }

    public static void openUrl(String url) {
        Driver.openUrl(url);
    }

    public static void close() {
        Driver.close();
    }

    public static void login(String loginEmail) {

    }

    public static void click(String expectedText) {

    }

    public static void Icon(String krepselis) {

    }
}
