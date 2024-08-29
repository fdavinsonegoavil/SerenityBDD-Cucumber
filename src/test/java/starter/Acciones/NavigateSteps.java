package starter.Acciones;

import starter.PageObject.SauceDemoHome;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class NavigateSteps extends UIInteractionSteps {
    SauceDemoHome sauceDemo;
    @Step("El usuario abre la pagina de saucedemo")
    public void openSauceDemoPage(){
        sauceDemo.open();
    }
}
