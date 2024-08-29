package starter.StepsDefinitions;

import starter.Acciones.LoginSteps;
import starter.Acciones.NavigateSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;



public class LoginStepDefinitions {

    @Steps
    LoginSteps sauceDemoHome;

    @Steps
    NavigateSteps browser;

    @Given("abro el browser en la pagina de SauceDemo")
    public void abro_el_browser_en_la_pagina_de_sauce_demo() {
        browser.openSauceDemoPage();
    }

    @When("ingreso las credenciales de {string} y {string}")
    public void ingreso_las_credenciales_de_y(String strUserName, String strPassword) {
        sauceDemoHome.ingresarCredenciales(strUserName, strPassword);
    }

    @Then("deberia ser redirigido a la URL {string}")
    public void deberia_ser_redirigido_a_la_url(String urlPagina) {
        sauceDemoHome.verificarUrl(urlPagina);
    }



    @Then("deberia ver el mensaje de error {string}")
    public void deberiaVerElMensajeDeError(String mensajeError) {
        sauceDemoHome.verificarMensajeDeError(mensajeError);
    }
}
