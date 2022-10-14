package pom.pages.demoqa;

public class ElementsPage {

    public static void clickToOpenButtonsPage() {
//        Common.clickElement(Locators.Demoqa.Elements.menuButtons);
        pom.pages.Common.clickElementByAction(pom.pages.Locators.Demoqa.Elements.menuButtons);
    }
}
