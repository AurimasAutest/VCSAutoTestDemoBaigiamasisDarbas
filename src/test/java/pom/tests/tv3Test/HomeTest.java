package pom.tests.tv3Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends pom.tests.TestBase {

    @BeforeMethod
    @Override
    public void setUp(){
    super.setUp();
    pom.pages.demoqa.HomePage.open("https://www.tv3.lt/");
    }

    @Test
    private void test1(){

    }
}

//public static void waitForElementWithVisibilityChange(By locator) {
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(8));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//    }
////div[@id='qc-cmp2-ui']//button[@mode='primary']