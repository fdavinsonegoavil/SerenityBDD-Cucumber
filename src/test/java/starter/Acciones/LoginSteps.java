package starter.Acciones;

import starter.PageObject.SauceDemoHome;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import static org.junit.Assert.assertEquals;
public class LoginSteps extends UIInteractionSteps {

    @Step("El usuario ingresa sus credenciales '{0}' '{1}'")
    public void ingresarCredenciales(String strUserName, String strPassword){
        find(SauceDemoHome.USERNAME_TXT).sendKeys(strUserName);
        find(SauceDemoHome.PASSWORD_TXT).sendKeys(strPassword);
        find(SauceDemoHome.LOGIN_BTN).click();
        waitFor(5).seconds();
    }

    @Step("El usuario verfica el resultado de la URL '{0}'")
    public void verificarUrl(String strUrlActual){
        String url = getDriver().getCurrentUrl();
        assertEquals(url,strUrlActual);
    }
    @Step("El usuario ingreso credenciales erroneas y visualiza el mensaje '{0}'")
    public void verificarMensajeDeError(String mensajeError) {
        String errorInline = find(SauceDemoHome.CREDENCIALES_ERRONEAS_LBL).getText();
        assertEquals(errorInline,mensajeError);
    }
}
