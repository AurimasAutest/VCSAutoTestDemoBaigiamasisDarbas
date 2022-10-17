package lt.Aurimas.Pages.Danija;

import lt.Aurimas.Pages.Common;

public class ShoppingPage {
    public static void setUp(){

        Common.setUp();
    }
    public static void open(String url) {

        Common.openUrl(url);
    }
    public static void close() {

        Common.close();
    }

    public static void clickLoginIcon(String krepselis) {
        Common.Icon(krepselis);

    }
}
