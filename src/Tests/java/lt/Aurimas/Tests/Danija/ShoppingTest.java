package lt.Aurimas.Tests.Danija;

import lt.Aurimas.Pages.Danija.ShoppingPage;
import lt.Aurimas.Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


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
            String buttonbeRegistracjos = "";
            String buttonapmokejimas = "";

            ShoppingPage.clickLoginIcon(krepselis);
            ShoppingPage.clickLoginIcon(buttonbeRegistracjos);
            ShoppingPage.clickLoginIcon(buttonapmokejimas);

            Assert.assertEquals(krepselis, buttonbeRegistracjos, buttonapmokejimas);
        }
    }
}
