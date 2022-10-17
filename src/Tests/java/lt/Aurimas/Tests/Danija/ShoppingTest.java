package lt.Aurimas.Tests.Danija;

import lt.Aurimas.Pages.Danija.LoginPage;
import lt.Aurimas.Pages.Danija.ShoppingPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.tests.TestBase;

public class ShoppingTest {
    public class ShoppingTest extends TestBase {

        @BeforeMethod
        @Override
        public void setUp(){
            super.setUp();
            ShoppingPage.open("https://danija.lt/greitas-uzsakymas");
        }

        @Test
        private void testLoginPositive(){
            String krepselis = "Fila";
            String beRegistracjos = ();
            String apmokejimas = ();

            ShoppingPage.clickLoginIcon(krepselis);
            ShoppingPage.clickLoginIcon(beRegistracjos);
            ShoppingPage.clickLoginIcon(apmokejimas)

        }
    }
}
