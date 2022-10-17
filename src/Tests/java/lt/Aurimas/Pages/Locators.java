package lt.Aurimas.Pages;

import org.openqa.selenium.By;

public class Locators {
    public static class Danija {

        public static class Login{
            public static By inputEmail = By.xpath("//*[@id='login_form']/label[1]/input");

            public static By inputPassword = By.xpath("//*[@id='login_form']/label[2]/input");

            public static By buttonLogin = By.xpath("//*[@id='SubmitLogin']");
        }
        public static class Registration {

            public static By inputName = By.xpath("//*[@id='authentication']/main/div/div/form/div/label[4]/input");

            public static By inputLastName = By.xpath("//*[@id='authentication']/main/div/div/form/div/label[5]/input");

            public static By buttonRegistration = By.xpath("//*[@id='submitAccount']");
        }
        public static class Shopping {
            public static By inputkrepselis = By.xpath("//*['@id=product']");

            public static By inputbeRegistracijos =
                    By.xpath("//*[@id='order-opc']/main/div/div/div[2]/form/label[2]/div/label[1]/span");

            public static By buttonapmoketi = By.xpath("//*[@id='paymentText']");

    }
}
