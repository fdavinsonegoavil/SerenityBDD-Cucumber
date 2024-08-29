package starter.PageObject;


import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class SauceDemoHome extends PageObject {
    public static final By USERNAME_TXT = By.id("user-name");
    public static final By PASSWORD_TXT = By.id("password");
    public static final By LOGIN_BTN = By.id("login-button");
    public static final By CREDENCIALES_ERRONEAS_LBL = By.cssSelector("h3[data-test='error']");

    /*
    public void login(String strUserName, String strPassword) {
        txtUserName.type(strUserName);
        txtPassword.type(strPassword);
        btnLogin.click();
    }

    public String getCurrentUrl() {
        return getDriver().getCurrentUrl();
    }

     */
}
