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
}
