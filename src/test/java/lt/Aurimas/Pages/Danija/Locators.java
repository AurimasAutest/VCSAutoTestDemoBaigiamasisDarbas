package lt.Aurimas.Pages.Danija;

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
    }
}
